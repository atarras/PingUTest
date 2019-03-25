package com.fdmgroup.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.util.DriverUtilities;
import com.fdmgroup.webPage.PasswordRecoveryPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class PasswordRecoveryStepDefinitionTest {

    private DriverUtilities driverUtilities = DriverUtilities.getInstanceOfDriverUtilities();
    private WebDriver driver = driverUtilities.getDriver();

    @Given("^User clicks on the forgot password link$")
    public void clickForgetPasswordLink() {
        PasswordRecoveryPage.forgotPasswordLink(driver).click();
    }

    @When("^User enters valid username$")
    public void enterValidUsername() throws InterruptedException {
        Thread.sleep(500);
        PasswordRecoveryPage.usernameField(driver).sendKeys("wilson");
    }

    @When("^User selects valid security question$")
    public void selectValidSecurityQuestion() {
        Select questionSelected = new Select(PasswordRecoveryPage.securityQuestionDropDown(driver));
        questionSelected.selectByVisibleText("Who is your childhood superhero?");
    }

    @When("^User enters valid security answer$")
    public void enterValidSecurityAnswer() {
        PasswordRecoveryPage.securityAnswerField(driver).sendKeys("fdm");
    }

    @When("^User enters valid new password$")
    public void enterValidNewPassword() {
        PasswordRecoveryPage.newPasswordField(driver).sendKeys("zxcasdqwe");
    }

    @When("^User enters matching new password$")
    public void enterMatchingNewPassword() {
        PasswordRecoveryPage.confirmNewPasswordField(driver).sendKeys("zxcasdqwe");
    }

    @When("^User enters invalid username$")
    public void enterInvalidUsername() throws InterruptedException {
        Thread.sleep(500);
        PasswordRecoveryPage.usernameField(driver).sendKeys("wils");
    }

    @When("^User selects invalid security question$")
    public void selectInvalidSecurityQuestion() {
        Select questionSelected = new Select(PasswordRecoveryPage.securityQuestionDropDown(driver));
        questionSelected.selectByVisibleText("What was the name of your first pet?");
    }

    @When("^User enters invalid security answer$")
    public void enterInvalidSecurityAnswer() {
        PasswordRecoveryPage.securityAnswerField(driver).sendKeys("mdf");
    }

    @When("^User enters not matching new password$")
    public void enterNotMatchingNewPassword() {
        PasswordRecoveryPage.newPasswordField(driver).sendKeys("zxcasdqwe");
        PasswordRecoveryPage.confirmNewPasswordField(driver).sendKeys("zxcasd");
    }

    @Then("^Password successfully changed message will be displayed$")
    public void verifySuccessMessage() {
        System.out.println("Work in progress.");
    }

    @Then("^Password change is unsuccessful message will be displayed$")
    public void verifyFailureMessage() {
        System.out.println("Work in progress.");
    }
}
