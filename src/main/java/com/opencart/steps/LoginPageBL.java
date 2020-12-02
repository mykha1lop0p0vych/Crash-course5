package com.opencart.steps;

import com.opencart.datamodel.LoginModel;
import com.opencart.pages.LoginPage;
import com.opencart.pages.MyAccountPage;
import com.opencart.repository.LoginModelRepository;

import java.io.FileNotFoundException;

public class LoginPageBL {

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    public LoginPageBL(){
        loginPage = new LoginPage();
    }

    public LoginPageBL loginPerson(){
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();

        myAccountPage = new MyAccountPage();
        return this;
    }

    private void inputEmail(String email) {
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String password) {
        loginPage.getPasswordInput().clear();
        loginPage.getPasswordInput().sendKeys(password);
    }

    private void clickOnLoginButton() {
        loginPage.getLoginButton().click();
    }
}
