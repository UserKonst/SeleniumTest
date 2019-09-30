package com.pes.seleniumtest.pages;

import org.openqa.selenium.By;

public class SearchResultPage extends BasePage{

    private static final By RESULTS_LIST = By.id("ires");
    
    public void waitForPageLoading(int timeoutSec){
        waitForVisibilityOfElement(RESULTS_LIST, timeoutSec);
    }
    
    
}
