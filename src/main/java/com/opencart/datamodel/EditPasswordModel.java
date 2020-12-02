package com.opencart.datamodel;

import lombok.Getter;

@Getter
public class EditPasswordModel {

    private String password;
    private String confirmPassword;

    EditPasswordModel(){}

    public static EditPasswordModel.Builder getBuilder() {
        return new EditPasswordModel().new Builder();
    }

    public class Builder {

        public EditPasswordModel.Builder password(String value) {
            password = value;
            return this;
        }

        public EditPasswordModel.Builder confirmPassword(String value) {
            confirmPassword = value;
            return this;
        }

        public EditPasswordModel build() {
            return EditPasswordModel.this;
        }
    }
}
