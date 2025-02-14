package com.trendyol.pages;

import com.trendyol.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendyolSearchPage {

    public TrendyolSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement searchInputBox;

}
