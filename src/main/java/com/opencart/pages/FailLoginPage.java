package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FailLoginPage extends BasePage{
    @FindBy(xpath = ".//*[@id=\"account-login\"]/div[1]")
    private WebElement FailLoginPageTitle;

    public WebElement getFailLoginPageTitle() {
        return FailLoginPageTitle;
    }
}
