package com.opencart.steps;

import com.opencart.pages.HeaderPage;

public class HeaderPageBL{
    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    private void clickOnSearchInput() {
        headerPage.getInputSearchCriteria().click();
    }

    private void clickOnSearchButton() {
        headerPage.getInputSearchGroupButton().click();
    }

    public void searchProduct(String product) {
        clickOnSearchInput();
        inputSearch(product);
        clickOnSearchButton();
    }

    private void inputSearch(String search) {
        headerPage.getInputSearchCriteria().clear();
        headerPage.getInputSearchGroupButton().sendKeys(search);
    }
}
