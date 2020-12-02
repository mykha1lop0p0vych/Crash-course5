package com.opencart.pages;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ErrorEditPage extends BasePage{

    List<WebElement> elementPassword =
            driver.findElements(By.xpath(".//*[@class='text-danger']"));

    public List<WebElement> getElementPassword() {
        return elementPassword;
    }
}
