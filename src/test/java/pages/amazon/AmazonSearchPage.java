package pages.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class AmazonSearchPage extends AmazonBasePage {


    public AmazonSearchPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//div[@data-component-type='s-search-result']")
    List<WebElement> products;


    public void navigateToProduct(int index){
        products.get(index).click();
    }
}
