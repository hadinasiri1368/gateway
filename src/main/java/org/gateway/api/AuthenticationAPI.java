package org.gateway.api;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.gateway.dto.*;
import org.gateway.model.*;
import org.gateway.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@SecurityRequirement(name = "Bearer Authentication")
public class AuthenticationAPI {
    @Autowired
    AuthenticationService authenticationService;

    @PostMapping(path = "/login")
    ResponseEntity<LoginData> login(@RequestBody LoginDto loginDto) {
        return authenticationService.login(loginDto);
    }

    @GetMapping(path = "/logout")
    public ResponseEntity<String> logout(){
        return authenticationService.logout();
    }

    @GetMapping(path = "/getUserId")
    ResponseEntity<String> getUserId(@ModelAttribute("token") String token) {
        return authenticationService.getUserId(token);
    }

    @GetMapping(path = "/getUser")
    ResponseEntity<Map> getUserObject(@ModelAttribute("token") String token) {
        return authenticationService.getUserObject(token);
    }

    @GetMapping(path = "/api/user")
    List<User> listUser() {
        return authenticationService.listUser();
    }

    @PostMapping(path = "/api/user/add")
    Long addUser(@RequestBody User user) {
        return authenticationService.addUser(user);
    }

    @PutMapping(path = "/api/user/edit")
    Long editUser(@RequestBody User user) {
        return authenticationService.editUser(user);
    }

    @DeleteMapping(path = "/api/user/remove/{id}")
    Long removeUser(@PathVariable Long id) {
        return authenticationService.removeUser(id);
    }

    @GetMapping(path = "/api/user/{id}")
    User getUser(@PathVariable Long id) {
        return authenticationService.getUser(id);
    }

    @GetMapping(path = "/api/user/role")
    List<Role> listRole(@RequestParam(value = "userId", required = false) Long userId) {
        return authenticationService.listRole(userId);
    }

    @PostMapping(path = "/api/user/changePassword")
    public int changePassword(@RequestBody ChangePasswordDto changePasswordDto) {
        return authenticationService.changePassword(changePasswordDto);
    }

    @PostMapping(path = "/api/permission/add")
    Long addPermission(@RequestBody Permission permission) {
        return authenticationService.addPermission(permission);
    }

    @PutMapping(path = "/api/permission/edit")
    Long editPermission(@RequestBody Permission permission) {
        return authenticationService.editPermission(permission);
    }

    @DeleteMapping(path = "/api/permission/remove/{id}")
    Long removePermission(@PathVariable Long id) {
        return authenticationService.removePermission(id);
    }

    @GetMapping(path = "/api/permission/{id}")
    Permission getPermission(@PathVariable Long id) {
        return authenticationService.getPermission(id);
    }

    @GetMapping(path = "/api/permission")
    List<Permission> listPermission() {
        return authenticationService.listPermission();
    }

    @PostMapping(path = "/api/role/add")
    Long addRole(@RequestBody Role role) {
        return authenticationService.addRole(role);
    }

    @PutMapping(path = "/api/role/edit")
    public Long editRole(@RequestBody Role role) {
        return authenticationService.editRole(role);
    }

    @DeleteMapping(path = "/api/role/remove/{id}")
    Long removeRole(@PathVariable Long id) {
        return authenticationService.removeRole(id);
    }

    @GetMapping(path = "/api/role/{id}")
    Role getRole(@PathVariable Long id) {
        return authenticationService.getRole(id);
    }

    @PostMapping(path = "/api/rolePermission/add")
    Long addRolePermission(@RequestBody RolePermissionDto rolePermissionDto) {
        return authenticationService.addRolePermission(rolePermissionDto);
    }

    @PutMapping(path = "/api/rolePermission/edit")
    Long editRolePermission(@RequestBody RolePermissionDto rolePermissionDto) {
        return authenticationService.editRolePermission(rolePermissionDto);
    }

    @DeleteMapping(path = "/api/rolePermission/remove/{id}")
    Long removeRolePermission(@PathVariable Long id) {
        return authenticationService.removeRolePermission(id);
    }

    @GetMapping(path = "/api/rolePermission/{id}")
    RolePermission getRolePermission(@PathVariable Long id) {
        return authenticationService.getRolePermission(id);
    }

    @GetMapping(path = "/api/rolePermission")
    List<RolePermission> listRolePermission() {
        return authenticationService.listRolePermission();
    }

    @PostMapping(path = "/api/userGroup/add")
    Long addUserGroup(@RequestBody UserGroup userGroup) {
        return authenticationService.addUserGroup(userGroup);
    }

    @PutMapping(path = "/api/userGroup/edit")
    Long editUserGroup(@RequestBody UserGroup userGroup) {
        return authenticationService.editUserGroup(userGroup);
    }

    @DeleteMapping(path = "/api/userGroup/remove/{id}")
    Long removeUserGroup(@PathVariable Long id) {
        return authenticationService.removeUserGroup(id);
    }

    @GetMapping(path = "/api/userGroup")
    List<UserGroup> listUserGroup() {
        return authenticationService.listUserGroup();
    }

    @PostMapping(path = "/api/userGroupDetail/add")
    Long addUserGroupDetail(@RequestBody UserGroupDetailDto userGroupDetailDto) {
        return authenticationService.addUserGroupDetail(userGroupDetailDto);
    }

    @PutMapping(path = "/api/userGroupDetail/edit")
    Long editUserGroupDetail(@RequestBody UserGroupDetailDto userGroupDetailDto) {
        return authenticationService.editUserGroupDetail(userGroupDetailDto);
    }

    @DeleteMapping(path = "/api/userGroupDetail/remove/{id}")
    Long removeUserGroupDetail(@PathVariable Long id) {
        return authenticationService.removeUserGroupDetail(id);
    }

    @GetMapping(path = "/api/userGroupDetail/{id}")
    UserGroupDetail getUserGroupDetail(@PathVariable Long id) {
        return authenticationService.getUserGroupDetail(id);
    }

    @GetMapping(path = "/api/userGroupDetail")
    List<UserGroupDetail> listUserGroupDetail() {
        return authenticationService.listUserGroupDetail();
    }

    @PostMapping(path = "/api/userGroupRole/add")
    Long addUserGroupRole(@RequestBody UserGroupRoleDto userGroupRoleDto) {
        return authenticationService.addUserGroupRole(userGroupRoleDto);
    }

    @PutMapping(path = "/api/userGroupRole/edit")
    Long editUserGroupRole(@RequestBody UserGroupRoleDto userGroupRoleDto) {
        return authenticationService.editUserGroupRole(userGroupRoleDto);
    }

    @DeleteMapping(path = "/api/userGroupRole/remove/{id}")
    Long removeUserGroupRole(@PathVariable Long id) {
        return authenticationService.removeUserGroupRole(id);
    }

    @GetMapping(path = "/api/userGroupRole/{id}")
    UserGroupRole getUserGroupRole(@PathVariable Long id) {
        return authenticationService.getUserGroupRole(id);
    }

    @GetMapping(path = "/api/userGroupRole")
    List<UserGroupRole> listUserGroupRole() {
        return authenticationService.listUserGroupRole();
    }

    @PostMapping(path = "/api/userPermission/add")
    Long addUserPermission(@RequestBody UserPermissionDto userPermissionDto) {
        return authenticationService.addUserPermission(userPermissionDto);
    }

    @PutMapping(path = "/api/userPermission/edit")
    Long editUserPermission(@RequestBody UserPermissionDto userPermissionDto) {
        return authenticationService.editUserPermission(userPermissionDto);
    }

    @DeleteMapping(path = "/api/userPermission/remove/{id}")
    Long removeUserPermission(@PathVariable Long id) {
        return authenticationService.removeUserPermission(id);
    }

    @GetMapping(path = "/api/userPermission/{id}")
    UserPermission getUserPermission(@PathVariable Long id) {
        return authenticationService.getUserPermission(id);
    }

    @GetMapping(path = "/api/userPermission")
    List<UserPermission> listUserPermission() {
        return authenticationService.listUserPermission();
    }

    @PostMapping(path = "/api/userRole/add")
    Long addUserRole(@RequestBody UserRoleDto userRoleDto) {
        return authenticationService.addUserRole(userRoleDto);
    }

    @PutMapping(path = "/api/userRole/edit")
    Long editUserRole(@RequestBody UserRoleDto userRoleDto) {
        return authenticationService.editUserRole(userRoleDto);
    }

    @DeleteMapping(path = "/api/userRole/remove/{id}")
    Long removeUserRole(@PathVariable Long id) {
        return authenticationService.removeUserRole(id);
    }

    @GetMapping(path = "/api/userRole/{id}")
    UserRole getUserRole(@PathVariable Long id) {
        return authenticationService.getUserRole(id);
    }

    @GetMapping(path = "/api/userRole")
    List<UserRole> listUserRole() {
        return authenticationService.listUserRole();
    }
}
