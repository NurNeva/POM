package pages.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;

public class AmazonProductPage extends AmazonBasePage{


    public AmazonProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "add-to-cart-button")
    WebElement btnAddToCart;


    @FindBy(xpath = "//span[@id='attachSiNoCoverage']")
    WebElement extraBtn;

    public void addProductToCart(){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart)).click();
    }

    public void getExtraBtn(){

        extraBtn.click();
    }

}
