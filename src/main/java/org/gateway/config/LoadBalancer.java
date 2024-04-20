package org.gateway.config;

import feign.Request;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.openfeign.loadbalancer.LoadBalancerFeignRequestTransformer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.*;

@Configuration
public class LoadBalancer {
    @Bean
    public LoadBalancerFeignRequestTransformer transformer() {
        return new LoadBalancerFeignRequestTransformer() {
            @Override
            public Request transformRequest(Request request, ServiceInstance instance) {
                ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                HttpServletRequest httpServletRequest = attrs.getRequest();
                Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
                Map<String, Collection<String>> headers = new HashMap<>();
                if (headerNames != null) {
                    while (headerNames.hasMoreElements()) {
                        String name = headerNames.nextElement();
                        String value = httpServletRequest.getHeader(name);
                        headers.put(name, Collections.singletonList(value));
                    }
                }
                return Request.create(request.httpMethod(), request.url(), headers, request.body(), request.charset(),
                        request.requestTemplate());
            }
        };
    }
}
