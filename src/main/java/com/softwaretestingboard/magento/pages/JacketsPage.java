package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JacketsPage extends Utility {


    @CacheLookup
    @FindBy(id = "sorter")
    WebElement sortByProduct;

//    @CacheLookup
//    @FindBy(css = ".products .product-item-info .product-item-name")
//    WebElement productTitle;

    @CacheLookup
    @FindBy(id = "sorter")
    WebElement price;

//    @CacheLookup
//    @FindBy(css = ".products .product-item-info .price")
//    WebElement productPrice;

    public void selectSortByProductName(String product) {
        Reporter.log("Select On SortByProduct: " + sortByProduct.toString() + "<br>");
        selectByVisibleTextFromDropDown(sortByProduct, product);
        CustomListeners.test.log(Status.PASS, "Select on SortByProduct: " + product);
    }

//    public void verifyProductShouldBeInAscendingOrder(String expectedOrder){
//        verifyElements(productTitle,expectedOrder,"Error");
//    }

    By productTitle = By.cssSelector(".products .product-item-info .product-item-name");
    public void verifyProductAreInAscendingOrder() {
        Reporter.log("Verify Product Title are in AscendingOrder: " + productTitle.toString() + "<br>");
        List<WebElement> originalList = driver.findElements(productTitle);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList);
        System.out.println(originalProductNameList);

        List<WebElement> afterSortingList = driver.findElements(productTitle);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList, afterSortingProductName,"Product not found" );
    }

    // Selecting Price option from Sort By filter
    public void selectSortByPrice(String price1){
        selectByVisibleTextFromDropDown(price, price1);
        CustomListeners.test.log(Status.PASS, "Verify Product Title is in AscendingOrder ");
    }
    // Verifying product is sorted in Low to High
//    public void verifyProductShouldBeInLowToHigh(String expectedProductPrice){
//        verifyElements(productPrice, expectedProductPrice,"Error");

    By productPrice = By.cssSelector(".products .product-item-info .price");
    public void verifyProductsAreSortedByLowToHigh() {
        Reporter.log("Verify Products Are Low To High: " + productPrice.toString() + "<br>");
        List<WebElement> originalList = driver.findElements(productPrice);
        List<Double> originalProductPriceList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductPriceList.add(Double.valueOf(product.getText().replace("$", "")));
        }
        System.out.println("Before Sorting: " + originalProductPriceList);

        List<WebElement> afterSortingList = driver.findElements(productPrice);
        List<Double> afterSortingProductPrice = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductPrice.add(Double.valueOf(product.getText().replace("$", "")));
        }
        Collections.sort(originalProductPriceList);
        System.out.println("After Sorting: " + afterSortingProductPrice);
        Assert.assertEquals(originalProductPriceList, afterSortingProductPrice);
        CustomListeners.test.log(Status.PASS, "Verify Product price is in Low To High ");
    }
    }

