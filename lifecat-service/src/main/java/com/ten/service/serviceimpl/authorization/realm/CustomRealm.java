package com.ten.service.serviceimpl.authorization.realm;

import com.ten.service.serviceimpl.authorization.data.UserAuthorizationData;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * authorization admin 拦截器
 *
 * @author Administrator
 */
public class CustomRealm extends AuthorizingRealm {


    /**
     * 授权
     * <p>
     * subject.
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 1.把AuthenticationToken转换成UsernamePasswordToken
        UsernamePasswordToken token = (UsernamePasswordToken) principalCollection;

        // 2.从UsernamePasswordToken获取username
        String username = token.getUsername();
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
        // 1.把AuthenticationToken转换成UsernamePasswordToken
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        // 2.从UsernamePasswordToken获取username
        String username = token.getUsername();

        // 3.获取user account认证信息
        Map<String, String> userAccount = UserAuthorizationData.getInstance().getUserAccountMap();

        // 4.从user account中根据username获取password
        String userPassword = userAccount.get(username);
        String tokenPassword = String.valueOf(token.getPassword());

        // 5.验证密码
        if (userPassword.equals(tokenPassword)) {
            return new SimpleAuthenticationInfo(
                    username, userPassword, getName());
        } else {
            throw new UnknownAccountException();
        }
    }
}
