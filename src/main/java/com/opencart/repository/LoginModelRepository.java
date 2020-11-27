package com.opencart.repository;

import com.opencart.datamodel.LoginModel;
import org.apache.commons.lang3.RandomStringUtils;

public class LoginModelRepository {
     private LoginModelRepository() {

    }

    public static LoginModel getLoginModel() {
        return LoginModel.getBuilder()
                .login("aaa@gmail.com")
                .password("1111")
                .build();
    }

    public static LoginModel getInvalidLoginModel() {
        return LoginModel.getBuilder()
                .login(RandomStringUtils.randomAlphabetic(5)+"@gmail.com")
                .password(RandomStringUtils.randomAlphabetic(8))
                .build();
    }
}
