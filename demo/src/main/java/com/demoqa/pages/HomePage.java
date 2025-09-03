package com.demoqa.pages;

import org.openqa.selenium.By;

import com.demoqa.pages.forms.FormsPage;
import com.saucedemo.pages.BasePage;

public class HomePage extends BasePage {
    // Note that we're extending BasePage here, which belongs to saucedemo - 
    // This is fine, since BasePage has utility methods that are reusable here!

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForms() {
        click(formsCard);
        return new FormsPage();
    }
}
