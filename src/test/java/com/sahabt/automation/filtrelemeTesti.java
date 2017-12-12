package com.sahabt.automation;
import junit.framework.Assert;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class filtrelemeTesti {
    WebDriver driver;


    public String driverName = "webdriver.chrome.driver";
    public String driverPath = "driver/chromedriver.exe";
    public String url = "http://www.sahibinden.com";

    @Before
    public void setup() {
        System.setProperty(driverName, driverPath);
        driver = new ChromeDriver();
    }

    public WebElement find(By by) {
        return driver.findElement(by);
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public void sendKey(By by, String value) {
        driver.findElement(by).sendKeys(value);
    }

    @Test
    public void filtreleme() {
        driver.navigate().to(url);

        click(By.id("searchText"));
        sendKey(By.id("searchText"), "mustang");
        click((By.cssSelector("button")));
        sendKey(By.name("a5_max"), "2016");
        //click(By.cssSelector(".search-filter-section:nth-of-type(5) .js-manual-search-button"));
        click(By.cssSelector(".search-filter-section:nth-of-type(6) li:nth-of-type(1) .facetedCheckbox"));

        WebElement webElement = driver.findElement(By.xpath("/html//form[@id='searchResultsSearchForm']//button[@class='btn btn-block search-submit']"));
        webElement.sendKeys(Keys.ENTER);
        

    }
}
