package part3_4.com.demoqa.tests.part3.widgets;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

public class SelectDropDownTests extends BaseTest {

    // List goes Volvo, Saab, Opel, Audi

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.gotoWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");   // Index 0
        selectMenuPage.selectStandardMulti(1);        // Index 1 (Saab)
        selectMenuPage.selectStandardMulti(2);        // Index 2 (Opel)
        selectMenuPage.selectStandardMulti("Audi");    // Index 3

        selectMenuPage.deselectStandardMulti("saab"); // Index 1
        selectMenuPage.deselectStandardMulti(3);      // Index 3 (Audi)

        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"), "\n Volvo is not selected as an option \n"); // Index 0
        Assert.assertFalse(actualSelectedOptions.contains("Saab"), "\n Saab is selected as an option \n");      // Index 1
        Assert.assertTrue(actualSelectedOptions.contains("Opel"), "\n Opel is not selected as an option \n");   // Index 2
        Assert.assertFalse(actualSelectedOptions.contains("Audi"), "\n Audi is not selected as an option \n");  // Index 3
    }
}
