package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage{
    @FindBy(xpath = ".//input[@name='search']")
    private WebElement inputSearchCriteria;
    @FindBy(xpath = ".//*[contains(@class, 'fa fa-search')]")
    private WebElement inputSearchGroupButton;

    public WebElement getInputSearchCriteria() {
        return inputSearchCriteria;
    }

    public WebElement getInputSearchGroupButton() {
        return inputSearchGroupButton;
    }
}

