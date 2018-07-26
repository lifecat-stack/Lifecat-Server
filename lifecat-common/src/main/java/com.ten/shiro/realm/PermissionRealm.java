package com.ten.shiro.realm;


import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class PermissionRealm extends AuthorizingRealm {

    /**
     * 授权
     * <p>
     * subject.
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 数据需要从数据库中查询

        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
        // 根据角色ID查询角色（role），放入到Authorization里。
        Set<String> roles = new HashSet<String>();
        roles.add("角色1");
        roles.add("角色2");
        simpleAuthorInfo.setRoles(roles);
        // 根据用户ID查询权限（permission），放入到Authorization里。
        Set<String> permissions = new HashSet<String>();
        permissions.add("权限1");
        permissions.add("权限2");
        simpleAuthorInfo.setStringPermissions(permissions);
        return simpleAuthorInfo;
    }

    /**
     * 认证
     * <p>
     * subject.login()
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        // 1.把AuthenticationToken转换成UsernamePasswordToken
//        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        // 2.从UsernamePasswordToken获取username
//        String userName = token.getUsername();
//        UserDO user = userService.readUserByName(userName);
//        // 3.验证
//        if (user != null) {
//            return new SimpleAuthenticationInfo(
//                    user.getUserName(), user.getUserPassword(), getName());
//        } else {
//            throw new UnknownAccountException();
//        }
        return null;
    }
}
