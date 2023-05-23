package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I enter username$")
    public void iEnterUsername() {
        new LoginPage().enterUsername("Admin");
    }


    @And("^I enter password$")
    public void iEnterPassword() {
        new LoginPage().enterPassword("admin123");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }

    @And("^I should verify WelCome message$")
    public void iShouldVerifyWelComeMessage() {
        new DashboardPage().getDashboardText();
    }

    @Then("^I verify the logo$")
    public void iShouldVerifyTheLogo() {
        new LoginPage().getLogoHRForALL();
    }

    @Then("^I navigate to Dashboard page$")
    public void iNavigateToDashboardPage() {
    }

    @Then("^I click on User Profile Logo$")
    public void iClickOnUserProfileLogo() {
        new DashboardPage().clickOnUserProfileLogo();
    }


    @And("^I mouse hoover on logout and click$")
    public void iMouseHooverOnLogoutAndClick() {
        new DashboardPage().mouseHooverOnLogoutAndClick();
    }


    @And("^I verify the text Login Panel is displayed$")
    public void iVerifyTheTextLoginPanelIsDisplayed() {
        new LoginPage().loginPanelDisplayed();
    }


}