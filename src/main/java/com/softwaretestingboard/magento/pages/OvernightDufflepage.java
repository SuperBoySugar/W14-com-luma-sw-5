package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OvernightDufflepage extends Utility {

//    By textMessage = By.xpath("//span[contains(text(),'Overnight Duffle')]");
//    By quantity = By.id("qty");
//    By addToCart = By.id("product-addtocart-button");
//    By text = By.xpath("//div[contains(text(),'You added Overnight Duffle to your ')]");
//    By shoppingCartLink = By.xpath("//a[text()='shopping cart']");
//    By productName = By.cssSelector("td[class='col item'] strong[class='product-item-name']");
//    By productPrize = By.xpath("//td[@class='col subtotal']//span[@class='price']");
//    By changeQuantity = By.cssSelector("td[class='col qty'] input[class*='input-text qty']");
//    By updateShoppingCart = By.xpath("//span[text()='Update Shopping Cart']");
//    By productsPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][text()='$225.00']");
//
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement textMessage;

    @CacheLookup
    @FindBy (id = "qty")
    WebElement quantity;

    @CacheLookup
    @FindBy (id = "product-addtocart-button")
    WebElement addToCart;

    @CacheLookup
    @FindBy (xpath = "//div[contains(text(),'You added Overnight Duffle to your ')]")
    WebElement text;

    @CacheLookup
    @FindBy (xpath = "//a[text()='shopping cart']")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(css = "td[class='col item'] strong[class='product-item-name']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[@class='price']")
    WebElement productsPrize;

    @CacheLookup
    @FindBy(css = "td[class='col qty'] input[class*='input-text qty']")
    WebElement changeQuantity;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Update Shopping Cart']")
    WebElement updateShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][text()='$225.00']")
    WebElement productsPrice;

    // Verifying text
    public void verifyTextMessage(String expectedText){
        Reporter.log("Verify Text OvernightDuffle: " + textMessage.toString() + "<br>");
        verifyElements(textMessage,expectedText,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Text OvernightDuffle: " + expectedText);
    }
    // Changing quantity
    public void changeQuantity(String qty){
        Reporter.log("Change Quantity: " + quantity.toString() + "<br>");
        sendTextToElement(quantity, Keys.DELETE + qty);
        CustomListeners.test.log(Status.PASS, "Change Quantity: " + qty);
    }
    // Clicking on Add to Cart
    public void clickOnAddToCart(){
        Reporter.log("Click On Add To Cart: " + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click On Add To Cart: " );
    }
    // verify message
    public void verifyText(String expectedMessage){
        Reporter.log("Verify TextMessage: " + text.toString() + "<br>");
        verifyElements(text,expectedMessage,"Error");
        CustomListeners.test.log(Status.PASS, "Verify TextMessage: " + expectedMessage);
    }
    // Clicking on Shopping cart link
    public void clickOnShoppingCartLink(){
        Reporter.log("Click On Shopping Cart Link: " + shoppingCartLink.toString() + "<br>");
        clickOnElement(shoppingCartLink);
        CustomListeners.test.log(Status.PASS, "Click On Shopping Cart Link: " );
    }
    // Verifying product name
    public void verifyProductName(String expectedText){
        Reporter.log("Verify Product Name: " + productName.toString() + "<br>");
        verifyElements(productName,expectedText,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Product Name: " + expectedText);
    }
    // verifying product price
    public void verifyProductPrice(String expectedPrice){
        Reporter.log("Verify Products Prize: " + productsPrize.toString() + "<br>");
        verifyElements(productsPrize,expectedPrice,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Products Prize: " + expectedPrice);
    }
    // Changing product quantity
    public void changeProductQuantity(String qty1){
        Reporter.log("Change Product Quantity: " + changeQuantity.toString() + "<br>");
        sendTextToElement(changeQuantity,Keys.DELETE + qty1);
        CustomListeners.test.log(Status.PASS, "Change Product Quantity: " + qty1);
    }
    // Click on Update button
    public void clickOnUpdate(){
        Reporter.log("Click On Update Shopping Cart: " + updateShoppingCart.toString() + "<br>");
        clickOnElement(updateShoppingCart);
        CustomListeners.test.log(Status.PASS, "Click On Update Shopping Cart: " );
    }
    // Verifying product price
    public void verifyProductsPrice(String expectedChangePrice){
        Reporter.log("Verify Products Price: " + productsPrice.toString() + "<br>");
        verifyElements(productsPrice,expectedChangePrice,"Error");
        CustomListeners.test.log(Status.PASS, "Verify Products Price: " + expectedChangePrice);
    }
}

