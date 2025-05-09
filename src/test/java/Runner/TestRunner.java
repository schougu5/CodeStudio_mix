package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

    features = "src/test/java/Features",
    glue  = {"StepDefinitions","Utilities"},
    plugin = {"pretty","html:target/MyCucumberReport/cucumber-reports.html"}


)
public class TestRunner extends AbstractTestNGCucumberTests {

}
