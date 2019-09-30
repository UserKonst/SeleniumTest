package com.pes.seleniumtest.config;

import com.pes.seleniumtest.browser.BrowserManager;
import com.pes.seleniumtest.browser.WebDriverContainer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        if (WebDriverContainer.getDriver() == null) {
            BrowserManager.openBrowser();
        }
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }

}
