package com.opencart.steps;

import com.opencart.datamodel.EditModel;
import com.opencart.pages.BasePage;
import com.opencart.pages.EditPage;
import com.opencart.pages.ErrorEditPage;
import com.opencart.pages.SuccessEditPage;
import com.opencart.repository.EditModelRepository;
import org.openqa.selenium.Alert;
import org.testng.Assert;

public class EditPageBL extends BasePage {
    private EditPage editPage;
    private SuccessEditPage successEditPage;
    private ErrorEditPage errorEditPage;

    public EditPageBL() {
        editPage = new EditPage();
    }

    public EditPageBL editAccount() {
        EditModel editModel = EditModelRepository.getEditModel();
        inputFirstName(editModel.getFirstName());
        inputLastName(editModel.getLastName());
        inputEmail(editModel.getEmail());
        inputTelephone(editModel.getTelephone());
        clickOnContinueButton();

        successEditPage = new SuccessEditPage();
        return this;
    }

    public EditPageBL editEmptyFieldsAccount(){
        EditModel editModel = EditModelRepository.getEditEmptyFieldModel();
        inputFirstName(editModel.getFirstName());
        inputLastName(editModel.getLastName());
        inputEmail(editModel.getEmail());
        inputTelephone(editModel.getTelephone());
        clickOnContinueButton();

        errorEditPage = new ErrorEditPage();
        return this;
    }

    public EditPageBL editAlertErrorAccount(){
        EditModel editModel = EditModelRepository.getEditErrorAlertModel();
        inputFirstName(editModel.getFirstName());
        inputLastName(editModel.getLastName());
        inputEmail(editModel.getEmail());
        inputTelephone(editModel.getTelephone());
        clickOnContinueButton();

        errorEditPage = new ErrorEditPage();
        return this;
    }

    private void inputFirstName(String firstName) {
        editPage.getFirstNameInput().clear();
        editPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        editPage.getLastNameInput().clear();
        editPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        editPage.getEmailInput().clear();
        editPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        editPage.getTelephoneInput().clear();
        editPage.getTelephoneInput().sendKeys(telephone);
    }


    private void clickOnContinueButton() {
        editPage.getContinueButton().click();
    }

    public void verifyEditAccount() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(successEditPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyEditEmptyFieldsAccount(){
        String expectedMessage = "First Name must be between 1 and 32 characters!";
        Assert.assertEquals(errorEditPage.getElementPassword().get(0).getText(), expectedMessage);
        expectedMessage = "Last Name must be between 1 and 32 characters!";
        Assert.assertEquals(errorEditPage.getElementPassword().get(1).getText(), expectedMessage);
        expectedMessage = "E-Mail Address does not appear to be valid!";
        Assert.assertEquals(errorEditPage.getElementPassword().get(2).getText(), expectedMessage);
        expectedMessage = "Telephone must be between 3 and 32 characters!";
        Assert.assertEquals(errorEditPage.getElementPassword().get(3).getText(), expectedMessage);
    }

    public void verifyEditErrorAlertAccount(){
        String expectedMessage = "E-Mail Address does not appear to be valid!";
        Assert.assertEquals(errorEditPage.getElementPassword().get(2).getText(), expectedMessage);
    }
}