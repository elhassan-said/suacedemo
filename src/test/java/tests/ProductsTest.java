package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

import java.util.List;

public class ProductsTest extends BaseTest {

    ProductsPage productsPage;

    @Test(priority = 2)
    public void selectProducts() {
        productsPage = new ProductsPage(driver);
        productsPage.clickAddToCart();
        productsPage.clickCart();
        // Check that three products are added to cart
        List<WebElement> cartItems = driver.findElements(By.className("inventory_item_name"));
        Assert.assertEquals(cartItems.size(), 3 , "Three products should be in the cart");
    }
}
