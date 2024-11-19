package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By checkoutButton = By.id("checkout");

    public void clickCheckout() {
        driver.findElement(this.checkoutButton).click();
    }
}
