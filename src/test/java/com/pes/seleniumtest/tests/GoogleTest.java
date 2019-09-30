package com.pes.seleniumtest.tests;

import com.pes.seleniumtest.config.BaseTest;
import com.pes.seleniumtest.pages.GooglePage;
import com.pes.seleniumtest.pages.SearchResultPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GoogleTest extends BaseTest {

    private GooglePage googlePage;
    private SearchResultPage searchResultPage;
    private static final int PAGE_LOADING_TIMEOUT = 10;
    private static String SEARCH_QUERY = "Selenium camp";

    @BeforeClass
    public void setUp() {
        googlePage = new GooglePage();
    }

    @Test
    public void page_title_should_contain_search_word() {
        googlePage.openPage();
        googlePage.fillSearchField(SEARCH_QUERY);
        searchResultPage = googlePage.clickButtonSearch();
        searchResultPage.waitForPageLoading(PAGE_LOADING_TIMEOUT);
        String pageTitle = searchResultPage.getPageTitle();
        assertTrue(pageTitle.contains(SEARCH_QUERY), "Page title was: " + pageTitle);
    }

}
