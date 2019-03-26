package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;
import com.fdmgroup.webPage.LogInPage;
import com.fdmgroup.webPage.PasswordRecoveryPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class PasswordRecoveryStepDefinitionTest {

    private DriverUtilities driverUtilities;
    private WebDriver driver;

    @Given("^User clicks on the forgot password link$")
    public void clickForgetPasswordLink() {
        driverUtilities = DriverUtilities.getInstanceOfDriverUtilities();
        driver = driverUtilities.getDriver();
        // driver.get("http://");
        PasswordRecoveryPage.forgotPasswordLink(driver).click();

    }

    @When("^User enters valid username$")
    public void enterValidUsername() throws InterruptedException {
        Thread.sleep(500);
        PasswordRecoveryPage.usernameField(driver).sendKeys(DataFile.username);
    }

    @When("^User selects valid security question$")
    public void selectValidSecurityQuestion() {
        Select questionSelected = new Select(PasswordRecoveryPage.securityQuestionDropDown(driver));
        questionSelected.selectByVisibleText(DataFile.secretQuestion);
    }

    @When("^User enters valid security answer$")
    public void enterValidSecurityAnswer() {
        PasswordRecoveryPage.securityAnswerField(driver).sendKeys(DataFile.secretAnswer);
    }

    @When("^User enters valid new password$")
    public void enterValidNewPassword() {
        PasswordRecoveryPage.newPasswordField(driver).sendKeys(DataFile.newPassword);
    }

    @When("^User enters matching new password$")
    public void enterMatchingNewPassword() {
        PasswordRecoveryPage.confirmNewPasswordField(driver).sendKeys(DataFile.newPassword);
    }

    @When("^User enters invalid username$")
    public void enterInvalidUsername() throws InterruptedException {
        Thread.sleep(500);
        PasswordRecoveryPage.usernameField(driver).sendKeys(DataFile.invalidUsername);
    }

    @When("^User selects invalid security question$")
    public void selectInvalidSecurityQuestion() {
        Select questionSelected = new Select(PasswordRecoveryPage.securityQuestionDropDown(driver));
        questionSelected.selectByVisibleText(DataFile.invalidSecretQuestion);
    }

    @When("^User enters invalid security answer$")
    public void enterInvalidSecurityAnswer() {
        PasswordRecoveryPage.securityAnswerField(driver).sendKeys(DataFile.invalidSecretAnswer);
    }

    @When("^User enters not matching new password$")
    public void enterNotMatchingNewPassword() {
        PasswordRecoveryPage.newPasswordField(driver).sendKeys(DataFile.newPassword);
        PasswordRecoveryPage.confirmNewPasswordField(driver).sendKeys(DataFile.invalidNewPassword);
    }

    @Then("^Password successfully changed message will be displayed$")
    public void verifySuccessMessage() {
        System.out.println(DataFile.wip);
        assertEquals(DataFile.wip, "");
    }

    @Then("^Password change is unsuccessful message will be displayed$")
    public void verifyFailureMessage() {
        System.out.println(DataFile.wip);
        assertEquals(DataFile.wip, "");
    }
}
