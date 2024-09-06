package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    WebDriver driver;
    private By finishBtn= By.id("finish");

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutStatusPage clickFinish() {
        driver.findElement(finishBtn).click();
        return new CheckoutStatusPage(driver);
    }

}
