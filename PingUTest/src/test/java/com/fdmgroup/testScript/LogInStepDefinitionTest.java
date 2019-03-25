package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.testData.DataFile;
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
        driver.manage().window().maximize();
    }

    @Given("^User navigate to the home page$")
    public void navigateToLogInPage() {
        driver.get("http://localhost:8088/PingU/");
    }


    @When("^User enters valid username and valid password$")
    public void enterValidUsernameValidPassword() throws InterruptedException {
        LogInPage.usernameField(driver).sendKeys(DataFile.username);
        LogInPage.passwordField(driver).sendKeys(DataFile.password);
    }

    @When("^User enters valid username but invalid password$")
    public void enterValidUsernameInvalidPassword() {
        LogInPage.usernameField(driver).sendKeys("wilson");
        LogInPage.passwordField(driver).sendKeys("qweasd");
    }

    @When("^User enters invalid username but valid password$")
    public void enterInvalidUsernameValidPassword() {
        LogInPage.usernameField(driver).sendKeys("wils");
        LogInPage.passwordField(driver).sendKeys("qweasdzxc");
    }

    @When("^User enters invalid username and invalid password$")
    public void enterInvalidUsernameInvalidPassword() {
        LogInPage.usernameField(driver).sendKeys("wils");
        LogInPage.passwordField(driver).sendKeys("qweasd");
    }

    @When("^User leaves username and password fields blank$")
    public void emptyUsernamePassword() {
        LogInPage.usernameField(driver).sendKeys("");
        LogInPage.passwordField(driver).sendKeys("");
    }

    @When("^User clicks on Login button$")
    public void clickLoginButton() {
        LogInPage.submitButton(driver).submit();
    }

    @Then("^User will be redirected to the home page$")
    public void verifyHomePageLabel() {
        assertEquals(LogInPage.welcomeMessage(driver).getText(), DataFile.actualWelcomeMessage);
    }

    @Then("^Invalid username/password error message is displayed$")
    public void verifyErrorMessageLabel() {
        String actualErrorMessage = "Incorrect Username or Password! Please try again.";
        assertEquals(LogInPage.errorMessage(driver).getText(), actualErrorMessage);
    }
}
