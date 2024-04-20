package org.gateway.config;

import org.gateway.filter.ExceptionHandler;
import org.gateway.filter.LogFilter;
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

    @Bean
    public FilterRegistrationBean<LogFilter> loggingFilter() {
        FilterRegistrationBean<LogFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new LogFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
