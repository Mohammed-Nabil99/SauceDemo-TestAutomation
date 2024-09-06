package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userName= By.id("user-name");
    private By password= By.id("password");
    private By loginBtn= By.id("login-button");

    public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        public void enterUserName(String UserName) {
            driver.findElement(userName).clear();
            driver.findElement(userName).sendKeys(UserName);
        }

        public void enterPassword(String Password) {
             driver.findElement(password).clear();
             driver.findElement(password).sendKeys(Password);
        }

        public HomePage clickLoginBtn() {
            driver.findElement(loginBtn).click();
            return new HomePage(driver);
        }





}
