package com.opencart.repository;

import com.opencart.datamodel.EditModel;
import com.opencart.datamodel.EditPasswordModel;
import com.opencart.getproperties.GetProperties;
import org.apache.commons.lang3.RandomStringUtils;

public class EditPasswordModelRepository {

    EditPasswordModelRepository(){}

    public static EditPasswordModel getEditPasswordModel() {
        GetProperties property = new GetProperties();
        String password = property.getProperties()[1];
        return EditPasswordModel.getBuilder()
                .password(password)
                .confirmPassword(password)
                .build();
    }

    public static EditPasswordModel getEditErrorPasswordEmptyFieldsModel(){
        String password = "";
        return EditPasswordModel.getBuilder()
                .password(password)
                .confirmPassword(password)
                .build();
    }

    public static EditPasswordModel getEditErrorPasswordDifferentFieldsModel(){
        return EditPasswordModel.getBuilder()
                .password(RandomStringUtils.randomAlphabetic(7))
                .confirmPassword(RandomStringUtils.randomAlphabetic(10))
                .build();
    }
}
