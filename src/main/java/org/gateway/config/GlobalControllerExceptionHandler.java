package org.gateway.config;

import lombok.extern.slf4j.Slf4j;
import org.gateway.dto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
@Slf4j
public class GlobalControllerExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ExceptionDto> response(Exception e) {

        return new ResponseEntity<>(ExceptionDto.builder()
                .errorMessage("Service Unavailable")
                .errorCode(HttpStatus.SERVICE_UNAVAILABLE.value())
                .errorStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
                .build(), HttpStatus.SERVICE_UNAVAILABLE);
    }
}
