package com.opencart.repository;

import com.opencart.datamodel.RegisterModel;
import org.apache.commons.lang3.RandomStringUtils;

public class RegisterModelRepository {

    private RegisterModelRepository() {
    }

    public static RegisterModel getRegisterModel() {
        String password = RandomStringUtils.randomAlphabetic(7);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static RegisterModel getRegisterModelIncorrectParameters() {
        String password = RandomStringUtils.randomAlphabetic(7);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomNumeric(5))
                .lastName(RandomStringUtils.randomNumeric(5))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomAlphabetic(10))
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static RegisterModel getRegisterModelFailParameters() {
        String password = RandomStringUtils.randomAlphabetic(25);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(33))
                .lastName(RandomStringUtils.randomAlphabetic(33))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(33))
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static RegisterModel getRegisterModelFailName() {
        String password = RandomStringUtils.randomAlphabetic(5);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(33))
                .lastName(RandomStringUtils.randomAlphabetic(7))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static RegisterModel getRegisterModelFailLastName() {
        String password = RandomStringUtils.randomAlphabetic(5);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(6))
                .lastName(RandomStringUtils.randomAlphabetic(33))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .password(password)
                .passwordConfirm(password)
                .build();
    }


    public static RegisterModel getRegisterModelFailEmail() {
        String password = RandomStringUtils.randomAlphabetic(5);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(6))
                .lastName(RandomStringUtils.randomAlphabetic(12))
                .email(RandomStringUtils.randomAlphabetic(0))
                .telephone(RandomStringUtils.randomNumeric(10))
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static RegisterModel getRegisterModelFailTel() {
        String password = RandomStringUtils.randomAlphabetic(5);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(6))
                .lastName(RandomStringUtils.randomAlphabetic(12))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(33))
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static RegisterModel getRegisterModelFailPassword() {
        String password = RandomStringUtils.randomAlphabetic(80);
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(6))
                .lastName(RandomStringUtils.randomAlphabetic(12))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static RegisterModel getRegisterModelFailPasswordConfirm() {
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .password(RandomStringUtils.randomAlphabetic(12))
                .passwordConfirm(RandomStringUtils.randomAlphabetic(9))
                .build();
    }


}
