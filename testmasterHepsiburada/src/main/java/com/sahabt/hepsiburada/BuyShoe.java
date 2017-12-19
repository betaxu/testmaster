package com.sahabt.hepsiburada;

import org.openqa.selenium.By;

public class BuyShoe extends WebMain {

    public void buyShoe(){
        setup();
        navigate("http://www.hepsiburada.com/");
        sleep(3);
        click(By.cssSelector(".insider-opt-in-disallow-button"));
        sleep(2);
        sendKeys(By.cssSelector("[maxlength=\"150\"]"),"Ayakkabı");
        sleep(2);
        click(By.cssSelector("#buttonProductSearch"));
        sleep(1);
        click(By.cssSelector("[href=\"\\/erkek-giyim-modelleri-c-12087177\"]"));
        sleep(1);
        click(By.cssSelector("[href=\"\\/ayakkabi-c-60000117\"]"));
        sleep(1);
        click(By.cssSelector(".ins-cancel"));
        sleep(1);
        click(By.cssSelector("[for=\"attr-fiyat-250-500\"]"));
        sleep(1);
        click(By.cssSelector("[for=\"category-60000126\"]"));
        sleep(1);
        click(By.cssSelector("[for=\"attr-satici-Hepsiburada\"]"));
        sleep(1);
        click(By.cssSelector("[for=\"brand-voileblanche\"]"));
        sleep(1);
        click(By.cssSelector("[for=\"attr-numara-44\"]"));
        sleep(1);
        click(By.cssSelector("[for=\"attr-renk-Kahverengi\"]"));
        sleep(1);
        click(By.cssSelector(".product-price"));
        sleep(1);
        click(By.cssSelector(".show-campaigns"));
        sleep(3);
        scrollUp(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));
        sleep(1);
        click(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));
        sleep(6);
        quit();
    }

}
