package org.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRoleDto {
    private Long id;
    private Long roleId;
    private Long userId;
}
