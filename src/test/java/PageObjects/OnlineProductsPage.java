package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineProductsPage {

    public WebDriver ldriver;
    public OnlineProductsPage(WebDriver rdriver){
        ldriver=rdriver;
        // Initialize elements using PageFactory or any other method
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath="//i[@class='fa fa-angle-double-down formalshoedropdown']")
    WebElement Field_FormalShoesDropdown;


    public void clickFormalShoesDropDown() throws InterruptedException {
        Thread.sleep(3000);
        Field_FormalShoesDropdown.click();
    }
}
