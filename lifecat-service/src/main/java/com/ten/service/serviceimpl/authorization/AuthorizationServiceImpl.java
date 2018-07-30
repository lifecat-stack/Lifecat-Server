package com.ten.service.serviceimpl.authorization;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationServiceImpl {

    String safe(String origin) {
        Md5Hash md5Hash = new Md5Hash(origin,"yan");
    }
}
