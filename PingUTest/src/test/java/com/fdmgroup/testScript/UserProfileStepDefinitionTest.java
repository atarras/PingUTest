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

	/*@Given("^User launches web browser$")
	public void launchWebBrowser() {
		driverUtilities = DriverUtilities.getInstanceOfDriverUtilities();
		driver = driverUtilities.getDriver();
	}

	@Given("^User enters the web homepage url in browser$")
	public void nagivateToHomePage() {
		driver.get("http://localhost:8088/PingU/");
	}

	@Given("^User can log into the application with valid username and password$")
	 public void enterValidUsernameInvalidPassword() {
        LogInPage.usernameField(driver).sendKeys("jdoe");
        LogInPage.passwordField(driver).sendKeys("1234");
    }
	*/
	@Given("^Click on profile icon$")
	public void profileIcon() {
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
