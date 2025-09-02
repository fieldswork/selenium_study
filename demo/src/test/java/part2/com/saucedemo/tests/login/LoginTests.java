package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {
    // Make sure to inherit the functonality of BaseTest by extending the LoginTests class!

    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz3400"); // This is intentionally incorrect - choose anything that isn't `secret_sauce`
        loginPage.clickLoginButton(); // As we expect an error, an assignment for clickLoginButton isn't necessary
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface")); // Part of the error message contains "Epic sadface"
        // Note that it's always good practice to try `.assertFalse` as well!
    }
}
