package org.getWay.config;

import org.getWay.filter.ExceptionHandler;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<ExceptionHandler> checkPermissionFilter() {
        FilterRegistrationBean<ExceptionHandler> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new ExceptionHandler());
        registrationBean.addUrlPatterns("/api/*");
        return registrationBean;
    }
}
