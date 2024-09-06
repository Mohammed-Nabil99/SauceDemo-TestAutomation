package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private WebDriver driver;
    private By sortByBtn= By.cssSelector("select.product_sort_container");
    private By AddToCartFirstProductBtn= By.id("add-to-cart-sauce-labs-onesie");
    private By cart= By.cssSelector(".shopping_cart_link");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void sortBySelection(int index) {
        WebElement sortBy = driver.findElement(sortByBtn);
        Select select = new Select(sortBy);
        select.selectByIndex(index-1);
    }


    public void clickAddToCartFirstProduct() {
        click(AddToCartFirstProductBtn);
    }

    public CartPage clickCart() {
        click(cart);
        return new CartPage(driver);
    }

    private void click(By by)
    {
        driver.findElement(by).click();
    }


}
