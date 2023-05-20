package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class C03_FindBysAll {



    // Ornek amacli yazilan bir classtir calistirmayiniz

    // Locatorlardan birinin saglanmasi yeterlidir. Bu ornegimizde button elementi olan
    // VEYA id si id5 olan tum elementler locate edilir

    @FindAll({
            @FindBy(xpath = "//button"),
            @FindBy(id = "id5")

    })
    public List<WebElement> elements;

    // Locatorlardan hepsi saglanmalidir. Bu ornegimizde button elementi
    // olan VE id si id5 olan elementler locate edilir

    @FindBys({
            @FindBy(xpath = "//button"),
            @FindBy(id = "id5")

    })  public List<WebElement> findBys;



}
