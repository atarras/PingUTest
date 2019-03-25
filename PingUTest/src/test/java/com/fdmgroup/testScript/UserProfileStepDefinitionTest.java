package com.fdmgroup.testScript;

import org.openqa.selenium.WebDriver;
import com.fdmgroup.util.DriverUtilities;
import com.fdmgroup.webPage.LogInPage;
import com.fdmgroup.webPage.NaveBarPage;
import com.fdmgroup.webPage.UserProfilePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserProfileStepDefinitionTest {
	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Given("^Click on profile icon$")
	public void profileIcon() {
		driverUtilities = DriverUtilities.getInstanceOfDriverUtilities();
        driver = driverUtilities.getDriver();
		NaveBarPage.profileIcon(driver).click();
	}
	
	@When("^Enter 'Germany' in country field$")
	public void enterCountryName() {
		UserProfilePage.countryField(driver).sendKeys("Germany");
	}
	
	@Then("^Click on submit button$")
	public void clickSubmitButton() {
		UserProfilePage.submitButton(driver).click();
	}
	
	@And("^User should get appropriate success message$")
	public void successMessageForCountryUpdat() {
		
	}
}
