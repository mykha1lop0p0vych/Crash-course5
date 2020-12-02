package com.opencart.enums;

public enum Urls {
    BASE_URL("http://localhost/opencart/upload/index.php");

    private final String value;

    Urls(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}