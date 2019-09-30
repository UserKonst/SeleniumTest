package com.pes.seleniumtest.pages;

import com.pes.seleniumtest.browser.WebDriverContainer;
import org.openqa.selenium.By;

public class GooglePage extends BasePage {

    private static final String GOOGLE_BASE_URL = "https://google.com.ua";
    private static final By SEARCH_FIELD = By.name("q");
    private static final By SEARCH_BUTTON = By.xpath("//input[@type='submit'][1]");

    public SearchResultPage clickButtonSearch() {
        findElement(SEARCH_BUTTON).click();
        return new SearchResultPage();
    }

    public void fillSearchField(String value)
    {
        findElement(SEARCH_FIELD).sendKeys(value);
    }

    public void openPage()
    {
        WebDriverContainer.getDriver().get(GOOGLE_BASE_URL);
    }

    public String getTitle() {
        return WebDriverContainer.getDriver().getTitle();
    }

}
