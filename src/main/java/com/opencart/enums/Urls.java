package com.opencart.enums;

public enum Urls {
    BASE_URL("http://localhost:8012/opencart/upload/index.php?route=common/home");

    private final String value;

    Urls(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
