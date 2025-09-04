package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import com.demoqa.pages.HomePage;

public class ElementsPage extends HomePage {

    private By WebTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");

    public WebTablesPage clickWebTables() {
        click(WebTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        click(linksMenuItem);
        return new LinksPage();
    }
}
