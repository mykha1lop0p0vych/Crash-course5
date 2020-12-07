package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FailRegisterPage extends BasePage {
    @FindBy(xpath = "./html/body/div[2]/div[1]")
    private WebElement InvalidRegistrationTitle;

    public WebElement getInvalidRegistrationTitle() {
        return InvalidRegistrationTitle;
    }

    @FindBy(xpath = ".//*[@id=\"account\"]/div[2]/div/div")
    private WebElement InvalidName;

    public WebElement getInvalidName() {
        return InvalidName;
    }

    @FindBy(xpath = ".//*[@id=\"account\"]/div[3]/div/div")
    private WebElement invalidLastName;

    public WebElement getInvalidLastName() {return invalidLastName;}

    @FindBy(xpath = ".//*[@id=\"account\"]/div[4]/div/div")
    private WebElement invalidEmail;

    public WebElement getInvalidEmail() {return invalidEmail;}

    @FindBy(xpath = "//*[@id=\"account\"]/div[5]/div/div")
    private WebElement invalidNumber;

    public WebElement getInvalidNumber() {return invalidNumber;}

    @FindBy(xpath = ".//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div")
    private WebElement invalidPassword;

    public WebElement getInvalidPassword() {return invalidPassword;}

    @FindBy(xpath = ".//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div")
    private WebElement invalidConfirmPassword;

    public WebElement getInvalidConfirmPassword() {return invalidConfirmPassword;}




}


