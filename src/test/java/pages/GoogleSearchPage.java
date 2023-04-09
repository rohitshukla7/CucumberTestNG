package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    public WebDriver driver;

    private By searchBox = By.name("q");
    private By searchButton = By.name("btnK");
    private By firstResult = By.cssSelector("div#search .g:nth-child(1) a");

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage() {
        driver.get("https://www.google.com/");
    }

    public void searchFor(String keyword) {
        WebElement searchBoxElement = driver.findElement(searchBox);
        searchBoxElement.sendKeys(keyword);
        searchBoxElement.submit();
    }

    public void clickOnFirstResult() {
        WebElement firstResultElement = driver.findElement(firstResult);
        firstResultElement.click();
    }

    public String getTitleOfFirstResult() {
        return driver.getTitle();
    }

    public String getURLofFirstResult() {
        return driver.getCurrentUrl();
    }

}
