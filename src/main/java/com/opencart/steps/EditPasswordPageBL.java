package com.opencart.steps;

import com.opencart.datamodel.EditModel;
import com.opencart.datamodel.EditPasswordModel;
import com.opencart.pages.EditPasswordPage;
import com.opencart.pages.ErrorEditPage;
import com.opencart.pages.SuccessEditPage;
import com.opencart.repository.EditModelRepository;
import com.opencart.repository.EditPasswordModelRepository;
import org.testng.Assert;

public class EditPasswordPageBL {
    private EditPasswordPage editPasswordPage;
    private ErrorEditPage errorEditPasswordEdit;
    private SuccessEditPage successEditPasswordPage;

    public EditPasswordPageBL(){
        editPasswordPage = new EditPasswordPage();
    }

    public EditPasswordPageBL editErrorDifferentPasswordAccount(){
        EditPasswordModel editPasswordModel = EditPasswordModelRepository.getEditErrorPasswordDifferentFieldsModel();
        inputPassword(editPasswordModel.getPassword());
        inputConfirmPassword(editPasswordModel.getConfirmPassword());
        clickOnContinueButton();

        errorEditPasswordEdit = new ErrorEditPage();
        return this;
    }

    public EditPasswordPageBL editErrorEmptyPasswordAccount(){
        EditPasswordModel editPasswordModel = EditPasswordModelRepository.getEditErrorPasswordEmptyFieldsModel();
        inputPassword(editPasswordModel.getPassword());
        inputConfirmPassword(editPasswordModel.getConfirmPassword());
        clickOnContinueButton();

        errorEditPasswordEdit = new ErrorEditPage();
        return this;
    }

    public EditPasswordPageBL editPasswordAccount(){
        EditPasswordModel editPasswordModel = EditPasswordModelRepository.getEditPasswordModel();
        inputPassword(editPasswordModel.getPassword());
        inputConfirmPassword(editPasswordModel.getConfirmPassword());
        clickOnContinueButton();

        successEditPasswordPage = new SuccessEditPage();
        return this;
    }

    private void inputPassword(String password) {
        editPasswordPage.getPasswordInput().clear();
        editPasswordPage.getPasswordInput().sendKeys(password);
    }

    private void inputConfirmPassword(String confirmPassword){
        editPasswordPage.getPasswordConfirmInput().clear();
        editPasswordPage.getPasswordConfirmInput().sendKeys(confirmPassword);
    }

    private void clickOnContinueButton() {
        editPasswordPage.getContinueButton().click();
    }

    public void verifySuccessEditPasswordAccount() {
        String expectedMessage = "Success: Your password has been successfully updated.";
        Assert.assertEquals(successEditPasswordPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyErrorEditPasswordDifferentFieldsAccount(){
        String expectedMessage = "Password confirmation does not match password!";
        Assert.assertEquals(errorEditPasswordEdit.getElementPassword().get(0).getText(),expectedMessage);
    }

    public void verifyErrorEditPasswordEmptyFieldsAccount(){
        String expectedMessage = "Password must be between 4 and 20 characters!";
        Assert.assertEquals(errorEditPasswordEdit.getElementPassword().get(0).getText(),expectedMessage);
    }

}
