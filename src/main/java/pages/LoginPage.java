package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    // 1 - Constructor
    // 2 - Locators
    // 3 - Public action methods

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By username = By.xpath("//input[@id=\"user-name\"]");
    private final By password = By.xpath("//input[@name=\"password\"]");
    private final By loginButton = By.xpath("//input[@type=\"submit\"]");

    public void enterUsername(String username) {
        driver.findElement(this.username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
