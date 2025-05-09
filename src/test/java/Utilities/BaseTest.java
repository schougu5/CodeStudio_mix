package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class BaseTest {

    public static WebDriver driver;

    @Before
    public void user_launches_the_browser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
      //  driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(5000);
    }

    @After
    public void close_browser() {
        if (driver != null) {
             driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
