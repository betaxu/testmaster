package com.sahabt.hepsiburada;


import org.openqa.selenium.By;

public class SingUp extends WebMain {
    // Çalıştırdığınız zaman bilgileri değiştiriniz aksi taktirde hata verir

    //
    public void singUp1(String isim, String Soyisim, String email, String sifre){
        setup();
       //Hepsiburada.com a gitememizi sağlar
        navigate("http://www.hepsiburada.com/");
        //Giriş yap veya üye ol sekmesine tıklar
        click(By.xpath("/html//div[@id='myAccount']"));
        //Bir saniyelik bekleme yapar ardından üye ol butonuna tıklar
        sleep(1);
        click(By.linkText("Üye Ol"));
        //Üyelik Bilgilerinin girildiği kısım
        sendKeys(By.cssSelector("#form-user .col:nth-of-type(1) [type]"),isim);
        sendKeys(By.cssSelector(".col-right [type]"),Soyisim);
        sendKeys(By.cssSelector("#form-user .group:nth-of-type(2) [type]"),email);
        sendKeys(By.cssSelector("#password-register"),sifre);
        sendKeys(By.cssSelector("#password-repeat"),sifre);
        //Üyelik bilgilerinin onaylanması ve kullanıcı oluşturulması
        submit(By.cssSelector(".form-actions [type]"));

    }
    public void singUp2(String isim,String Soyisim,String email,String sifre){
        setup();
        //Hepsiburada.com a gitememizi sağlar
        navigate("http://www.hepsiburada.com/");
        //Giriş yap butonuna tıklar
        click(By.cssSelector("#myAccount .cart-copy:nth-of-type(2)"));
        sleep(1);
        click(By.cssSelector("#login"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(2) .text"));

        sendKeys(By.cssSelector("[class=\"col-md-6\"]:nth-of-type(1) [type]"),isim);
        sendKeys(By.cssSelector("[class=\"col-md-6\"]:nth-of-type(2) [type]"),Soyisim);
        sendKeys(By.cssSelector("#form-user .control-group:nth-of-type(2) [type]"),email);
        sendKeys(By.cssSelector("#password-register"),sifre);
        sendKeys(By.cssSelector("#password-repeat"),sifre);
        //Üyelik bilgilerinin onaylanması ve kullanıcı oluşturulması
        submit(By.cssSelector("#form-user button"));

    }

}
