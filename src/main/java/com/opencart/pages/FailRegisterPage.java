package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FailRegisterPage extends BasePage {
    @FindBy(xpath = ".//*[@id=\"account\"]/div[2]/div/div")
    private WebElement InvalidName;

    public WebElement getInvalidName() {
        return InvalidName;
    }
}
