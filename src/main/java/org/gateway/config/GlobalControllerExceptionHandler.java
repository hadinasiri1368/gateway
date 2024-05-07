package org.gateway.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.gateway.common.CommonUtils;
import org.gateway.dto.ExceptionDto;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
@Slf4j
public class GlobalControllerExceptionHandler {
    @ExceptionHandler(value = FeignException.Unauthorized.class)
    public ResponseEntity<ExceptionDto> response(FeignException.Unauthorized e, HttpServletRequest request) {
        ExceptionDto exceptionDto = CommonUtils.getException(e);
        log.info("RequestURL:" + request.getRequestURL() + "  UUID=" + request.getHeader("X-UUID") + "  ServiceUnauthorized:" + (CommonUtils.isNull(exceptionDto) ? e.getMessage().split("]:")[1] : exceptionDto.getErrorMessage()));
        return new ResponseEntity<>(ExceptionDto.builder()
                .errorMessage(CommonUtils.isNull(exceptionDto) ? "unauthorized exception" : exceptionDto.getErrorMessage())
                .errorCode(HttpStatus.UNAUTHORIZED.value())
                .uuid(request.getHeader("X-UUID"))
                .errorStatus(HttpStatus.UNAUTHORIZED.value())
                .build(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(value = FeignException.ServiceUnavailable.class)
    public ResponseEntity<ExceptionDto> response(FeignException.ServiceUnavailable e, HttpServletRequest request) {
        ExceptionDto exceptionDto = CommonUtils.getException(e);
        log.info("RequestURL:" + request.getRequestURL() + "  UUID=" + request.getHeader("X-UUID") + "  ServiceUnavailable:" + (CommonUtils.isNull(exceptionDto) ? e.getMessage().split("]:")[1] : exceptionDto.getErrorMessage()));
        return new ResponseEntity<>(ExceptionDto.builder()
                .errorMessage(CommonUtils.isNull(exceptionDto) ? "internal server error" : exceptionDto.getErrorMessage())
                .errorCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .uuid(request.getHeader("X-UUID"))
                .errorStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = FeignException.InternalServerError.class)
    public ResponseEntity<ExceptionDto> response(FeignException.InternalServerError e, HttpServletRequest request) {
        ExceptionDto exceptionDto = CommonUtils.getException(e);
        log.info("RequestURL:" + request.getRequestURL() + "  UUID=" + request.getHeader("X-UUID") + "  ServiceInternalServerError:" + (CommonUtils.isNull(exceptionDto) ? e.getMessage().split("]:")[1] : exceptionDto.getErrorMessage()));
        return new ResponseEntity<>(ExceptionDto.builder()
                .errorMessage(CommonUtils.isNull(exceptionDto) ? "unauthorized exception" : exceptionDto.getErrorMessage())
                .errorCode(CommonUtils.isNull(exceptionDto) ? HttpStatus.UNAUTHORIZED.value() : exceptionDto.getErrorCode())
                .uuid(request.getHeader("X-UUID"))
                .errorStatus(CommonUtils.isNull(exceptionDto) ? HttpStatus.UNAUTHORIZED.value() : HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build(), CommonUtils.isNull(exceptionDto) ? HttpStatus.UNAUTHORIZED : HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
