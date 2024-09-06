package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    private By checkoutBtn=By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutInformationPage clickCheckoutBtn() {
        driver.findElement(checkoutBtn).click();
        return new CheckoutInformationPage(driver);
    }
}
