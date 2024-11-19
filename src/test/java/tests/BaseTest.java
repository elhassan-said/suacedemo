package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {

    static WebDriver driver;

//    @Parameters("browserName") and pass it to setupDriver
    @BeforeTest
    public void setupDriver() {
        // ::TODO
        /*
         * setDriver(getNewInstance(browserName));
         * driver = getDriver();
         */
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.saucedemo.com");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
