package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By paymentFinishButton = By.xpath("//button[text()='Finish']");

    public void clickFinishButton() {
        driver.findElement(this.paymentFinishButton).click();
    }
}
