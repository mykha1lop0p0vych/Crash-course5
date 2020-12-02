package com.opencart.repository;

import com.opencart.datamodel.EditModel;
import com.opencart.getproperties.GetProperties;
import org.apache.commons.lang3.RandomStringUtils;

public class EditModelRepository {

    private EditModelRepository() {
    }

    public static EditModel getEditModel() {
        return EditModel.getBuilder()
                .firstName("Mykhailo")
                .lastName("Popovych")
                .email(new GetProperties().getProperties()[0])
                .telephone("123")
                .build();
    }

    public static EditModel getEditErrorAlertModel(){
        return EditModel.getBuilder()
                .firstName("123")
                .lastName("fff3345")
                .email("@gmail.com@")
                .telephone("Lvov")
                .build();
    }

    public static EditModel getEditEmptyFieldModel(){
        return EditModel.getBuilder()
                .firstName("")
                .lastName("")
                .email("")
                .telephone("")
                .build();
    }
}
