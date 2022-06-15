package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class googleSearchDefinitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user is on Google search")
    public void user_is_on_google_search() {
        System.out.println("user is on Google search");
        Driver.getDriver().get("https://www.google.com/");
        googleSearchPage.IAggreeButton.click();

    }

    @Then("user should see search result about facebook")
    public void user_should_see_search_result_about_facebook() {
        System.out.println("user should see search result about facebook");
        googleSearchPage.searchBox.sendKeys("facebook" + Keys.ENTER);

    }

    @Then("user should see title is Google")
    public void userShouldSeeTitleIsGoogle() {
        System.out.println("user should see title is Google");
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as expected!",expectedTitle, actualTitle);
    }

    @When("user open page practice.cydeo.com")
    public void userOpenPagePracticeCydeoCom() {
        Driver.getDriver().get("https://practice.cydeo.com/");

    }

    @Then("user take all a tag elements")
    public void userTakeAllATagElements() {
        List<WebElement> aTags = googleSearchPage.aTags;
        for (WebElement aTag : aTags) {
            System.out.println(aTag.getText());
        }
    }
}