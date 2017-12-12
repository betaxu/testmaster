package com.sahabt.automation;
import junit.framework.Assert;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTest {


    @Test
    public void aramaTesti(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.navigate().to("http://www.sahibinden.com");
        driver.navigate().to("http://46.101.63.20:8080/testinium/");
        String title=driver.getTitle();
        Assert.assertEquals("Yok",title.contains("Sahibinden"));//Tittle da sahibinden kelimesi varmı?
        driver.close();

        driver.findElement(By.id("searchText")).sendKeys("ford mustang");
        driver.findElement(By.id("searchText")).submit();
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.id("firstName")).sendKeys("Berk");
    }


}
