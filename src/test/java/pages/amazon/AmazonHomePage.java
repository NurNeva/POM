package pages.amazon;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AmazonHomePage extends AmazonBasePage {


    public AmazonHomePage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }







}
