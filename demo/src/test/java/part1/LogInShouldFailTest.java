package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
// Imports were handled by VSCode Intellisense

public class LogInShouldFailTest {
    WebDriver driver; // Purpose of the webdriver is to control the browser and to help find web elements.

    @BeforeClass // Allows us to run code /before/ the rest of the class.
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // The URL we wish to test
    }

    @AfterClass // Runs after everything else - useful for cleanup tasks
    public void tearDown() {
        driver.quit(); // Closes all browser windows AND the driver - this is the standard
        //driver.close(); // Closes the current window
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000); // So we can see the browser page appear. Needs the InterruptedException defined above.
        // Note that Thread.sleep() is NOT suitable for testing pipelines - just for demonstration or troubleshooting purposes.

        // Two key steps to automation:
        // 1. Find the web element
        // 2. Perform the action

        // There are three ways to find an element:
        WebElement username = driver.findElement(By.name("username")); // Standard method of storing a type WebElement
        username.sendKeys("Admin");

        var password = driver.findElement(By.name("password")); // Utilizing Java type inference
        password.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click(); // Directly operating on the element

        Thread.sleep(2000); // Without this sleep, content on the page doesn't render in time for this to pass...
        // In this file, everything is the same, except that we've asserted "Not Equals" - this is to compliment our "happy path" check.
        // In production, you may want to check for some other name - e.g., the login page again.
        Assert.assertEquals(driver.findElement(By.tagName("h6")).getText(), "Dashboard");
    }
}
