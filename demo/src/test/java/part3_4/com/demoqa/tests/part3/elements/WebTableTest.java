package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    String testAge = "34";
    String testEmail = "alden@example.com";

    @Test
    public void testWebTable() {
        var webTablePage = homePage.gotoElements().clickWebTables();
        webTablePage.clickEdit(testEmail);
        webTablePage.setAge(testAge);
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(testEmail);
        Assert.assertEquals(actualAge, testAge, "/n Actual and expected ages do not match /n");
    }
}
