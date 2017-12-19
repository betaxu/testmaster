package com.testmaster.Defacto;

import org.openqa.selenium.By;

public class LoginAndBuy extends WebMain {

    Login loginObj2 =new Login();

    public  void loginAndBuy(){
        loginObj2.login();
        click(By.cssSelector("#navbar-collapse-grid [href=\"\\/erkek\"] span"));

        click(By.cssSelector("._mCS_9 li:nth-of-type(1) gt"));
        sleep(1);
        scroll(By.cssSelector("#facetAccordion .panel-default:nth-of-type(3) [data-toggle]"));
        click(By.cssSelector("._mCS_17 li:nth-of-type(8) gt"));
        //renk secimi
        scroll(By.cssSelector("#facetAccordion .panel-default:nth-of-type(4) [data-toggle]"));
        click(By.cssSelector("#facetAccordion .panel-default:nth-of-type(5) [data-toggle]"));
        //renk seçimi
        sleep(1);
        click(By.xpath("//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Çivit Mavisi']"));
        sleep(1);
        scroll(By.cssSelector("#facetAccordion .panel-default:nth-of-type(4) [data-toggle]"));
        sleep(3);
        click(By.xpath("//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Gri']"));
        sleep(1);
        //sonraki sayfa
        scroll(By.cssSelector("#facetAccordion .panel-default:nth-of-type(5) [data-toggle]"));
        click(By.cssSelector("[src=\"https\\:\\/\\/defacto\\.img\\.sociaplus\\.com\\/140\\/T39KT3DZPJ\\.png\"]"));

        //ürüne tıkla


        click(By.cssSelector(" [src=\"\\/\\/dfcdn\\.defacto\\.com\\.tr\\/2\\/G5645AZ_17SM_IN75_01_01\\.jpg\"]"));
        //beden
        click(By.cssSelector(".productWidthHeight li:nth-of-type(4) span"));
        //miktar
        click(By.cssSelector("[class=\"col-lg-2 col-md-4 col-sm-4 col-xs-3 no-padding\"] .form-control"));
       //ikitane
        click(By.cssSelector("#Quantity > option:nth-child(2)"));
       //sepete ekle
        click(By.cssSelector("[class=\"product-detail col-lg-4 col-md-6 col-sm-6 col-xs-12 no-paddingL\"] [type=\"button\"]"));
        //sepete gir
        sleep(1);
        click(By.xpath("/html//a[@id='popupBasket_ComplateShopping']"));
       //hediye paketi
        sleep(1);
        click(By.cssSelector(".fa-square-o"));
        //devam
        sleep(1);
        click(By.cssSelector("button"));
        //ödemeye geç

        //adres tipine tıkla
        sleep(1);
        click(By.cssSelector("#ShippingAddressForm > .form-group:nth-child(1) [class=\"col-lg-10\"] .form-control"));
        //click adres tipi
        click(By.cssSelector("#Address_AddressTypeId > option:nth-child(2)"));
        //şehir seç
        click(By.cssSelector("#ShippingAddressForm > .form-group:nth-child(3) > [class=\"col-lg-4\"]:nth-child(2) .form-control"));
        sleep(2);
        click(By.xpath("//*[@id=\"Address_AddressCityId\"]/option[2]"));

        //semt
        sleep(1);
        click(By.cssSelector("#ShippingAddressForm > .form-group:nth-child(3) > [class=\"col-lg-4\"]:nth-child(4) .form-control"));
        sleep(1);
        click(By.xpath("//*[@id=\"Address_AddressCountyId\"]/option[25]"));
        //posta kodu
        sendKeys(By.cssSelector("#ShippingAddressForm .form-group:nth-of-type(4) .form-control"),"34406");
        //adres
        sendKeys(By.cssSelector("#ShippingAddressForm .form-group:nth-of-type(5) .form-control"),"nurtepe mahallesi sadabad evleri g blok no 3");
        //ad
        sendKeys(By.cssSelector(".form-group.top20 [class=\"col-lg-4\"]:nth-of-type(2) .form-control"),"berk");

        sendKeys(By.cssSelector(".form-group.top20 [class=\"form-control col-lg-6\"]"),"aksu");
        //cep
        sendKeys(By.cssSelector("#Address_AddressMobilePhone"),"5514333097");
        //kayıt
        click(By.cssSelector(".form-group [type=\"submit\"]"));
        sleep(9);
        //ödemeye geç
        click(By.cssSelector("[class=\"button-loading-submit-content col-xs-12\"] [type]"));
        sleep(9);

        click(By.cssSelector("[class=\"modal-header border-0 p-0\"] [aria-hidden]"));
        sleep(1);
        //KartNumarası
        sendKeys(By.cssSelector("[class=\"col-lg-8 col-md-8 col-sm-8 col-xs-12\"] [autocomplete]"),"5235290006162674");
        //son kullanma ay
        click(By.cssSelector(".form-control.input-sm"));
        sleep(1);
        click(By.xpath("//*[@id=\"Payment_ExpireMonth\"]/option[3]"));
        //son k yıl
        sleep(1);
        click(By.cssSelector("[class=\"col-lg-4 col-md-3 col-sm-3 col-xs-4 no-paddingL\"] .form-control.input-sm"));
        sleep(1);
        click(By.xpath("//*[@id=\"Payment_ExpireYear\"]/option[5]"));
        sleep(1);
        //Kart numarası
        sendKeys(By.cssSelector("[class=\"col-lg-2 col-md-2 col-sm-2 col-xs-3\"] [autocomplete]"),"335");
        //
        sleep(1);
        click(By.cssSelector("#IsCreditCardContractEnable"));
        //onay
        sleep(1);
        click(By.cssSelector("[class=\"button-loading-submit-content paymentBtn col-xs-12\"] [type]"));

        sleep(3);
    }
}
