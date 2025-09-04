package com.demoqa.pages.widgets;

import static utilities.JavaScriptUtility.scrollToElementJS;

import java.util.List;

import static utilities.DropDownUtility.*;

import org.openqa.selenium.By;

public class SelectMenuPage extends WidgetsPage {

    private By standardMultiSelect = By.id("cars");

    // Writing an overloaded method to handle both text & index-based dropdowns
    public void selectStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
        // SelectByVisibleText is a helper function that replaces these lines:
        // Select select = new Select(find(standardMultiSelect));
        // select.selectByVisibleText(text);
    }

    public void selectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    // Overloaded method for deselection
    public void deselectStandardMulti(String value) {
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }

    public void deselectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        deselectByIndex(standardMultiSelect, index);
    }

    public List<String> getAllSelectedStandardMultiOptions() {
        return getAllSelectedOptions(standardMultiSelect);
    }
}
