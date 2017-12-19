package com.sahabt.hepsiburada;
import org.junit.Test;
import org.openqa.selenium.By;


public class SingUpTest {
    SingUp singupObj =new SingUp();
    WebMain webMainObj=new  WebMain();
    @Test
    public void singUpTest(){

        singupObj.singUp1("Taha Berk","Aksu","crazy_togetyoung@hotmail.com","123456A");
        webMainObj.sleep(1);
        singupObj.singUp2("Taha ","Aksu","tahaberk.aksu@stu.khas.edu.tr","123456A");
        webMainObj.sleep(1);
        webMainObj.click(By.cssSelector("[class=\"_hj-f5b2a1eb-9b07_widget _hj-f5b2a1eb-9b07_ltr _hj-f5b2a1eb-9b07_tr\"]"));
        webMainObj.sleep(1);
        webMainObj.click(By.cssSelector(".usersProcess li:nth-of-type(7) [rel]"));
        webMainObj.sleep(1);
        webMainObj.quit();
    }




}
