package com.ten.service.serviceimpl.authorization;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户登录认证
 * 用户角色认证
 * 用户权限认证
 *
 * @author Administrator
 */
@Service
public class AuthorizationServiceImpl {


    /**
     * 认证
     */
    public boolean verifyLogin(String username, String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 角色
     */
    public boolean verifyRole(String role) {
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.checkRole(role);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 权限
     */
    public boolean verifyPermission(String permission) {
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.checkPermission(permission);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
