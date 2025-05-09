package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.OnlineProductsPage;
import Utilities.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class stepOnlineProducts {

    public WebDriver driver = BaseTest.getDriver();
    public HomePage hp;
    public OnlineProductsPage op;

    @Given("User navigates to the Online products page")
    public void userNavigatesToTheOnlineProductsPage() throws InterruptedException {

        System.out.println("Driver instance: " + driver); // Debug log
        hp = new HomePage(driver);
        Thread.sleep(5000);
        hp.clickHumbergerMenu();
        hp.clickOnlineProductsLink();

    }

    @When("User clicks on Formal Shoes drop down")
    public void userClicksOnFormalShoesDropDown() throws InterruptedException {

        op = new OnlineProductsPage(driver);
        op.clickFormalShoesDropDown();

    }

    @Then("User should be able to view the Products in Tabular format")
    public void userShouldBeAbleToViewTheProductsInTabularFormat() {


    }
}
