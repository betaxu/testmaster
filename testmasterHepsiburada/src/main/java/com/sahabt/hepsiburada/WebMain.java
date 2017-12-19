package com.sahabt.hepsiburada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMain
{

   public static WebDriver driver;
   public static WebElement element;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void navigate(String to) {
        driver.navigate().to(to);
    }

    public WebElement find(By by) {

        return driver.findElement(by);
    }
    public void click(By by) {
        driver.findElement(by).click();
    }
    public void submit(By by) {
        driver.findElement(by).submit();
    }

    public void sendKeys(By by, String keys) {
        driver.findElement(by).sendKeys(keys);
    }

    public String getText(By by) {
        return driver.findElement(by).getText();
    }

    public void scroll(By by) {
        element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void scrollUp(By by){
        element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("scroll(0, -250);", element);

    }

    public void sleep(int second) {

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void quit() {

        driver.quit();
    }
}





