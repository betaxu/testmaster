package com.sahabt.hepsiburada;

import com.sun.beans.editors.ByteEditor;
import org.openqa.selenium.By;

public class SearchMouse extends WebMain {

    //3 ürün sayılı mouse ve bedava kargo
    public void searchMouse(){
        setup();
        navigate("http://www.hepsiburada.com/");
        sleep(3);
        click(By.cssSelector(".insider-opt-in-disallow-button"));
        sleep(1);
        sendKeys(By.cssSelector("[maxlength=\"150\"]"),"BD300723");
        click(By.cssSelector("#buttonProductSearch"));
        sleep(2);
        click(By.cssSelector(".product-title span"));
        sleep(1);
        for(int i=0;i<=1;i++){
            click(By.cssSelector(".icon-plus"));
        }
        //kampayaya bak
        click(By.cssSelector(".show-campaigns"));
        //Ürün Özelliklerine bul
        scroll(By.cssSelector("#productDescription"));
        //ürün özelliklerine tıkla
        click(By.cssSelector("#productDescription"));
        //sepet eklemeyi yukarı kaydırarak bul
        scroll(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));
        //Sepete eklmeye tıkla
        click(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));

    }


}
