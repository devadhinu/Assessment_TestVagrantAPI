package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"./src/test/java/Features"},
        glue= {"StepDefinitions"},
        monochrome = true,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
        snippets= CucumberOptions.SnippetType.CAMELCASE)

public class CucumberTestRunner
{
//    @BeforeMethod
//    public void init() {
//        System.out.println("The exeuction is starting");
//    }
//
//    @AfterMethod
//    public void closeBrowser() {
//        System.out.println("The exeuction is closed");
//    }
}
