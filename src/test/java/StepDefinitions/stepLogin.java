package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.NewRegistrationPage;
import Utilities.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class stepLogin {

    public WebDriver driver = BaseTest.getDriver();
    public HomePage hp;
    public LoginPage lp;
    public NewRegistrationPage nrp;


    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
       hp = new HomePage(driver);
       hp.clickHumbergerMenu();
       hp.clickSignInLink();

        lp= new LoginPage(driver);
      //  nrp = new NewRegistrationPage(driver);

    }

    @When("User enters valid email and password")
    public void user_enters_valid_email_and_password() {
       // lp = new LoginPage(driver);
        lp.enterEmailID("snehal@gmail.com");
        lp.enterPassword("123456");

       }
    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        lp.clickLoginButton();
    }

    @Then("User should be redirected to the Dashboard page")
    public void user_should_be_redirected_to_the_dashboard_page() {

     }

    @Then("Page title should be {string}")
    public void page_title_should_be(String string) {
    }

}
