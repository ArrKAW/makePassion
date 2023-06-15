package com.project.littlebank.user.signup.jpa.converter;

import org.junit.jupiter.api.Test;
import com.project.littlebank.user.signup.jpa.Utils.Aes256Utils;

class Aes256ConverterTest {

    Aes256Utils aes256Utils = new Aes256Utils();

    @Test
    public void 암호화복호화테스트(){

        String password = "12345";
        String encryptTest = aes256Utils.encrypt(password);
        String decryptTest = aes256Utils.decrypt(encryptTest);

        System.out.println("비밀번호 : " + password);
        System.out.println("암호화된 비밀번호 : " + encryptTest);
        System.out.println("복호화한 비밀번호 : " + decryptTest);
    }
}