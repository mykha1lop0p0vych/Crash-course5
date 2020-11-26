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

    public static RegisterModel getRegisterModel2() {
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

    public static RegisterModel getRegisterModel3() {
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


}
