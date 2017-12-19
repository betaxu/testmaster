package com.testmaster.Defacto;
import org.junit.Test;
public class LoginTest {
    Login  loginObj= new Login();

    @Test
    public void loginTest(){
        loginObj.login();
        loginObj.loginWithFacebook2();
        loginObj.loginWithFacebook1();
    }
}
