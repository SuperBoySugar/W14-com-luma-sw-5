package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {

    HomePage homePage;
    PantsPage pantsPage;
    ShoppingCartPage shoppingCartPage;


    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        pantsPage = new PantsPage();
        shoppingCartPage = new ShoppingCartPage();
    }

    @Test (groups = {"sanity"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouser hover on Men
        homePage.mouseHoverOnMen();
        Thread.sleep(1000);
        // Mouer hover on bottom
        homePage.mouseHoverOnBottom();
        // Mouse hover on Pants
        homePage.clickOnPants();
        // Mousr hover on prduct name
        pantsPage.mouseHoverOnProductName();
        // Select  on Size
        pantsPage.clickOnsize();
        // Select on colour
        pantsPage.clickOnColourBlack();
        // Click on Add to cart button
        pantsPage.clickOnAddToCart();
        // Verifying text
        pantsPage.verifyTextMessage("You added Cronus Yoga Pant to your shopping cart.");
        // Clicking on Shopping cart
        pantsPage.clickOnShoppingCart();
        // Verify Text shopping cart
        shoppingCartPage.verifyTextShoppingCart("Shopping Cart");
        // Verify Product name
        shoppingCartPage.verifyProductName("Cronus Yoga Pant");
        // Verify product name
        shoppingCartPage.verifyProductSize("32");
        // Verifying product colour
        shoppingCartPage.verifyProductColour("Black");
    }
}
