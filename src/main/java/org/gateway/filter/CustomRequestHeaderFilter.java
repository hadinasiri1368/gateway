package org.gateway.filter;

import org.gateway.common.CommonUtils;
import org.gateway.exception.RequestLimitExceededException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Component
public class CustomRequestHeaderFilter implements GlobalFilter, Ordered {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Value("${redis.limit}")
    private Integer limit;
    @Value("${redis.time-interval-in-seconds}")
    private Integer timeInterval;
    @Value("${redis.excluded-endpoints}")
    private String excludedEndpoints;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String clientIp = exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();
        String endpoint = exchange.getRequest().getURI().getPath();
        String key = clientIp + ":" + endpoint;
        if (isAllowed(key, exchange.getRequest())) {
            return chain.filter(exchange.mutate()
                    .request(exchange
                            .getRequest().mutate()
                            .header("X-UUID", CommonUtils.generateUUID().toString()).build())
                    .build());
        } else {
            throw new RequestLimitExceededException("2");
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }

    public boolean isAllowed(String key, ServerHttpRequest request) {
        String[] paths = excludedEndpoints.split(",");
        for (String path : paths) {
            if (request.getURI().toString().contains(path)) {
                return true;
            }
        }
        String redisKey = "rate_limiter:" + key;
        Long currentCount = redisTemplate.opsForValue().increment(redisKey);

        if (currentCount == 1) {
            redisTemplate.expire(redisKey, Duration.ofSeconds(timeInterval));
        }
        return currentCount <= limit;
    }
}
