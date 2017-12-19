package com.sahabt.hepsiburada;

import org.openqa.selenium.By;

public class SearchAndBuyApple extends WebMain {

    public void searchAndBuyContinueGiftPackageAndWithLogin(){
        searchAnd();
        sleep(4);
        click(By.xpath("/html//div[@id='short-summary']//label[.='Hediye paketi istiyorum']"));
        sleep(1);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(1) .text"));
        sendKeys(By.cssSelector("#form-login .control-group:nth-of-type(1) [type]"),"tberkaksu@gmail.com");
        sendKeys(By.cssSelector("#password"),"123456A");
        click(By.cssSelector("#form-login button"));
        sleep(1);
        buyingWithGiftPacakgeAndNoSecure3D();
        quit();
    }
    public void searchAndBuyContinueGiftPackageAndWithLoginAndSecure3D(){
        searchAnd();
        sleep(4);
        click(By.xpath("/html//div[@id='short-summary']//label[.='Hediye paketi istiyorum']"));
        sleep(1);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(1) .text"));
        sendKeys(By.cssSelector("#form-login .control-group:nth-of-type(1) [type]"),"tberkaksu@gmail.com");
        sendKeys(By.cssSelector("#password"),"123456A");
        click(By.cssSelector("#form-login button"));sleep(1);
        buyingWithGiftPacakgeAndSecure3D();
        quit();
    }

    public void searchAndBuyContinueNoGiftPackageAndWithLogin(){
        searchAnd();sleep(2);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(1) .text"));
        sendKeys(By.cssSelector("#form-login .control-group:nth-of-type(1) [type]"),"tberkaksu@gmail.com");
        sendKeys(By.cssSelector("#password"),"123456A");
        click(By.cssSelector("#form-login button"));sleep(1);
        buyingWithNoGiftPacakgeAndNoSecure3D();
        quit();
    }
    public void searchAndBuyContinueNoGiftPackageAndWithLoginAndSecure3D(){
        searchAnd();sleep(1);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(1) .text"));
        sendKeys(By.cssSelector("#form-login .control-group:nth-of-type(1) [type]"),"tberkaksu@gmail.com");
        sendKeys(By.cssSelector("#password"),"123456A");
        click(By.cssSelector("#form-login button"));sleep(1);
        buyingWithNoGiftPacakgeAndSecure3D();
        quit();
    }

    public void searchAndBuyContinueWithGiftPackageAndSingUp(){
        searchAnd();sleep(4);
        click(By.xpath("/html//div[@id='short-summary']//label[.='Hediye paketi istiyorum']"));
        sleep(1);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(2) .text"));
        sendKeys(By.cssSelector("[class=\"col-md-6\"]:nth-of-type(1) [type]"),"mert");
        sendKeys(By.cssSelector("[class=\"col-md-6\"]:nth-of-type(2) [type]"),"aras");
        sendKeys(By.cssSelector("#form-user .control-group:nth-of-type(2) [type]"),"mertaras123@yandex.com");
        sendKeys(By.cssSelector("#password-register"),"123456A");
        sendKeys(By.cssSelector("#password-repeat"),"123456A");
        click(By.cssSelector("#form-user button"));sleep(1);
        buyingWithGiftPacakgeAndNoSecure3D();
        quit();
    }
    public void searchAndBuyContinueWithGiftPackageAndSingUpAndSecure3D(){
        searchAnd();sleep(4);
        click(By.xpath("/html//div[@id='short-summary']//label[.='Hediye paketi istiyorum']"));
        sleep(1);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(2) .text"));
        sendKeys(By.cssSelector("[class=\"col-md-6\"]:nth-of-type(1) [type]"),"mert");
        sendKeys(By.cssSelector("[class=\"col-md-6\"]:nth-of-type(2) [type]"),"aras");
        sendKeys(By.cssSelector("#form-user .control-group:nth-of-type(2) [type]"),"mertaras123@yandex.com");
        sendKeys(By.cssSelector("#password-register"),"123456A");
        sendKeys(By.cssSelector("#password-repeat"),"123456A");
        click(By.cssSelector("#form-user button"));sleep(1);
        buyingWithGiftPacakgeAndSecure3D();
        quit();
    }

    public void searchAndBuyContinueWithNoGiftPackageAndSingUp(){
        searchAnd();sleep(2);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(2) .text"));
        sendKeys(By.cssSelector("[class=\"col-md-6\"]:nth-of-type(1) [type]"),"berk");
        sendKeys(By.cssSelector("[class=\"col-md-6\"]:nth-of-type(2) [type]"),"akarsu");
        sendKeys(By.cssSelector("#form-user .control-group:nth-of-type(2) [type]"),"berkaksu123@yandex.com");
        sendKeys(By.cssSelector("#password-register"),"123456A");
        sendKeys(By.cssSelector("#password-repeat"),"123456A");
        click(By.cssSelector("#form-user button"));sleep(1);
        buyingWithNoGiftPacakgeAndNoSecure3D();
        quit();
    }
    public void searchAndBuyContinueWithNoGiftPackageAndSingUpAndSecure3D(){
        searchAnd();sleep(2);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(2) .text"));
        sendKeys(By.cssSelector("[class=\"col-md-6\"]:nth-of-type(1) [type]"),"berk");
        sendKeys(By.cssSelector("[class=\"col-md-6\"]:nth-of-type(2) [type]"),"akarsu");
        sendKeys(By.cssSelector("#form-user .control-group:nth-of-type(2) [type]"),"berkaksu123@yandex.com");
        sendKeys(By.cssSelector("#password-register"),"123456A");
        sendKeys(By.cssSelector("#password-repeat"),"123456A");
        click(By.cssSelector("#form-user button"));sleep(1);
        buyingWithNoGiftPacakgeAndSecure3D();
        quit();
    }

    public void searchAndBuyContinueWithGiftPackageNoSubscribe(){
        searchAnd();sleep(4);
        click(By.xpath("/html//div[@id='short-summary']//label[.='Hediye paketi istiyorum']"));
        sleep(1);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(3) .text"));
        sendKeys(By.cssSelector("#form-lazy-login [type=\"text\"]"),"mertooo@gmail.com");
        click(By.cssSelector("#form-lazy-login button"));sleep(1);
        buyingWithGiftPacakgeAndNoSecure3D();
        quit();
    }
    public void searchAndBuyContinueWithGiftPackageNoSubscribeAndSecure3D(){
        searchAnd();sleep(4);
        click(By.xpath("/html//div[@id='short-summary']//label[.='Hediye paketi istiyorum']"));
        sleep(1);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(3) .text"));
        sendKeys(By.cssSelector("#form-lazy-login [type=\"text\"]"),"mertooo@gmail.com");
        click(By.cssSelector("#form-lazy-login button"));sleep(1);
        buyingWithGiftPacakgeAndSecure3D();
        quit();
    }

    public void searchAndBuyContinueWithNoGiftPackageNoSubscribe(){
        searchAnd();
        sleep(3);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(3) .text"));
        sendKeys(By.cssSelector("#form-lazy-login [type=\"text\"]"),"mertooo@gmail.com");
        click(By.cssSelector("#form-lazy-login button"));sleep(1);
        buyingWithNoGiftPacakgeAndNoSecure3D();
        quit();
    }
    public void searchAndBuyContinueWithNoGiftPackageNoSubscribeAndSecure3D(){
        searchAnd();sleep(2);
        sleep(1);
        click(By.cssSelector(".btn-primary .text"));
        sleep(1);
        click(By.cssSelector(".login-selections .control-group:nth-of-type(3) .text"));
        sendKeys(By.cssSelector("#form-lazy-login [type=\"text\"]"),"mertooo@gmail.com");
        click(By.cssSelector("#form-lazy-login button"));sleep(1);
        buyingWithNoGiftPacakgeAndSecure3D();
        quit();
    }



    public void secure3D(){
        sleep(1);
        scroll(By.cssSelector("[for=\"is-three-d-secure\"]"));
        sleep(2);
        click(By.cssSelector("[for=\"is-three-d-secure\"]"));
        sleep(2);
        click(By.cssSelector(".icon-chevron-right"));
        sleep(2);
    }

    public void buyingWithGiftPacakgeAndSecure3D(){
        sleep(3);
        click(By.xpath("//div[@id='gift-box-container']//div[@class='gift-box-item-list']/ul[@class='product-list']/li//label[.=' ']"));
        click(By.cssSelector(".btn-primary"));
        sleep(5);
        sendKeys(By.cssSelector(".address-personal-fields .control-group:nth-of-type(1) [type]"),"Berk");
        sendKeys(By.cssSelector(".address-personal-fields .control-group:nth-of-type(2) [type]" ),"Aksu"  );
        click(By.cssSelector(".address-form .control-group:nth-child(2) .filter-option"));
        sleep(1);
        scroll(By.cssSelector(".address-form .control-group:nth-child(7) [type]"));
        click(By.cssSelector("[rel=\"152\"] .text"));
        click(By.cssSelector(".address-form .control-group:nth-child(3) .caret"));
        click(By.cssSelector(".address-form .control-group:nth-child(3) [rel=\"41\"] [tabindex]"));
        click(By.cssSelector(".address-form .control-group:nth-child(4) [type]"));
        click(By.cssSelector(".address-form .control-group:nth-child(4) [rel=\"24\"] [tabindex]"));
        sleep(3);
        click(By.cssSelector(".address-form .control-group:nth-child(5) button"));
        click(By.cssSelector(".address-form .control-group:nth-child(5) [rel=\"10\"] [tabindex]"));

        click(By.cssSelector(".address-form .form-section:nth-child(3) .control-group:nth-child(6) .control-label"));
        sendKeys(By.xpath("/html//textarea[@id='address']"),"Sadabad evleri g blok kat 3 numara 3");
        sleep(1);
        click(By.cssSelector(".address-form .control-group:nth-child(7) .control-label"));
        sendKeys(By.xpath("/html//input[@id='address-name']"),"Ev");
        sleep(1);
        click(By.cssSelector(".address-form .control-group:nth-child(8) .control-label"));
        sendKeys(By.xpath("/html//input[@id='zip-code']"),"34406");
        sleep(1);
        click(By.cssSelector(".address-form .form-section:nth-child(4) .control-label"));
        sendKeys(By.xpath("/html//input[@id='phone']"),"05514333097");
        sleep(1);

        click(By.xpath("//div[@id='short-summary']//button[@class='btn btn-primary full']/span[@class='text']"));

        sleep(4);

        sendKeys(By.cssSelector(".control-group:nth-of-type(1) [type]"),"5235 2900 0616 2674");
        sendKeys(By.cssSelector(".control-group:nth-of-type(2) [type]"),"Berk Aksu");
        click(By.cssSelector(".controls:nth-of-type(1) .caret"));
        click(By.cssSelector(".controls:nth-of-type(1) [rel=\"3\"] [tabindex]"));
        click(By.cssSelector(".controls:nth-of-type(2) [type]"));
        sleep(1);
        scroll(By.cssSelector(".controls:nth-of-type(2) [rel=\"5\"] .text"));
        click(By.cssSelector(".controls:nth-of-type(2) [rel=\"5\"] .text"));
        sendKeys(By.cssSelector(".controls.group [type]"),"918");
        click(By.cssSelector(".proceed-container .full:nth-of-type(1) .text"));
        sleep(3);
        secure3D();
    }
    public void buyingWithGiftPacakgeAndNoSecure3D(){
        sleep(3);
        click(By.xpath("//div[@id='gift-box-container']//div[@class='gift-box-item-list']/ul[@class='product-list']/li//label[.=' ']"));
        click(By.cssSelector(".btn-primary"));
        sleep(5);
        sendKeys(By.cssSelector(".address-personal-fields .control-group:nth-of-type(1) [type]"),"Berk");
        sendKeys(By.cssSelector(".address-personal-fields .control-group:nth-of-type(2) [type]" ),"Aksu"  );
        click(By.cssSelector(".address-form .control-group:nth-child(2) .filter-option"));
        sleep(1);
        scroll(By.cssSelector(".address-form .control-group:nth-child(7) [type]"));
        click(By.cssSelector("[rel=\"152\"] .text"));
        click(By.cssSelector(".address-form .control-group:nth-child(3) .caret"));
        click(By.cssSelector(".address-form .control-group:nth-child(3) [rel=\"41\"] [tabindex]"));
        click(By.cssSelector(".address-form .control-group:nth-child(4) [type]"));
        click(By.cssSelector(".address-form .control-group:nth-child(4) [rel=\"24\"] [tabindex]"));
        sleep(3);
        click(By.cssSelector(".address-form .control-group:nth-child(5) button"));
        click(By.cssSelector(".address-form .control-group:nth-child(5) [rel=\"10\"] [tabindex]"));

        click(By.cssSelector(".address-form .form-section:nth-child(3) .control-group:nth-child(6) .control-label"));
        sendKeys(By.xpath("/html//textarea[@id='address']"),"Sadabad evleri g blok kat 3 numara 3");
        sleep(1);
        click(By.cssSelector(".address-form .control-group:nth-child(7) .control-label"));
        sendKeys(By.xpath("/html//input[@id='address-name']"),"Ev");
        sleep(1);
        click(By.cssSelector(".address-form .control-group:nth-child(8) .control-label"));
        sendKeys(By.xpath("/html//input[@id='zip-code']"),"34406");
        sleep(1);
        click(By.cssSelector(".address-form .form-section:nth-child(4) .control-label"));
        sendKeys(By.xpath("/html//input[@id='phone']"),"05514333097");
        sleep(1);

        click(By.xpath("//div[@id='short-summary']//button[@class='btn btn-primary full']/span[@class='text']"));

        sleep(4);

        sendKeys(By.cssSelector(".control-group:nth-of-type(1) [type]"),"5235 2900 0616 2674");
        sendKeys(By.cssSelector(".control-group:nth-of-type(2) [type]"),"Berk Aksu");
        click(By.cssSelector(".controls:nth-of-type(1) .caret"));
        click(By.cssSelector(".controls:nth-of-type(1) [rel=\"3\"] [tabindex]"));
        click(By.cssSelector(".controls:nth-of-type(2) [type]"));
        sleep(1);
        scroll(By.cssSelector(".controls:nth-of-type(2) [rel=\"5\"] .text"));
        click(By.cssSelector(".controls:nth-of-type(2) [rel=\"5\"] .text"));
        sendKeys(By.cssSelector(".controls.group [type]"),"918");
        click(By.cssSelector(".proceed-container .full:nth-of-type(1) .text"));
        sleep(3);
        click(By.cssSelector(".icon-chevron-right"));
        sleep(2);
    }

    public void buyingWithNoGiftPacakgeAndSecure3D(){
       sleep(3);
        sendKeys(By.cssSelector(".address-personal-fields .control-group:nth-of-type(1) [type]"),"Berk");
        sendKeys(By.cssSelector(".address-personal-fields .control-group:nth-of-type(2) [type]" ),"Aksu"  );
        click(By.cssSelector(".address-form .control-group:nth-child(2) .filter-option"));
        sleep(1);
        scroll(By.cssSelector(".address-form .control-group:nth-child(7) [type]"));
        click(By.cssSelector("[rel=\"152\"] .text"));
        click(By.cssSelector(".address-form .control-group:nth-child(3) .caret"));
        click(By.cssSelector(".address-form .control-group:nth-child(3) [rel=\"41\"] [tabindex]"));
        click(By.cssSelector(".address-form .control-group:nth-child(4) [type]"));
        click(By.cssSelector(".address-form .control-group:nth-child(4) [rel=\"24\"] [tabindex]"));
        sleep(3);
        click(By.cssSelector(".address-form .control-group:nth-child(5) button"));
        click(By.cssSelector(".address-form .control-group:nth-child(5) [rel=\"10\"] [tabindex]"));

        click(By.cssSelector(".address-form .form-section:nth-child(3) .control-group:nth-child(6) .control-label"));
        sendKeys(By.xpath("/html//textarea[@id='address']"),"Sadabad evleri g blok kat 3 numara 3");
        sleep(1);
        click(By.cssSelector(".address-form .control-group:nth-child(7) .control-label"));
        sendKeys(By.xpath("/html//input[@id='address-name']"),"Ev");
        sleep(1);
        click(By.cssSelector(".address-form .control-group:nth-child(8) .control-label"));
        sendKeys(By.xpath("/html//input[@id='zip-code']"),"34406");
        sleep(1);
        click(By.cssSelector(".address-form .form-section:nth-child(4) .control-label"));
        sendKeys(By.xpath("/html//input[@id='phone']"),"05514333097");
        sleep(1);

        click(By.xpath("//div[@id='short-summary']//button[@class='btn btn-primary full']/span[@class='text']"));

        sleep(4);

        sendKeys(By.cssSelector(".control-group:nth-of-type(1) [type]"),"5235 2900 0616 2674");
        sendKeys(By.cssSelector(".control-group:nth-of-type(2) [type]"),"Berk Aksu");
        click(By.cssSelector(".controls:nth-of-type(1) .caret"));
        click(By.cssSelector(".controls:nth-of-type(1) [rel=\"3\"] [tabindex]"));
        click(By.cssSelector(".controls:nth-of-type(2) [type]"));
        sleep(1);
        scroll(By.cssSelector(".controls:nth-of-type(2) [rel=\"5\"] .text"));
        click(By.cssSelector(".controls:nth-of-type(2) [rel=\"5\"] .text"));
        sendKeys(By.cssSelector(".controls.group [type]"),"918");
        click(By.cssSelector(".proceed-container .full:nth-of-type(1) .text"));
        sleep(3);
        secure3D();
    }
    public void buyingWithNoGiftPacakgeAndNoSecure3D(){
        sleep(3);
        sendKeys(By.cssSelector(".address-personal-fields .control-group:nth-of-type(1) [type]"),"Berk");
        sendKeys(By.cssSelector(".address-personal-fields .control-group:nth-of-type(2) [type]" ),"Aksu"  );
        click(By.cssSelector(".address-form .control-group:nth-child(2) .filter-option"));
        sleep(1);
        scroll(By.cssSelector(".address-form .control-group:nth-child(7) [type]"));
        click(By.cssSelector("[rel=\"152\"] .text"));
        click(By.cssSelector(".address-form .control-group:nth-child(3) .caret"));
        click(By.cssSelector(".address-form .control-group:nth-child(3) [rel=\"41\"] [tabindex]"));
        click(By.cssSelector(".address-form .control-group:nth-child(4) [type]"));
        click(By.cssSelector(".address-form .control-group:nth-child(4) [rel=\"24\"] [tabindex]"));
        sleep(3);
        click(By.cssSelector(".address-form .control-group:nth-child(5) button"));
        click(By.cssSelector(".address-form .control-group:nth-child(5) [rel=\"10\"] [tabindex]"));

        click(By.cssSelector(".address-form .form-section:nth-child(3) .control-group:nth-child(6) .control-label"));
        sendKeys(By.xpath("/html//textarea[@id='address']"),"Sadabad evleri g blok kat 3 numara 3");
        sleep(1);
        click(By.cssSelector(".address-form .control-group:nth-child(7) .control-label"));
        sendKeys(By.xpath("/html//input[@id='address-name']"),"Ev");
        sleep(1);
        click(By.cssSelector(".address-form .control-group:nth-child(8) .control-label"));
        sendKeys(By.xpath("/html//input[@id='zip-code']"),"34406");
        sleep(1);
        click(By.cssSelector(".address-form .form-section:nth-child(4) .control-label"));
        sendKeys(By.xpath("/html//input[@id='phone']"),"05514333097");
        sleep(1);

        click(By.xpath("//div[@id='short-summary']//button[@class='btn btn-primary full']/span[@class='text']"));

        sleep(4);

        sendKeys(By.cssSelector(".control-group:nth-of-type(1) [type]"),"5235 2900 0616 2674");
        sendKeys(By.cssSelector(".control-group:nth-of-type(2) [type]"),"Berk Aksu");
        click(By.cssSelector(".controls:nth-of-type(1) .caret"));
        click(By.cssSelector(".controls:nth-of-type(1) [rel=\"3\"] [tabindex]"));
        click(By.cssSelector(".controls:nth-of-type(2) [type]"));
        sleep(1);
        scroll(By.cssSelector(".controls:nth-of-type(2) [rel=\"5\"] .text"));
        click(By.cssSelector(".controls:nth-of-type(2) [rel=\"5\"] .text"));
        sendKeys(By.cssSelector(".controls.group [type]"),"918");
        click(By.cssSelector(".proceed-container .full:nth-of-type(1) .text"));
        sleep(3);
        click(By.cssSelector(".icon-chevron-right"));
        sleep(2);

    }

    public void searchAnd(){
        setup();
        navigate("http://www.hepsiburada.com/");
        sleep(3);
        click(By.cssSelector(".insider-opt-in-disallow-button"));
        sleep(1);
        sendKeys(By.cssSelector("[maxlength=\"150\"]"),"HBV000007PV9M");
        click(By.cssSelector("#buttonProductSearch"));
        sleep(4);
        click(By.cssSelector(".has-variant-text"));
        sleep(1);
        click(By.cssSelector(".show-campaigns"));
        sleep(3);
        scrollUp(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));
        sleep(1);
        click(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));
        sleep(1);
    }



}
