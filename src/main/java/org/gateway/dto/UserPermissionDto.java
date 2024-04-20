package org.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserPermissionDto {
    private Long id;
    private Long permissionId;
    private Long userId;
}
