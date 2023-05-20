package pages.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class AmazonCartPage extends AmazonBasePage {

    public AmazonCartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "quantity")
    WebElement drpQuantity;

    @FindBy(xpath = "//div[@class='sc-item-price-block']/p/span")
    WebElement productPrice;


    @FindBy(id = "sc-subtotal-label-activecart")
    WebElement subtotalLabel;

    @FindBy(id = "sc-subtotal-amount-activecart")
    WebElement subtotalamount;


    public void selectQuantity(int quantity){
        Select select = new Select(drpQuantity);
        select.selectByIndex(quantity);
    }

    public double getProductPrice(){
        return Double.parseDouble(productPrice.getText().substring(1));
    }

    public double getSubTotalAmount(){
        System.out.println(subtotalamount.getText());

        return Double.parseDouble(subtotalamount.getText().substring(2));
    }


}
