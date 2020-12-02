package com.opencart.steps;

import com.opencart.pages.MyAccountPage;
import org.w3c.dom.html.HTMLInputElement;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL(){
        myAccountPage = new MyAccountPage();
    }

    public EditPageBL clickOnEditButton(){
        myAccountPage.getEditButton().click();
        return new EditPageBL();
    }

    public EditPasswordPageBL clickOnEditPasswordButton(){
        myAccountPage.getEditPasswordButton().click();
        return new EditPasswordPageBL();
    }
}
