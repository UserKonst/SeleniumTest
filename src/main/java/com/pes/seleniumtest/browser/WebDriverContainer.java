package com.pes.seleniumtest.browser;

import org.openqa.selenium.WebDriver;

public class WebDriverContainer {

    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return DRIVER.get();
    }

    public static void setDriver(WebDriver driver) {
        DRIVER.set(driver);
    }

}
