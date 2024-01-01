package org.getWay.service;

import org.getWay.dto.LoginDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "AUTHENTICATION")
public interface AuthenticationService {
    @PostMapping(path = "/login")
    ResponseEntity<String> login(@RequestBody LoginDto loginDto);

}
