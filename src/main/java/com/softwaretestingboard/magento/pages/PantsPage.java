package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PantsPage extends Utility {

//    By cronusYogaPant = By.xpath("//a[contains(text(),'Cronus Yoga Pant')]");
//    By size = By.cssSelector("#option-label-size-143-item-175");
//    By black = By.cssSelector("#option-label-color-93-item-49");
//    By addToCart = By.xpath("//span[text() = 'Add to Cart']");
//    By textMessage = By.xpath("//div[contains(text(),'You added Cronus Yoga Pant  to your ')]");
//    By shoppingCart = By.xpath("//a[text()='shopping cart']");

    @CacheLookup
    @FindBy (xpath = "//a[contains(text(),'Cronus Yoga Pant')]")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy (css = "#option-label-size-143-item-175")
    WebElement size;

    @CacheLookup
    @FindBy (css = "#option-label-color-93-item-49")
    WebElement black;

    @CacheLookup
    @FindBy (xpath = "//span[text() = 'Add to Cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy (xpath = "//div[contains(text(),'You added Cronus Yoga Pant  to your ')]")
    WebElement textMessage;

    @CacheLookup
    @FindBy (xpath = "//a[text()='shopping cart']")
    WebElement shoppingCart;

    // Mouse hover on product name
    public void mouseHoverOnProductName() {
        Reporter.log("MouseHover On Product Name: " +cronusYogaPant.toString() + "<br>");
        mouseHoverToElement(cronusYogaPant);
        CustomListeners.test.log(Status.PASS, "MouseHover On Product Name: " );
    }

    // Click on size
    public void clickOnsize() {
        Reporter.log("Click On Size: " + size.toString() + "<br>");
        clickOnElement(size);
        CustomListeners.test.log(Status.PASS, "Click On Size: " );
    }

    // Select Black Colour
    public void clickOnColourBlack() {
        Reporter.log("Click On Colour Black: " + black.toString() + "<br>");
        clickOnElement(black);
        CustomListeners.test.log(Status.PASS, "Click On Colour Black: " );
    }

    // Click on Add to cart button
    public void clickOnAddToCart() {
        Reporter.log("Click On Add To Cart: " + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click On Add To Cart: " );
    }

    // Verifying product added to cart message
    public void verifyTextMessage(String expectedMessage) {
        Reporter.log("Verify Text Message: " + textMessage.toString() + "<br>");
        verifyElements(textMessage,expectedMessage,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Text Message: " + expectedMessage);
    }

    // Clicking on Shopping cart button
    public void clickOnShoppingCart(){
        Reporter.log("Click On Shopping Cart: " + shoppingCart.toString() + "<br>");
        clickOnElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Click On Shopping Cart: " );
    }
}
