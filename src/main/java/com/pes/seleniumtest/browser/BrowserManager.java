package com.pes.seleniumtest.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {

    public static WebDriver openBrowser(String browserName) {
        WebDriver driver;
        switch (browserName) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:
                throw new RuntimeException("Browser with name [" + browserName + "] isn't supported!");
        }

        WebDriverContainer.setDriver(driver);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        System.out.println("Browser " + browserName.toUpperCase() + " started!");
        return driver;
    }

    
    public static WebDriver openBrowser() {
        String defBrowser = System.getProperty("browser");
        return openBrowser(defBrowser);
    }

    public static void closeBrowser() {
        WebDriver driver = WebDriverContainer.getDriver();
        if (driver != null) {
            driver.quit();
            System.out.println("Browser was closed!");
        }
    }

}
