package StepDefinitions;

import PageObjects.NewRegistrationPage;
import Utilities.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class stepNewRegistration {

    public WebDriver driver = BaseTest.getDriver(); // Initialize driver

    public NewRegistrationPage nrp;

    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException {

        nrp = new NewRegistrationPage(driver);
        nrp.clickNewRegistration();

       }


    @Then("User should be able to view the Registration page")
    public void user_should_be_able_to_view_the_registration_page() {



    }


}
