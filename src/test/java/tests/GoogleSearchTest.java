package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.DriverFactory;
import pages.GoogleSearchPage;

@CucumberOptions(features = "src/test/resources/features/GoogleSearch.feature", glue = "stepdefinitions")
public class GoogleSearchTest extends AbstractTestNGCucumberTests {

    @Test
    public void testGoogleSearch() {
        //String url = "google.com";
        //Assert.assertTrue(url.contains("https://www.python.org/"));
        // This is a placeholder method and does not need to contain any code.
        // The test logic is implemented in the Cucumber step definitions.
    }
}
