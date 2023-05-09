package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {

    HomePage homePage;
    JacketsPage jacketsPage;


    @BeforeMethod
    public void inIt() {

        homePage = new HomePage();
        jacketsPage = new JacketsPage();

    }

    @Test(groups = {"sanity"})
    public void verifyTheByProductNameFilter() throws InterruptedException {
        // Mouse hover on women
        homePage.mouseHoverOnWomen();
        homePage.mouseHoverOnTops();
        homePage.mouseHoverOnJacketsAndClick();
        jacketsPage.selectSortByProductName("Product Name");
        // Verify product sorted in Ascending order
        jacketsPage.verifyProductAreInAscendingOrder();
    }

    @Test(groups = {"smoke"})
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        // Mouse hover on Women
        homePage.mouseHoverOnWomen();
        // Mouse hover on tops
        homePage.mouseHoverOnTops();
        // Mouse hover and click on Jacket
        homePage.mouseHoverOnJacketsAndClick();
        // Select Sort by Price
        jacketsPage.selectSortByPrice("Price");
        Thread.sleep(1000);
        // Verifying product sorted in Low to High
        jacketsPage.verifyProductsAreSortedByLowToHigh();
    }
}
