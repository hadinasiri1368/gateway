package org.getWay.api;

import org.getWay.dto.LoginDto;
import org.getWay.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationAPI {
    @Autowired
    AuthenticationService authenticationService;

    @PostMapping(path = "/login")
    ResponseEntity<String> login(@RequestBody LoginDto loginDto) {
        return authenticationService.login(loginDto);
    }
}
