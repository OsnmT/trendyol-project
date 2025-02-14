package com.trendyol.step_definitions;

import com.trendyol.pages.TrendyolSearchPage;
import com.trendyol.utilities.ConfigurationReader;
import com.trendyol.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Trendyol_StepDefinitions {

    TrendyolSearchPage trendyolSearchPage = new TrendyolSearchPage();

    @Given("user is on the trendyol main page")
    public void user_is_on_the_trendyol_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }
    @When("user search item on the search box")
    public void user_search_item_on_the_search_box() {
        trendyolSearchPage.searchInputBox.sendKeys("iphone 16"+ Keys.ENTER);
    }
    @Then("user sees the result")
    public void user_sees_the_result() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("iphone 16"));
    }
}
