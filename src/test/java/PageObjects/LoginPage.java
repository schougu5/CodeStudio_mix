package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);

    }

    @FindBy(id="usr")// Define your WebElements here using @FindBy annotation
    WebElement  Field_EmailID;

    @FindBy(id="pwd")
    WebElement  Field_Password;

    @FindBy(xpath="//*[@id=\"second_form\"]/input")
    WebElement  Field_LoginInButton;


    public void enterEmailID(String email){
        Field_EmailID.clear();
        Field_EmailID.sendKeys(email);
    }

    public void enterPassword(String password){
        Field_Password.clear();
        Field_Password.sendKeys(password);
    }

    public void clickLoginButton(){
        Field_LoginInButton.click();
    }


}
