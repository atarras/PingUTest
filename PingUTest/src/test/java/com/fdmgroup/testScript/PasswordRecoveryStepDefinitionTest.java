package com.fdmgroup.testScript;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.util.DriverUtilities;

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
        driver.get("http://");
    }

    @When("^User enters valid username$")
    public void z() {
    }

    @When("^User selects valid security question$")
    public void x() {
    }

    @When("^User enters valid security answer$")
    public void c() {
    }

    @When("^User enters valid new password$")
    public void v() {
    }

    @When("^User enters matching new password$")
    public void b() {
    }

    @When("^User enters invalid username$")
    public void n() {
    }

    @When("^User selects invalid security question$")
    public void m() {
    }

    @When("^User enters invalid security answer$")
    public void p() {
    }

    @When("^User enters not matching new password$")
    public void o() {
    }

    @When("^User enters leaves password fields blank$")
    public void i() {
    }

    @Then("^Password successfully changed message will be displayed$")
    public void u() {
    }

    @Then("^Password change is unsuccessful message will be displayed$")
    public void y() {
    }
}
