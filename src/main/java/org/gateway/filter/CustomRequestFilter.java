package org.gateway.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.gateway.common.CommonUtils;
import org.springframework.core.annotation.Order;

import java.io.IOException;

@Order(1)
public class CustomRequestFilter implements Filter {
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        MutableHttpServletRequest mutableRequest = new MutableHttpServletRequest(req);
        mutableRequest.putHeader("X-UUID", CommonUtils.generateUUID().toString());
        chain.doFilter(mutableRequest, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
}
