package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
//    By women = By.xpath("//span[text()='Women']");
//    By tops = By.cssSelector("a[id='ui-id-9'] span:nth-child(1)");
//    By jackets = By.cssSelector("a[id='ui-id-11'] span:nth-child(1)");
//    By men = By.xpath("//span[normalize-space()='Men']");
//    By bottom = By.cssSelector("a[id='ui-id-18'] span:nth-child(1)");
//    By pants = By.cssSelector("a[id='ui-id-23'] span:nth-child(1)");
//    By gear = By.cssSelector("a[id='ui-id-6'] span:nth-child(2)");
//    By bags = By.xpath("//span[text()='Bags']");


    @CacheLookup
    @FindBy(xpath = "//span[text()='Women']")
    WebElement women;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-9'] span:nth-child(1)")
    WebElement tops;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-11'] span:nth-child(1)")
    WebElement jackets;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement men;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-18'] span:nth-child(1)")
    WebElement bottom;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-23'] span:nth-child(1)")
    WebElement pants;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-6'] span:nth-child(2)")
    WebElement gear;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Bags']")
    WebElement bags;


    public void mouseHoverOnWomen() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("MouseHover on Women: " + women.toString() + "<br>");
        mouseHoverToElement(women);
        CustomListeners.test.log(Status.PASS, "MouseHover on Women ");
    }

    public void mouseHoverOnTops() {
        Reporter.log("MouseHover on Tops: " + tops.toString() + "<br>");
        mouseHoverToElement(tops);
        CustomListeners.test.log(Status.PASS, "MouseHover on Tops ");
    }

    public void mouseHoverOnJacketsAndClick(){
        Reporter.log(" MouseHove and Click On Jackets: " + jackets.toString() + "<br>");
        mouseHoverToElementAndClick(jackets);
        CustomListeners.test.log(Status.PASS, "MouseHover and Click on Jackets ");
    }

    // Mouse hover on Men
    public void mouseHoverOnMen() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("MouseHover on Men: " + men.toString() + "<br>");
        mouseHoverToElement(men);
        CustomListeners.test.log(Status.PASS, "MouseHover on Men ");
    }
    // Mouse hover on Bottom tab
    public void mouseHoverOnBottom(){
        Reporter.log("MouseHover On Bottom: " + bottom.toString() + "<br>");
        mouseHoverToElement(bottom);
        CustomListeners.test.log(Status.PASS, "MouseHover on Bottom ");
    }
    // Click on Pants
    public void clickOnPants(){
        Reporter.log("Click On Pants: " + pants.toString() + "<br>");
        clickOnElement(pants);
        CustomListeners.test.log(Status.PASS, "Pants ");
    }
    // Mouse hover on Gear
    public void mouseHoverOnGear(){
        Reporter.log("MouseHover On Gear: " + gear.toString() + "<br>");
        mouseHoverToElement(gear);
        CustomListeners.test.log(Status.PASS, "MouseHover On Gear ");
    }
    // Click on Bags
    public void clickOnBags(){
        Reporter.log("Click On Bags: " + bags.toString() + "<br>");
        clickOnElement(bags);
        CustomListeners.test.log(Status.PASS, "Bags ");
    }


}
