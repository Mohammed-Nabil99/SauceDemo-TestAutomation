package Checkout;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTests extends BaseTests {

    @Test
    public void testCompleteCheckout() {
       String userName="standard_user";
       String password="secret_sauce";
       loginPage.enterUserName(userName);
       loginPage.enterPassword(password);
       var homePage= loginPage.clickLoginBtn();

       int lowToHigh=3;
       homePage.sortBySelection(lowToHigh);
       homePage.clickAddToCartFirstProduct();
       var cartPage=homePage.clickCart();

       var checkoutInformationPage=cartPage.clickCheckoutBtn();

       String firstName="Mohammed";
       String lastName="Nabil";
       String postCode="1241";
       checkoutInformationPage.enterFirstName(firstName);
       checkoutInformationPage.enterLastName(lastName);
       checkoutInformationPage.enterPostalCode(postCode);
       var checkoutOverviewPage= checkoutInformationPage.clickContinue();

       var checkoutStatusPage=checkoutOverviewPage.clickFinish();

       String actualStatus=checkoutStatusPage.getOrderStatusTxt();
       String expectedStatus="Your order has been dispatched";
       System.out.println(actualStatus);
       Assert.assertTrue(actualStatus.contains(expectedStatus));


    }
}
