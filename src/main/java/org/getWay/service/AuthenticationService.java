package org.getWay.service;

import org.getWay.dto.LoginDto;
import org.getWay.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "AUTHENTICATION")
public interface AuthenticationService {
    @PostMapping(path = "/login")
    ResponseEntity<String> login(@RequestBody LoginDto loginDto);

    @GetMapping(path = "/api/user")
    List<User> listUser();

}
