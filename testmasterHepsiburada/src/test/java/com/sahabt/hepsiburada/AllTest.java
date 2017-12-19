package com.sahabt.hepsiburada;

import org.junit.Test;
import org.openqa.selenium.By;

public class AllTest {
    WebMain webMainObj=new  WebMain();
    Login loginObj =new Login();
    SingUp singupObj =new SingUp();
    Mouse mouseObj =new Mouse();
    SearchMouse searchmouseObj =new SearchMouse();
    SearchAndBuyApple searchandbuyappleObj = new SearchAndBuyApple();
    BuyShoe buyshoeObj = new BuyShoe();


    @Test
    public void singUpTest(){

        singupObj.singUp1("Taha Berk","Aksu","tberkaksu@gmail.com","123456A");
        webMainObj.sleep(1);

        singupObj.singUp2("Taha ","Aksu","tahaberk.aksu@stu.khas.edu.tr","123456A");
        webMainObj.sleep(1);


        webMainObj.click(By.cssSelector("[class=\"_hj-f5b2a1eb-9b07_widget _hj-f5b2a1eb-9b07_ltr _hj-f5b2a1eb-9b07_tr\"]"));
        webMainObj.sleep(1);
        webMainObj.click(By.cssSelector(".usersProcess li:nth-of-type(7) [rel]"));
        webMainObj.sleep(1);
        webMainObj.quit();
    }
    @Test
    public void loginTest(){
        webMainObj.setup();
        loginObj.emptyEmailAndPassword("","123456A");
        webMainObj.sleep(1);
        loginObj.emptyEmailAndEmptyPassword("","");
        webMainObj.sleep(1);
        loginObj.EmailAndEmptyPassword("tberkaksu@gmial.com","");
        webMainObj.sleep(1);
        webMainObj.navigate("http://www.hepsiburada.com/");
        webMainObj.click(By.className("ins-cancel"));
        loginObj.falseEmailFalsePassword("qweqwe","qweqweqwe");
        webMainObj.sleep(1);
        loginObj.trueEmailFalsePassword("tberkaksu@gmail.com","qweqweasdaw2");
        webMainObj.sleep(1);
        loginObj.falseEmailAndTruePassword("asdasdasd","123456A");
        webMainObj.sleep(1);
        loginObj.trueEmailTruePassword("tberkaksu@gmail.com","123456A");
        webMainObj.sleep(2);
        webMainObj.quit();

    }
    @Test
    public  void mouseTest(){
        mouseObj.bedavaKargo();
        mouseObj.kargoUcretiDahil();
    }
    @Test
    public  void searchMouseTest(){

    searchmouseObj.searchMouse();
    }
    @Test
    public void searchAndBuyAppleTest(){
       searchandbuyappleObj.searchAndBuyContinueGiftPackageAndWithLogin();
       searchandbuyappleObj.searchAndBuyContinueGiftPackageAndWithLoginAndSecure3D();
       searchandbuyappleObj.searchAndBuyContinueNoGiftPackageAndWithLogin();
       searchandbuyappleObj.searchAndBuyContinueNoGiftPackageAndWithLoginAndSecure3D();
       searchandbuyappleObj.searchAndBuyContinueWithGiftPackageAndSingUp();
       searchandbuyappleObj.searchAndBuyContinueWithGiftPackageAndSingUpAndSecure3D();
       searchandbuyappleObj.searchAndBuyContinueWithNoGiftPackageAndSingUp();
       searchandbuyappleObj.searchAndBuyContinueWithNoGiftPackageAndSingUpAndSecure3D();
       searchandbuyappleObj.searchAndBuyContinueWithGiftPackageNoSubscribe();
       searchandbuyappleObj.searchAndBuyContinueWithGiftPackageNoSubscribeAndSecure3D();
       searchandbuyappleObj.searchAndBuyContinueWithNoGiftPackageNoSubscribe();
       searchandbuyappleObj.searchAndBuyContinueWithNoGiftPackageNoSubscribeAndSecure3D();

    }
    @Test
    public void buyShoeTest(){

        buyshoeObj.buyShoe();
    }




}