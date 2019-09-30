package com.pes.seleniumtest.pages;

import com.pes.seleniumtest.browser.WebDriverContainer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebElement findElement(By locator)
    {
        return WebDriverContainer.getDriver().findElement(locator);
    }

    public String getPageTitle() {

        return WebDriverContainer.getDriver().getTitle();
    }

    public void waitForVisibilityOfElement(By locator, int timeoutSec) {
        new WebDriverWait(WebDriverContainer.getDriver(), timeoutSec)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

}
