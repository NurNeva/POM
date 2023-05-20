package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.amazon.AmazonCartPage;
import pages.amazon.AmazonHomePage;
import pages.amazon.AmazonProductPage;
import pages.amazon.AmazonSearchPage;
import utils.Driver;

public class C04_TestCase {


    //https://www.amazon.com/ a gidilir
    //Arama kutusuna {keyword} yazıldıktan sonra arama yapılır
    //Sepete gidilir
    //Sepette alınan urunun sayısı çıkarılır
    //Sepet tutarı urunfiyatı *3 olarak bulunmalıdır


    // keywords = 'microphone', 'gaming keyboard', 'gaming mouse'
    // quantity = 2            , 3               ,  4


    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("https://www.amazon.com/");

        AmazonHomePage hp = new AmazonHomePage();
        hp.searchFor("microphone");

        AmazonSearchPage sp = new AmazonSearchPage();
        sp.navigateToProduct(1);

        AmazonProductPage pp = new AmazonProductPage();
        pp.addProductToCart();
        pp.getExtraBtn();




        Thread.sleep(3000);
        pp.navigateToCart();

        AmazonCartPage cp = new AmazonCartPage();

        cp.selectQuantity(3);

        Thread.sleep(1000);

        double expectedPrice = cp.getProductPrice() * 3;
        double actualPrice = cp.getSubTotalAmount();


        System.out.println(cp.getSubTotalAmount());
        Assert.assertEquals(actualPrice,expectedPrice);



        Driver.closeDriver();





    }

}
