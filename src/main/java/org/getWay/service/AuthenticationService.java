package org.getWay.service;

import jakarta.servlet.http.HttpServletRequest;
import org.getWay.dto.*;
import org.getWay.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "AUTHENTICATION")
public interface AuthenticationService {
    @PostMapping(path = "/login")
    ResponseEntity<String> login(@RequestBody LoginDto loginDto);

    @GetMapping(path = "/getUserId")
    ResponseEntity<String> getUserId(@RequestParam("token") String token);

    @GetMapping(path = "/getUser")
    ResponseEntity<Map> getUserObject(@RequestParam("token") String token);

    @GetMapping(path = "/api/user")
    List<User> listUser();

    @PostMapping(path = "/api/user/add")
    Long addUser(@RequestBody User user);

    @PostMapping(path = "/api/user/edit")
    Long editUser(@RequestBody User user);

    @PostMapping(path = "/api/user/remove/{id}")
    Long removeUser(@PathVariable Long id);

    @GetMapping(path = "/api/user/{id}")
    User getUser(@PathVariable Long id);

    @GetMapping(path = "/api/user/role")
    List<Role> listRole();

    @GetMapping(path = "/api/user/colleague")
    List<User> listColleague();

    @PostMapping(path = "/api/user/colleague")
    List<User> listColleague(@RequestBody List<Long> userIds);

    @PostMapping(path = "/api/user/changePassword")
    int changePassword(@RequestBody ChangePasswordDto changePasswordDto);

    @PostMapping(path = "/api/permission/add")
    Long addPermission(@RequestBody Permission permission);

    @PostMapping(path = "/api/permission/edit")
    Long editPermission(@RequestBody Permission permission);

    @PostMapping(path = "/api/permission/remove/{id}")
    Long removePermission(@PathVariable Long id);

    @GetMapping(path = "/api/permission/{id}")
    Permission getPermission(@PathVariable Long id);

    @GetMapping(path = "/api/permission")
    List<Permission> listPermission();

    @PostMapping(path = "/api/role/add")
    Long addRole(@RequestBody Role role);

    @PostMapping(path = "/api/role/edit")
    Long editRole(@RequestBody Role role);

    @PostMapping(path = "/api/role/remove/{id}")
    Long removeRole(@PathVariable Long id);

    @GetMapping(path = "/api/role/{id}")
    Role getRole(@PathVariable Long id);

    @PostMapping(path = "/api/rolePermission/add")
    Long addRolePermission(@RequestBody RolePermissionDto rolePermissionDto);

    @PostMapping(path = "/api/rolePermission/edit")
    Long editRolePermission(@RequestBody RolePermissionDto rolePermissionDto);

    @PostMapping(path = "/api/rolePermission/remove/{id}")
    Long removeRolePermission(@PathVariable Long id);

    @GetMapping(path = "/api/rolePermission/{id}")
    RolePermission getRolePermission(@PathVariable Long id);

    @GetMapping(path = "/api/rolePermission")
    List<RolePermission> listRolePermission();

    @PostMapping(path = "/api/userGroup/add")
    Long addUserGroup(@RequestBody UserGroup userGroup);

    @PostMapping(path = "/api/userGroup/edit")
    Long editUserGroup(@RequestBody UserGroup userGroup);

    @PostMapping(path = "/api/userGroup/remove/{id}")
    Long removeUserGroup(@PathVariable Long id);

    @GetMapping(path = "/api/userGroup")
    List<UserGroup> listUserGroup();

    @PostMapping(path = "/api/userGroupDetail/add")
    Long addUserGroupDetail(@RequestBody UserGroupDetailDto userGroupDetailDto);

    @PostMapping(path = "/api/userGroupDetail/edit")
    Long editUserGroupDetail(@RequestBody UserGroupDetailDto userGroupDetailDto);

    @PostMapping(path = "/api/userGroupDetail/remove/{id}")
    Long removeUserGroupDetail(@PathVariable Long id);

    @GetMapping(path = "/api/userGroupDetail/{id}")
    UserGroupDetail getUserGroupDetail(@PathVariable Long id);

    @GetMapping(path = "/api/userGroupDetail")
    List<UserGroupDetail> listUserGroupDetail();

    @PostMapping(path = "/api/userGroupRole/add")
    Long addUserGroupRole(@RequestBody UserGroupRoleDto userGroupRoleDto);

    @PostMapping(path = "/api/userGroupRole/edit")
    Long editUserGroupRole(@RequestBody UserGroupRoleDto userGroupRoleDto);

    @PostMapping(path = "/api/userGroupRole/remove/{id}")
    Long removeUserGroupRole(@PathVariable Long id);

    @GetMapping(path = "/api/userGroupRole/{id}")
    UserGroupRole getUserGroupRole(@PathVariable Long id);

    @GetMapping(path = "/api/userGroupRole")
    List<UserGroupRole> listUserGroupRole();

    @PostMapping(path = "/api/userPermission/add")
    Long addUserPermission(@RequestBody UserPermissionDto userPermissionDto);

    @PostMapping(path = "/api/userPermission/edit")
    Long editUserPermission(@RequestBody UserPermissionDto userPermissionDto);

    @PostMapping(path = "/api/userPermission/remove/{id}")
    Long removeUserPermission(@PathVariable Long id);

    @GetMapping(path = "/api/userPermission/{id}")
    UserPermission getUserPermission(@PathVariable Long id);

    @GetMapping(path = "/api/userPermission")
    List<UserPermission> listUserPermission();

    @PostMapping(path = "/api/userRole/add")
    Long addUserRole(@RequestBody UserRoleDto userRoleDto);

    @PostMapping(path = "/api/userRole/edit")
    Long editUserRole(@RequestBody UserRoleDto userRoleDto);

    @PostMapping(path = "/api/userRole/remove/{id}")
    Long removeUserRole(@PathVariable Long id);

    @GetMapping(path = "/api/userRole/{id}")
    UserRole getUserRole(@PathVariable Long id);

    @GetMapping(path = "/api/userRole")
    List<UserRole> listUserRole();

}
