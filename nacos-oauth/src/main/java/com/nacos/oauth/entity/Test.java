package com.nacos.oauth.entity;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Test {
    public static void main(String[] args) {
        String app = BCrypt.hashpw("11111", BCrypt.gensalt());
        System.out.println("jjj:"+app);

    }
}
