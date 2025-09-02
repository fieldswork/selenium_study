package part2.com.saucedemo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;

    private String url = "https://www.saucedemo.com";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        // After loading the application, we need to create an instance of BasePage
        basePage = new BasePage();
        // We can then set the driver from basePage:
        basePage.setDriver(driver);

        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit(); // Quits driver, closes browser
    }
}
