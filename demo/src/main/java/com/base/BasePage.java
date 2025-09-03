package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    // Eliminates the need for us to type `driver.findElement()` each time - we can just use `find()`
    // Protected, as we only want to reuse this method in our base page & page object classes
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    // Passing in a String for the data our test script will set into an element
    // By is used for locating an element
    protected void set(By locator, String text) {
        // If there is data in the element, clear it, and send the text
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    // Clicks any element on the webpage
    protected void click(By locator) {
        find(locator).click();
    }

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}