package com.saucedemo.pages;

import org.openqa.selenium.By;

import com.base.BasePage;

public class ProductsPage extends BasePage {

    // Same as before - this info isn't accessible from another page, so it must be private.
    private By productsHeader = By.xpath("//span[text()='Products']");

    // We'll go ahead and check to see whether or not the product header is displayed here:
    public boolean isProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}
