package tests;

import org.testng.annotations.Test;
import pages.CartPage;

public class CartTest extends BaseTest {

    @Test(priority = 3)
    public void clickOnCheckout() {
        new CartPage(driver).clickCheckout();
    }
}
