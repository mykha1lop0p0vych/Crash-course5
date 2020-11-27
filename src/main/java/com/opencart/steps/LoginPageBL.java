package com.opencart.steps;

import com.opencart.datamodel.LoginModel;
import com.opencart.pages.FailLoginPage;
import com.opencart.pages.LoginPage;
import com.opencart.pages.SuccessLoginPage;
import com.opencart.repository.LoginModelRepository;
import org.testng.Assert;


public class LoginPageBL {

    private LoginPage loginPage;
    private SuccessLoginPage successLoginPage;
    private FailLoginPage failLoginPage;

    LoginPageBL(){
        loginPage = new LoginPage();
    }

    public LoginPageBL loginWithValidParameters(){
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();

        successLoginPage = new SuccessLoginPage();
        return this;

    }

    public LoginPageBL loginWithInvalidParameters(){
        LoginModel loginModel = LoginModelRepository.getInvalidLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();

        failLoginPage = new FailLoginPage();
        return this;

    }

    private void inputEmail(String email){
        loginPage.getInputEmail().clear();
        loginPage.getInputEmail().sendKeys(email);
    }

    private void inputPassword(String password){
        loginPage.getInputPassword().clear();
        loginPage.getInputPassword().sendKeys(password);
    }

    private void clickOnLoginButton(){
        loginPage.getLoginButton().click();
    }

    public void verifyLogin(){
        String expectedMessage = "My Account";
        Assert.assertEquals(successLoginPage.getSuccessLoginTitle().getText(),expectedMessage, "Incorrect page title!");
    }

    public void verifyUserIsNotLogin(){
        String expectedMessage = "Warning: No match for E-Mail Address and/or Password.";
        Assert.assertEquals(failLoginPage.getFailLoginPageTitle().getText(),expectedMessage, "Incorrect page title!");
    }
}
