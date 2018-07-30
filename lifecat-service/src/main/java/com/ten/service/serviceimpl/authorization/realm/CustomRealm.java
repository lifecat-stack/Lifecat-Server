package com.ten.service.serviceimpl.authorization.realm;

import com.ten.service.serviceimpl.authorization.data.UserAuthorizationData;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * shiro authorization realm
 *
 * @author Administrator
 */
public class CustomRealm extends AuthorizingRealm {

    private UserAuthorizationData data = UserAuthorizationData.getInstance();

    /**
     * 授权
     * <p>
     * subject.checkRole()
     * subject.checkPermission()
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 1.把AuthenticationToken转换成UsernamePasswordToken
        UsernamePasswordToken token = (UsernamePasswordToken) principalCollection;

        // 2.从UsernamePasswordToken获取username
        String username = token.getUsername();
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();

        // 根据username查询roles，放入到Authorization里
        Set<String> roles = data.getRolesByUserName(username);
        simpleAuthorInfo.setRoles(roles);

        // 根据username查询permissions，放入到Authorization里
        Set<String> permissions = data.getPermissionsByUserName(username);
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
        // 1.把AuthenticationToken转换成UsernamePasswordToken
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        // 2.从UsernamePasswordToken获取username
        String username = token.getUsername();

        // 4.从user account中根据username获取password
        String userPassword = data.getPasswordByUserName(username);
        String tokenPassword = String.valueOf(token.getPassword());

        // 5.验证密码
        if (userPassword != null && userPassword.equals(tokenPassword)) {
            return new SimpleAuthenticationInfo(
                    username, userPassword, getName());
        } else {
            throw new UnknownAccountException();
        }
    }
}
