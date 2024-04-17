package org.getWay.api;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.getWay.dto.*;
import org.getWay.model.*;
import org.getWay.service.AuthenticationService;
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

    @GetMapping(path = "/api/user/logout")
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

    @PostMapping(path = "/api/user/edit")
    Long editUser(@RequestBody User user) {
        return authenticationService.editUser(user);
    }

    @PostMapping(path = "/api/user/remove/{id}")
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

    @PostMapping(path = "/api/permission/edit")
    Long editPermission(@RequestBody Permission permission) {
        return authenticationService.editPermission(permission);
    }

    @PostMapping(path = "/api/permission/remove/{id}")
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

    @PostMapping(path = "/api/role/edit")
    public Long editRole(@RequestBody Role role) {
        return authenticationService.editRole(role);
    }

    @PostMapping(path = "/api/role/remove/{id}")
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

    @PostMapping(path = "/api/rolePermission/edit")
    Long editRolePermission(@RequestBody RolePermissionDto rolePermissionDto) {
        return authenticationService.editRolePermission(rolePermissionDto);
    }

    @PostMapping(path = "/api/rolePermission/remove/{id}")
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

    @PostMapping(path = "/api/userGroup/edit")
    Long editUserGroup(@RequestBody UserGroup userGroup) {
        return authenticationService.editUserGroup(userGroup);
    }

    @PostMapping(path = "/api/userGroup/remove/{id}")
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

    @PostMapping(path = "/api/userGroupDetail/edit")
    Long editUserGroupDetail(@RequestBody UserGroupDetailDto userGroupDetailDto) {
        return authenticationService.editUserGroupDetail(userGroupDetailDto);
    }

    @PostMapping(path = "/api/userGroupDetail/remove/{id}")
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

    @PostMapping(path = "/api/userGroupRole/edit")
    Long editUserGroupRole(@RequestBody UserGroupRoleDto userGroupRoleDto) {
        return authenticationService.editUserGroupRole(userGroupRoleDto);
    }

    @PostMapping(path = "/api/userGroupRole/remove/{id}")
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

    @PostMapping(path = "/api/userPermission/edit")
    Long editUserPermission(@RequestBody UserPermissionDto userPermissionDto) {
        return authenticationService.editUserPermission(userPermissionDto);
    }

    @PostMapping(path = "/api/userPermission/remove/{id}")
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

    @PostMapping(path = "/api/userRole/edit")
    Long editUserRole(@RequestBody UserRoleDto userRoleDto) {
        return authenticationService.editUserRole(userRoleDto);
    }

    @PostMapping(path = "/api/userRole/remove/{id}")
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
