package org.gateway.service;

import org.gateway.dto.*;
import org.gateway.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "AUTHENTICATION")
public interface AuthenticationService {
    @PostMapping(path = "/login")
    ResponseEntity<LoginData> login(@RequestBody LoginDto loginDto);

    @GetMapping(path = "/logout")
    ResponseEntity<String> logout();

    @GetMapping(path = "/getUserId")
    ResponseEntity<String> getUserId(@RequestParam("token") String token);

    @GetMapping(path = "/getUser")
    ResponseEntity<Map> getUserObject(@RequestParam("token") String token);

    @GetMapping(path = "/api/user")
    List<User> listUser();

    @GetMapping(path = "/api/userPerson")
    List<UserPersonDto> userPerson();

    @PostMapping(path = "/api/user/add")
    Long addUser(@RequestBody User user);

    @PutMapping(path = "/api/user/edit")
    Long editUser(@RequestBody User user);

    @DeleteMapping(path = "/api/user/remove/{id}")
    Long removeUser(@PathVariable Long id);

    @GetMapping(path = "/api/user/{id}")
    User getUser(@PathVariable Long id);

    @GetMapping(path = "/api/user/role")
    List<Role> listRole(@RequestParam(value = "userId", required = false) Long userId);

    @PostMapping(path = "/api/user/changePassword")
    int changePassword(@RequestBody ChangePasswordDto changePasswordDto);

    @PostMapping(path = "/api/permission/add")
    Long addPermission(@RequestBody Permission permission);

    @PutMapping(path = "/api/permission/edit")
    Long editPermission(@RequestBody Permission permission);

    @DeleteMapping(path = "/api/permission/remove/{id}")
    Long removePermission(@PathVariable Long id);

    @GetMapping(path = "/api/permission/{id}")
    Permission getPermission(@PathVariable Long id);

    @GetMapping(path = "/api/permission")
    List<Permission> listPermission();

    @PostMapping(path = "/api/role/add")
    Long addRole(@RequestBody Role role);

    @PutMapping(path = "/api/role/edit")
    Long editRole(@RequestBody Role role);

    @DeleteMapping(path = "/api/role/remove/{id}")
    Long removeRole(@PathVariable Long id);

    @GetMapping(path = "/api/role/{id}")
    Role getRole(@PathVariable Long id);

    @PostMapping(path = "/api/rolePermission/add")
    Long addRolePermission(@RequestBody RolePermissionDto rolePermissionDto);

    @PutMapping(path = "/api/rolePermission/edit")
    Long editRolePermission(@RequestBody RolePermissionDto rolePermissionDto);

    @DeleteMapping(path = "/api/rolePermission/remove/{id}")
    Long removeRolePermission(@PathVariable Long id);

    @GetMapping(path = "/api/rolePermission/{id}")
    RolePermission getRolePermission(@PathVariable Long id);

    @GetMapping(path = "/api/rolePermission")
    List<RolePermission> listRolePermission();

    @PostMapping(path = "/api/userGroup/add")
    Long addUserGroup(@RequestBody UserGroup userGroup);

    @PutMapping(path = "/api/userGroup/edit")
    Long editUserGroup(@RequestBody UserGroup userGroup);

    @DeleteMapping(path = "/api/userGroup/remove/{id}")
    Long removeUserGroup(@PathVariable Long id);

    @GetMapping(path = "/api/userGroup")
    List<UserGroup> listUserGroup();

    @PostMapping(path = "/api/userGroupDetail/add")
    Long addUserGroupDetail(@RequestBody UserGroupDetailDto userGroupDetailDto);

    @PutMapping(path = "/api/userGroupDetail/edit")
    Long editUserGroupDetail(@RequestBody UserGroupDetailDto userGroupDetailDto);

    @DeleteMapping(path = "/api/userGroupDetail/remove/{id}")
    Long removeUserGroupDetail(@PathVariable Long id);

    @GetMapping(path = "/api/userGroupDetail/{id}")
    UserGroupDetail getUserGroupDetail(@PathVariable Long id);

    @GetMapping(path = "/api/userGroupDetail")
    List<UserGroupDetail> listUserGroupDetail();

    @PostMapping(path = "/api/userGroupRole/add")
    Long addUserGroupRole(@RequestBody UserGroupRoleDto userGroupRoleDto);

    @PutMapping(path = "/api/userGroupRole/edit")
    Long editUserGroupRole(@RequestBody UserGroupRoleDto userGroupRoleDto);

    @DeleteMapping(path = "/api/userGroupRole/remove/{id}")
    Long removeUserGroupRole(@PathVariable Long id);

    @GetMapping(path = "/api/userGroupRole/{id}")
    UserGroupRole getUserGroupRole(@PathVariable Long id);

    @GetMapping(path = "/api/userGroupRole")
    List<UserGroupRole> listUserGroupRole();

    @PostMapping(path = "/api/userPermission/add")
    Long addUserPermission(@RequestBody UserPermissionDto userPermissionDto);

    @PutMapping(path = "/api/userPermission/edit")
    Long editUserPermission(@RequestBody UserPermissionDto userPermissionDto);

    @DeleteMapping(path = "/api/userPermission/remove/{id}")
    Long removeUserPermission(@PathVariable Long id);

    @GetMapping(path = "/api/userPermission/{id}")
    UserPermission getUserPermission(@PathVariable Long id);

    @GetMapping(path = "/api/userPermission")
    List<UserPermission> listUserPermission();

    @PostMapping(path = "/api/userRole/add")
    Long addUserRole(@RequestBody UserRoleDto userRoleDto);

    @PutMapping(path = "/api/userRole/edit")
    Long editUserRole(@RequestBody UserRoleDto userRoleDto);

    @DeleteMapping(path = "/api/userRole/remove/{id}")
    Long removeUserRole(@PathVariable Long id);

    @GetMapping(path = "/api/userRole/{id}")
    UserRole getUserRole(@PathVariable Long id);

    @GetMapping(path = "/api/userRole")
    List<UserRole> listUserRole();

}
