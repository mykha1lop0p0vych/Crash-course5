package com.opencart.datamodel;

import lombok.Getter;

@Getter
public class LoginModel {

    private String email;
    private String password;

    LoginModel(){
    }

    public static LoginModel.Builder getBuilder() {
        return new LoginModel().new Builder();
    }

    public class Builder {

        public LoginModel.Builder email(String value) {
            email = value;
            return this;
        }

        public LoginModel.Builder password(String value) {
            password = value;
            return this;
        }

        public LoginModel build() {
            return LoginModel.this;
        }
    }
}
