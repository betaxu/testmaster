package com.sahabt.hepsiburada;
import org.junit.Test;
public class SearchAndBuyAppleTest {
    SearchAndBuyApple searchandbuyappleObj = new SearchAndBuyApple();
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


}
