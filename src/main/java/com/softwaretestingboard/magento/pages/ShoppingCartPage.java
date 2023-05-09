package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

//    By textShoppingCart = By.xpath("//span[text()='Shopping Cart']");
//    By productName = By.cssSelector("td[class='col item'] strong[class='product-item-name']");
//    By productSize = By.xpath("//dd[contains(text(),'32')]");
//    By productColour = By.xpath("//dd[contains(text(),'Black')]");

    @CacheLookup
    @FindBy (xpath = "//span[text()='Shopping Cart']")
    WebElement textShoppingCart;

    @CacheLookup
    @FindBy (css = "td[class='col item'] strong[class='product-item-name']")
    WebElement productName;

    @CacheLookup
    @FindBy (xpath = "//dd[contains(text(),'32')]")
    WebElement productSize;

    @CacheLookup
    @FindBy (xpath = "//dd[contains(text(),'Black')]")
    WebElement productColour;


    // Verifying text shopping cart
    public void verifyTextShoppingCart(String expectedText){
        Reporter.log("Verify Shopping Cart: " + textShoppingCart.toString() + "<br>");
        verifyElements(textShoppingCart,expectedText,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Shopping Cart: " + expectedText);
    }
    // Verify Product Name
    public void verifyProductName(String expectedName){
        Reporter.log("Verify Product Name: " + productName.toString() + "<br>");
        verifyElements(productName, expectedName,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Product Name: " + expectedName);
    }
    // Verify product size
    public void verifyProductSize(String expectedSize){
        Reporter.log("Verify Product Size: " + productSize.toString() + "<br>");
        verifyElements(productSize,expectedSize,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Product size: " + expectedSize);
    }
    // Verify Product colour
    public void verifyProductColour(String expectedcolour){
        Reporter.log("Verify Product Colour: " + productColour.toString() + "<br>");
        verifyElements(productColour,expectedcolour,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Product Colour: " +expectedcolour);
    }

}
