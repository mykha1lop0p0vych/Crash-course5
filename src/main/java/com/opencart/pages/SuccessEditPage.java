package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessEditPage extends BasePage{

    @FindBy(xpath = ".//*[@class='alert alert-success alert-dismissible']")
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        return successTitle;
    }
}
