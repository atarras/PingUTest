package com.fdmgroup.testScript;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.util.DriverUtilities;
import com.fdmgroup.webPage.LogInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInStepDefinitionTest {

    private DriverUtilities driverUtilities;
    private WebDriver driver;

    @Given("^User launches web browser$")
    public void launchWebBrowser() {
        driverUtilities = DriverUtilities.getInstanceOfDriverUtilities();
        driver = driverUtilities.getDriver();
    }

    @Given("^User enters the web homepage url in browser$")
    public void nagivateToHomePage() {
        driver.get("http://");
    }

    @Given("^User navigate to the login page$")
    public void navigateToLogInPage() {
        driver.get("http://localhost:8088/PingU/login");
    }

    @When("^User enters valid username and valid password$")
    public void enterValidUsernameValidPassword() {
        LogInPage.usernameField(driver).sendKeys("");
        LogInPage.passwordField(driver).sendKeys("");
    }

    @When("^User enters valid username but invalid password$")
    public void enterValidUsernameInvalidPassword() {
        LogInPage.usernameField(driver).sendKeys("");
        LogInPage.passwordField(driver).sendKeys("");
    }

    @When("^User enters invalid username but valid password$")
    public void enterInvalidUsernameValidPassword() {
        LogInPage.usernameField(driver).sendKeys("");
        LogInPage.passwordField(driver).sendKeys("");
    }

    @When("^User enters invalid username and invalid password$")
    public void enterInvalidUsernameInvalidPassword() {
        LogInPage.usernameField(driver).sendKeys("");
        LogInPage.passwordField(driver).sendKeys("");
    }

    @When("^User leaves username and password fields blank$")
    public void emptyUsernamePassword() {
        LogInPage.usernameField(driver).sendKeys("");
        LogInPage.passwordField(driver).sendKeys("");
    }

    @When("^And User clicks on Login button$")
    public void clickLoginButton() {
        LogInPage.submitButton(driver).click();
    }

    @Then("^User will be redirected to the home page$")
    public void t() {
    }

    @Then("^Invalid username/password error message is displayed$")
    public void y() {
    }
}
