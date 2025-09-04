package com.demoqa.pages.elements;

import static utilities.JavaScriptUtility.scrollToElementJS;

import org.openqa.selenium.By;

public class LinksPage extends ElementsPage {

    private By badRequestLink = By.id("bad-request");
    private By responseLink = By.id("linkResponse");

    public void clickBadRequestLink() {
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    public String getResponse() {
        delay(2000); // Account for time spent waiting for response from server
        return find(responseLink).getText();
    }
}
