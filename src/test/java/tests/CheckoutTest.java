package tests;

import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {

    CheckoutPage checkoutPage;

    @Test(priority = 4)
    public void validCheckout() throws InterruptedException {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterFirstName("Alice");
        checkoutPage.enterLastName("Doe");
        checkoutPage.enterPostalCode("11511");
        checkoutPage.clickContinueButton();
        Thread.sleep(4000);
    }
}
