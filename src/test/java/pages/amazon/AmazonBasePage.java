package pages.amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AmazonBasePage {

    public AmazonBasePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement txtSearch;


    @FindBy(id = "nav-cart")
    WebElement btnCart;

    public void searchFor(String key){
        txtSearch.sendKeys(key + Keys.ENTER);
    }

    public void navigateToCart(){
        btnCart.click();
    }


}
