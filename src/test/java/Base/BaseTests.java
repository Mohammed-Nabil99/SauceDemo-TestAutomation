package Base;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {
    WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() {
         driver = new ChromeDriver();
         driver.get("https://www.saucedemo.com/");
         loginPage =new LoginPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
