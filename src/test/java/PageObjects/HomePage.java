package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    public WebDriver ldriver;

    public HomePage(WebDriver rdriver){
        // Constructor for HomePage
        System.out.println("HomePage constructor called");
        ldriver = rdriver;
        // Initialize elements using PageFactory or any other method
        PageFactory.initElements(rdriver, this);
        System.out.println("PageFactory initialized for HomePage");
    }

    @FindBy(xpath="//*[@id=\"menuToggle\"]/input") // Define your WebElements here using @FindBy annotation
    WebElement Field_HumbergerMenu;

    @FindBy(xpath="//a[@href='SignIn.html']") // Define your WebElements here using @FindBy annotation
    WebElement Field_SignInLink;

    @FindBy(xpath="//a[@href='OnlineProducts.html']") // Define your WebElements here using @FindBy annotation
    WebElement Field_OnlineProductsLink;

    public HomePage() {
    }

    public void clickHumbergerMenu(){
        // Click on the hamburger menu
        System.out.println("Humberger menu clicked..");
        Field_HumbergerMenu.click();
        System.out.println("Humberger menu clicked");
    }

    public void clickSignInLink() throws InterruptedException {
        // Click on the Sign In link
        Thread.sleep(3000);
        Field_SignInLink.click();
    }


    public void clickOnlineProductsLink() throws InterruptedException {

        try {
            System.out.println("Clicking on Online Products link...");
            System.out.flush();
            // Click on the Online Products link
            Thread.sleep(3000);
            Field_OnlineProductsLink.click();
            System.out.println("Online Products link clicked");
            System.out.flush();
        }catch (Exception e) {
            System.out.println("Exception occurred while clicking on Online Products link: " + e.getMessage());
        }
    }
}
