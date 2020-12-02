package com.opencart.repository;

import com.opencart.datamodel.LoginModel;
import com.opencart.getproperties.GetProperties;


public class LoginModelRepository {

    private LoginModelRepository() {
    }

    public static LoginModel getLoginModel() {
        GetProperties property = new GetProperties();
        return LoginModel.getBuilder()
                .email(property.getProperties()[0])
                .password(property.getProperties()[1])
                .build();
    }
}
