package org.gateway.config;

import org.gateway.filter.CustomRequestFilter;
import org.gateway.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<LogFilter> loggingFilter() {
        FilterRegistrationBean<LogFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new LogFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<CustomRequestFilter> setHeader() {
        FilterRegistrationBean<CustomRequestFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new CustomRequestFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

}
