package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;
import java.util.stream.Collectors;

public class SearchResultPage extends BasePage{
    @FindBy(xpath = ".//div/h2")
    private WebElement successTitle;

    @FindBy(xpath = ".//*[contains(@class, 'product-layout')]")
    private List<WebElement> productContainers;

    public WebElement getSuccessTitle() {
        return successTitle;
    }

    public List<ProductContainer> getProductContainers() {

        return productContainers.stream()
                .map(ProductContainer::new)
                .collect(Collectors.toList());
    }
}