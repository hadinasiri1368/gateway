package org.gateway.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Getter
@Setter
@AllArgsConstructor
public class LoginDto {
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    @Size(message = "userType should between 1 and 3", min = 1, max = 3)
    @Digits(message = "userType should contain 1 digits.", fraction = 0, integer = 1)
    private Integer userType;
}
