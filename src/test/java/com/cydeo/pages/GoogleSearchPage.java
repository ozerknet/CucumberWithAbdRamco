package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchPage {
    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(xpath = "//div[.='I agree']")
    public WebElement IAggreeButton;

    @FindBy(xpath = "//a")
    public List<WebElement> aTags;


}
