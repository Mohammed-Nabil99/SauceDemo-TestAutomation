package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStatusPage {
    WebDriver driver;
    private By orderStatusTxt= By.className("complete-text");

    public CheckoutStatusPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getOrderStatusTxt()
    {
        return driver.findElement(orderStatusTxt).getText();
    }


}
