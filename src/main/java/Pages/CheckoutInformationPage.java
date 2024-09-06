package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationPage {
    WebDriver driver;
    private By firstName= By.id("first-name");
    private By lastName= By.id("last-name");
    private By postalCode= By.id("postal-code");
    private By continueBtn= By.id("continue");

    public CheckoutInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String FirstName) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(FirstName);
    }

    public void enterLastName(String LastName) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(LastName);
    }

    public void enterPostalCode(String PostalCode) {
        driver.findElement(postalCode).clear();
        driver.findElement(postalCode).sendKeys(PostalCode);
    }

    public CheckoutOverviewPage clickContinue() {
        driver.findElement(continueBtn).click();
        return new CheckoutOverviewPage(driver);
    }
}
