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

}
