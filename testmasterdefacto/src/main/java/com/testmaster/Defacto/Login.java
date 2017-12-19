package com.testmaster.Defacto;

import org.openqa.selenium.By;

public class Login extends WebMain {

    public void login(){

        setup();
        navigate("https://www.defacto.com.tr/");
        click(By.cssSelector(".btn-login-icon.hidden-sm"));
        sleep(2);
        sendKeys(By.cssSelector("#LoginModel_Email"),"cezawenefret@hotmail.co.uk");
        sendKeys(By.cssSelector("[class] .form-group:nth-of-type(2) .form-control"),"123456A");

        click(By.cssSelector("[class=\"col-lg-10 no-padding userLogin top10\"] [type=\"submit\"]"));
        sleep(3);

    }

    public  void  loginWithFacebook1(){
    setup();
    navigate("https://www.defacto.com.tr/");
    click(By.cssSelector(".btn-login-icon.hidden-sm"));
    sleep(5);
    click(By.cssSelector("[class=\"sp-custom-546-3\"] [src]"));
    sleep(1);
    sendKeys(By.cssSelector("[type=\"text\"]"),"cezawenefret@hotmail.co.uk");
    sendKeys(By.cssSelector("[type=\"password\"]"),"a.berk_beko");
    sleep(1);
    click(By.cssSelector("button"));
        sleep(4);
        quit();

    }

    public  void  loginWithFacebook2(){
        setup();
        navigate("https://www.defacto.com.tr/");
        click(By.cssSelector(".facebookLogIN"));
        sendKeys(By.cssSelector("[type=\"text\"]"),"cezawenefret@hotmail.co.uk");
        sendKeys(By.cssSelector("[type=\"password\"]"),"a.berk_beko");
        sleep(1);
        click(By.cssSelector("button"));
        sleep(4);
        quit();

    }
}
