package com.testmaster.Defacto;

import org.openqa.selenium.By;

    public class SingUp extends WebMain {

        public void singup(){
            setup();
            navigate("https://www.defacto.com.tr/");
            click(By.cssSelector(".btn-warning"));
            sendKeys(By.cssSelector("[class] [class=\"form-group col-lg-6 col-md-6 col-sm-6\"]:nth-of-type(1) .form-control"),"Berker");
            sendKeys(By.cssSelector("[class] [class=\"form-group col-lg-6 col-md-6 col-sm-6\"]:nth-of-type(2) .form-control"),"Akarsu");
            sendKeys(By.cssSelector("[class] [class=\"form-group col-lg-6 col-md-6 col-sm-6\"]:nth-of-type(4) .form-control"),"tberkaksu@gmail.com");
            sendKeys(By.cssSelector("[class] [class=\"form-group col-lg-6 col-md-6 col-sm-6\"]:nth-of-type(5) [autocomplete]"),"5514333097");
            click(By.cssSelector("[class=\"birthday-slct col-lg-8 col-xs-12\"] > .form-control.input-sm:nth-child(1)"));
            click(By.cssSelector("#RegisterModel_CustomerBirthDateDay > option:nth-child(4)"));
            click(By.cssSelector("[class=\"birthday-slct col-lg-8 col-xs-12\"] > .form-control.input-sm:nth-child(2)"));
            click(By.cssSelector("#RegisterModel_CustomerBirthDateMonth > option:nth-child(5)"));
            click(By.cssSelector("[class=\"birthday-slct col-lg-8 col-xs-12\"] > .form-control.input-sm:nth-child(3)"));
            click(By.cssSelector("#RegisterModel_CustomerBirthDateYear > option:nth-child(12)"));
            click(By.cssSelector("[name=\"RegisterModel\\.Gender\"]"));
            click(By.cssSelector("#RegisterForm > div.col-lg-8.col-md-8.col-sm-10.col-xs-12.no-padding-mobil > div > div.form-group.col-lg-3.col-md-3.col-sm-3 > select > option:nth-child(2)"));
            sendKeys(By.cssSelector("[class] [class=\"form-group col-lg-6 col-md-6 col-sm-6\"]:nth-child(13) [autocomplete]"),"123456A");
            sendKeys(By.cssSelector("[class] [class=\"form-group col-lg-6 col-md-6 col-sm-6\"]:nth-child(14) [autocomplete]"),"123456A");
            sleep(1);
            click(By.cssSelector("[for=\"RegisterModel_CustomerIsApprovedContract\"] [data-val]"));
            click(By.cssSelector("[type=\"submit\"]"));
            sleep( 6);
            quit();
        }

    }


