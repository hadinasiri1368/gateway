package org.gateway.filter;

import org.gateway.common.CommonUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class CustomRequestHeaderFilter  implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        if (true) {
//            throw new RuntimeException("Too many requests");
//        }
        return chain.filter(exchange.mutate()
                .request(exchange
                        .getRequest().mutate()
                        .header("X-UUID", CommonUtils.generateUUID().toString()).build())
                .build());
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
