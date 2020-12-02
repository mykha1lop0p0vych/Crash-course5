package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = ".//*[contains(@href,'edit')]")
    private WebElement editButton;

    @FindBy(xpath = ".//*[contains(@href,'password')]")
    private WebElement editPasswordButton;

    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getEditPasswordButton() {
        return editPasswordButton;
    }
}
