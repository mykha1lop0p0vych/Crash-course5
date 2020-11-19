package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductContainer {
    private WebElement element;

    public ProductContainer(WebElement element) {
        this.element = element;
    }

    public String getName() {
        return this.element.findElement(
                By.xpath(".//*[@class='caption']/h4")).getText();
    }

    public String getDescription() {
        return this.element.findElement(
                By.cssSelector("* div:nth-child(2) > p:nth-child(2)")).getText();
    }

    public String getPrice() {
        return this.element.findElement(
                By.className(".price")).getText();
    }

    public String getPriceExTax() {
        return this.element.findElement(
                By.cssSelector("* div:nth-child(2) > p:nth-child(3) > span:nth-child(1)")).getText();
    }

    public String getShoppingCartButton() {
        return this.element.findElement(
                By.cssSelector("* div.button-group button i.fa.fa-shopping-cart")).getText();
    }

    public String getWishListButton() {
        return this.element.findElement(
                By.cssSelector("* div.button-group button i.fa.fa-heart")).getText();
    }

    public String getCompareButton() {
        return this.element.findElement(
                By.cssSelector("* div.button-group button i.fa.fa-exchange")).getText();
    }
}
