package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleSearchPage;
import utils.DriverFactory;

import java.util.List;

public class GoogleSearchSteps {

    private GoogleSearchPage googleSearchPage;

    @Given("I am on the Google homepage")
    public void i_am_on_the_Google_homepage() {
        googleSearchPage = new GoogleSearchPage(DriverFactory.getDriver());
        googleSearchPage.goToHomePage();
    }

    @When("I search for {string} keyword")
    public void i_search_for_keyword(String string) {
        googleSearchPage.searchFor(string);
    }

    @When("I click on the first search result")
    public void i_click_on_the_first_search_result() {
        googleSearchPage.clickOnFirstResult();
    }

    @Then("I get the URL and title of the first search result")
    public void i_get_the_URL_and_title_of_the_first_search_result() {
        String title = googleSearchPage.getTitleOfFirstResult();
        String url = googleSearchPage.getURLofFirstResult();
        System.out.println("Title of first result is: " + title);
        System.out.println("URL of first result is: " + url);
        Assert.assertTrue(url.contains("https://www.python.org/"));
        DriverFactory.closeDriver();
    }


    // for another scenario

    @Given("I am on Google webpage")
    public void i_am_on_google_webpage() {
        googleSearchPage = new GoogleSearchPage(DriverFactory.getDriver());
        googleSearchPage.goToHomePage();
    }
    @When("I enter {string} keyword")
    public void i_enter_keyword(String string) {
        googleSearchPage.searchFor(string);
    }
    @Then("Click on first result and get title of webpage")
    public void click_on_first_result_and_get_title_of_webpage() {
        googleSearchPage.clickOnFirstResult();
        String title = googleSearchPage.getTitleOfFirstResult();
        String url = googleSearchPage.getURLofFirstResult();
        System.out.println("Title of first result is: " + title);
        System.out.println("URL of first result is: " + url);
        Assert.assertTrue(url.contains("https://www.java.com/en/"));
        DriverFactory.closeDriver();

    }

}
