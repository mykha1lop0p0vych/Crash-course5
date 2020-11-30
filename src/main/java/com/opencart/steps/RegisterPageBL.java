package com.opencart.steps;

import com.opencart.datamodel.RegisterModel;
import com.opencart.pages.FailRegisterPage;
import com.opencart.pages.RegisterPage;
import com.opencart.pages.SuccessRegisterPage;
import com.opencart.repository.RegisterModelRepository;
import com.opencart.util.DriverUtils;
import org.testng.Assert;

public class RegisterPageBL {

    private RegisterPage registerPage;
    private SuccessRegisterPage successRegisterPage;
    private FailRegisterPage failRegisterPage;

    public RegisterPageBL() {
        registerPage = new RegisterPage();
    }

    public RegisterPageBL registerNewPerson() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();

        successRegisterPage = new SuccessRegisterPage();
        return this;
    }

    public RegisterPageBL registerNewPersonWithIncorrectParameters() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelIncorrectParameters();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();

        successRegisterPage = new SuccessRegisterPage();
        return this;
    }

    public RegisterPageBL registerNewPersonWithInvalidParameters() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelFailParameters();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();

         failRegisterPage = new FailRegisterPage();
        return this;
    }

    public RegisterPageBL registerNewPersonWithFailName() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelFailName();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();

        failRegisterPage = new FailRegisterPage();
        return this;
    }
    public RegisterPageBL registerNewPersonWithFailLastName() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelFailLastName();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();

        failRegisterPage = new FailRegisterPage();
        return this;
    }

    public RegisterPageBL registerNewPersonWithFailEmail() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelFailEmail();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();

        failRegisterPage = new FailRegisterPage();
        return this;
    }

    public RegisterPageBL registerNewPersonWithFailTel() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelFailTel();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();

        failRegisterPage = new FailRegisterPage();
        return this;
    }

    public RegisterPageBL registerNewPersonWithFailPassword() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelFailPassword();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();

        failRegisterPage = new FailRegisterPage();
        return this;
    }

    public RegisterPageBL registerNewPersonWithoutPrivatePolicy() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickOnContinueButton();

        failRegisterPage = new FailRegisterPage();
        return this;
    }

    public RegisterPageBL registerNewPersonWithFailPasswordConfirm() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelFailPasswordConfirm();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickOnContinueButton();

        failRegisterPage = new FailRegisterPage();
        return this;
    }


    private void inputFirstName(String firstName) {
        registerPage.getFirstNameInput().clear();
        registerPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        registerPage.getLastNameInput().clear();
        registerPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        registerPage.getEmailInput().clear();
        registerPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        registerPage.getTelephoneInput().clear();
        registerPage.getTelephoneInput().sendKeys(telephone);
    }

    private void inputPassword(String password) {
        registerPage.getPasswordInput().clear();
        registerPage.getPasswordInput().sendKeys(password);
        registerPage.getPasswordConfirmInput().clear();
        registerPage.getPasswordConfirmInput().sendKeys(password);
    }

    private void chooseSubscribe(int value) {
        new DriverUtils().clickOnElementJS(registerPage.getSubscribeRadioButton(value));
    }

    private void clickPolicyCheckbox() {
        new DriverUtils().clickOnElementJS(registerPage.getPolicy());
    }

    private void clickOnContinueButton() {
        registerPage.getContinueButton().click();
    }

    public void verifyUserRegistration() {
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(successRegisterPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyUserIsNotRegistrationFailName(){
        String expectedMessage = "First Name must be between 1 and 32 characters!";
        Assert.assertEquals(failRegisterPage.getInvalidName().getText(), expectedMessage, "Name is correct");
    }

    public void verifyUserIsNotRegistrationFailLastName(){
        String expectedMessage = "Last Name must be between 1 and 32 characters!";
        Assert.assertEquals(failRegisterPage.getInvalidLastName().getText(), expectedMessage, "Last Name is is correct");
    }

    public void verifyUserIsNotRegistrationFailEmail(){
        String expectedMessage = "E-Mail Address does not appear to be valid!";
        Assert.assertEquals(failRegisterPage.getInvalidEmail().getText(), expectedMessage, "Email is correct");
    }

    public void verifyUserIsNotRegistrationFailTel(){
        String expectedMessage = "Telephone must be between 3 and 32 characters!";
        Assert.assertEquals(failRegisterPage.getInvalidNumber().getText(), expectedMessage, "Number is correct");
    }

    public void verifyUserIsNotRegistrationFailPassword(){
        String expectedMessage = "Password must be between 4 and 20 characters!";
        Assert.assertEquals(failRegisterPage.getInvalidPassword().getText(), expectedMessage, "Password  is correct");
    }

    public void verifyUserIsNotRegistrationWithoutPrivatePolicy(){
        String expectedMessage = " Warning: You must agree to the Privacy Policy!";
        Assert.assertEquals(failRegisterPage.getInvalidPassword().getText(), expectedMessage, "Private policy  is accepted");
    }

    public void verifyUserIsNotRegistrationWithFailPasswordConfirm(){
        String expectedMessage = "Password confirmation does not match password!";
        Assert.assertEquals(failRegisterPage.getInvalidPassword().getText(), expectedMessage, "Password is OK");
    }


}
