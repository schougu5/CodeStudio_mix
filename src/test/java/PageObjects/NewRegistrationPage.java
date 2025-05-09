package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewRegistrationPage {

    public WebDriver ldriver;

    public NewRegistrationPage(WebDriver rdriver){
        ldriver=rdriver;
        // Initialize elements using PageFactory or any other method
         PageFactory.initElements(rdriver,this);
    }

    @FindBy(id="NewRegistration")
    WebElement Field_NewRegistration;

    public void clickNewRegistration() throws InterruptedException {
        // Click on the New Registration link
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", Field_NewRegistration);
        Field_NewRegistration.click();
    }
}
