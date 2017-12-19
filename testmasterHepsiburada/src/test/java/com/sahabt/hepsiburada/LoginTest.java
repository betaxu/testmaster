package com.sahabt.hepsiburada;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest {
    WebMain webMainObj=new  WebMain();
    Login loginObj =new Login();

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
}
