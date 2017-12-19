package com.sahabt.hepsiburada;



import org.openqa.selenium.By;



        public class Login extends  WebMain {



             public void trueEmailTruePassword(String email, String password) {
                 login(email, password);
             }
             public void emptyEmailAndPassword(String email, String password) {
                login(email, password);
            }
             public void falseEmailAndTruePassword(String email, String password) {
                login(email, password);
            }
             public void trueEmailFalsePassword(String email, String password) {
                 login(email, password);
             }
             public void falseEmailFalsePassword(String email, String password) {
                  login(email, password);
             }
             public void EmailAndEmptyPassword(String email, String password) {
                 login(email, password);
             }
             public void emptyEmailAndEmptyPassword(String email, String password) {
                 login(email, password);
             }

             public void login(String email, String password) {


                //Hepsiburada.com a gitememizi sağlar
                navigate("http://www.hepsiburada.com/");
                click(By.cssSelector("#myAccount .cart-copy:nth-of-type(2)"));
                sleep(1);
                click(By.cssSelector("#login"));
                sleep(1);
                click(By.cssSelector(".login-selections .control-group:nth-of-type(1) .text"));

                sendKeys(By.cssSelector("#form-login .control-group:nth-of-type(1) [type]"), email);
                sendKeys(By.cssSelector("#password"), password);

                click(By.cssSelector("#form-login button"));



            }


        }




