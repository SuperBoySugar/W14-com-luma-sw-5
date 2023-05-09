package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflepage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {

    HomePage homePage;
    BagsPage bagsPage;
    OvernightDufflepage overnightDufflepage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        bagsPage = new BagsPage();
        overnightDufflepage = new OvernightDufflepage();
    }


    @Test (groups = {"smoke", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCartForGear() {
        // Mouse hover on Gear tab
        homePage.mouseHoverOnGear();
        // Click on Bags
        homePage.clickOnBags();
        // Click on Overnight duffle
        bagsPage.clickOnOvernightDuffle();
        // Verify text message
        overnightDufflepage.verifyTextMessage("Overnight Duffle");
        // Change Quantity
        overnightDufflepage.changeQuantity("3");
        // Click on Add to Cart button
        overnightDufflepage.clickOnAddToCart();
        // Verifying text
        overnightDufflepage.verifyText("You added Overnight Duffle to your shopping cart.");
        // Clicking on Shopping cart link
        overnightDufflepage.clickOnShoppingCartLink();
        // Verify product name
        overnightDufflepage.verifyProductName("Overnight Duffle");
        // Verify Product Prize
        overnightDufflepage.verifyProductPrice("$135.00");
        // Changing Product quantity
        overnightDufflepage.changeProductQuantity("5");
        // Click on Update
        overnightDufflepage.clickOnUpdate();
        // Verifying product price
        overnightDufflepage.verifyProductsPrice("$225.00");
    }
}
