package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By addToCart = By.className("btn_primary");
//    private final By addToCart = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
    private final By cart = By.id("shopping_cart_container");

    public void clickAddToCart() {
        List<WebElement> addToCartButtons = driver.findElements(this.addToCart);
        // Select the very first 3 products
        for(int i = 0; i < 3; i++) {
            addToCartButtons.get(i).click();
        }
    }

    public void clickCart() {
        driver.findElement(this.cart).click();
    }
}
