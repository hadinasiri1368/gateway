package org.gateway.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.gateway.common.CommonUtils;
import org.gateway.model.ApiData;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
//log per request , when you dont use spring boot gateway
//@Order(2)
@Slf4j
public class LogFilter extends OncePerRequestFilter implements Filter {
    protected void doFilterInternal_(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        ContentCachingRequestWrapper contentCachingRequestWrapper = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper contentCachingResponseWrapper = new ContentCachingResponseWrapper(response);
        String uuid = request.getHeader("X-UUID");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date startDate = new Date();
        filterChain.doFilter(contentCachingRequestWrapper, contentCachingResponseWrapper);
        Date endDate = new Date();


        log.info("========================================================================================================================");
        log.info(String.format("Starting api ---Start Date : %s", dateFormat.format(startDate)));
        List<ApiData> apiData = CommonUtils.getRequestInfo(request, contentCachingRequestWrapper, contentCachingResponseWrapper);

        if (!CommonUtils.isNull(apiData)) {
            for (ApiData item : apiData) {
                log.info(item.key());
                log.info(item.value());
                log.info("------------------------------------------------------------------");
            }
        }


        log.info(String.format("Ending api ---End Date : %s", dateFormat.format(endDate)));
        log.info("========================================================================================================================");

        contentCachingResponseWrapper.copyBodyToResponse();
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        ContentCachingRequestWrapper contentCachingRequestWrapper = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper contentCachingResponseWrapper = new ContentCachingResponseWrapper(response);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date startDate = new Date();
        filterChain.doFilter(contentCachingRequestWrapper, contentCachingResponseWrapper);
        Date endDate = new Date();
        log.info(String.format("RequestURL:   %s   Start Date : %s  End Date : %s", request.getRequestURL(), dateFormat.format(startDate), dateFormat.format(endDate)));
        List<ApiData> apiData = CommonUtils.getRequestInfo(request, contentCachingRequestWrapper, contentCachingResponseWrapper);
        if (!CommonUtils.isNull(apiData)) {
            for (ApiData item : apiData) {
                log.info(String.format("%s:   %s", item.key(), item.value()));
            }
        }
        log.info("========================================================================================================================");
        contentCachingResponseWrapper.copyBodyToResponse();
    }
}
