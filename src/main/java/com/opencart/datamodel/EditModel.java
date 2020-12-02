package com.opencart.datamodel;

import lombok.Getter;

@Getter
public class EditModel {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;

    EditModel() {
    }

    public static EditModel.Builder getBuilder() {
        return new EditModel().new Builder();
    }

    public class Builder {
        public EditModel.Builder firstName(String value) {
            firstName = value;
            return this;
        }

        public EditModel.Builder lastName(String value) {
            lastName = value;
            return this;
        }

        public EditModel.Builder email(String value) {
            email = value;
            return this;
        }

        public EditModel.Builder telephone(String value) {
            telephone = value;
            return this;
        }

        public EditModel build() {
            return EditModel.this;
        }
    }
}
