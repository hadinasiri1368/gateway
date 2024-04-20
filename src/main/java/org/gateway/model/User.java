package org.gateway.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private Long id;
    private String username;
    private String password;
    private Boolean isAdmin;
    private Boolean isActive;
    private Long personId;
}
