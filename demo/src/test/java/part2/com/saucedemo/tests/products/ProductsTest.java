package part2.com.saucedemo.tests.products;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.ProductsPage;

import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
    // Once again, remember to extend BaseTest!

    // Our goal is to ensure that the user, once logging in, can see content on the products page.
    @Test
    public void testProductsHeaderIsDisplayed() {
        // We'll use our convenience method, `logIntoApplication`, to automatically log in with the credentials we specify.
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Products Header Is Not Displayed \n"); // Syntax for adding an error on test failure
    }
}
