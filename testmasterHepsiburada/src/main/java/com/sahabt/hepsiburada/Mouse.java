package com.sahabt.hepsiburada;
import org.openqa.selenium.By;

public class Mouse extends WebMain {

    public void bedavaKargo(){
        mouse();

        sendKeys(By.cssSelector("#quantity"),"0");
        sleep(1);
        click(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));
        sleep(1);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        quit();

    }
    public void kargoUcretiDahil(){
        mouse();
        click(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));
        sleep(1);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        quit();
    }
    public void mouse(){
        setup();
        navigate("http://www.hepsiburada.com/");
        sleep(3);
        click(By.cssSelector(".insider-opt-in-disallow-button"));
        sleep(1);
        click(By.cssSelector("#elektronik span"));
        sleep(1);
        click(By.cssSelector(".nav-home > [data-bind] > [href=\"\\/bilgisayarlar-c-2147483646\"]:nth-of-type(1)"));
        sleep(1);
        click(By.cssSelector("[href=\"\\/cevre-birimleri-c-3013120\"]"));
        sleep(1);
        click(By.cssSelector("[href=\"\\/mouse-c-52\"]"));
        sleep(1);
        click(By.cssSelector(".ins-cancel"));
        sleep(1);
        scroll(By.cssSelector("[class=\"page-2 \"]"));
        sleep(1);
        click(By.cssSelector("[class=\"page-2 \"]"));
        sleep(1);
        scroll(By.cssSelector("[class=\"page-3 \"]"));
        sleep(1);
        click(By.cssSelector("[class=\"page-3 \"]"));
        sleep(1);
        scroll(By.cssSelector("[class=\"page-4 \"]"));
        sleep(1);
        click(By.cssSelector("[class=\"page-4 \"]"));
        sleep(1);
        scroll(By.cssSelector("[class=\"page-5 \"]"));
        sleep(1);
        click(By.cssSelector("[class=\"page-5 \"]"));
        sleep(1);
        scroll(By.cssSelector("[class=\"page-6 \"]"));
        sleep(1);
        click(By.cssSelector("[class=\"page-6 \"]"));
        sleep(1);
        scroll(By.cssSelector("[class=\"page-7 \"]"));
        sleep(1);
        click(By.cssSelector("[class=\"page-7 \"]"));
        sleep(1);
        click(By.cssSelector("[href=\"\\/classone-t120-silent-serisi-2-4-ghz-800-1200-1600-dpi-nano-alicili-kablosuz-mouse-siyah-p-HBV0000012N1S\"] .owl-item:nth-of-type(2) [width]"));



    }


}
