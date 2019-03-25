package com.fdmgroup.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.util.DriverUtilities;
import com.fdmgroup.webPage.AdminPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AdminStepDefinitionTest {
	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Given("^Admin navigate to the trainee page$")
	public void navigateToTraineePage() {
		driverUtilities = DriverUtilities.getInstanceOfDriverUtilities();
        driver = driverUtilities.getDriver();
		driver.get("http://localhost:8088/PingU/users");
		AdminPage.traineesLink(driver).click();
	}
	
	@When("^Admin moves scroll bar of table$")
	public void scrollTable() throws InterruptedException {
		WebElement tableScrollBar = AdminPage.tableScrollBar(driver);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", tableScrollBar);
		Thread.sleep(3000);
	}
	
	@When("^Clik on actions tab$")
	public void actionsButton() {
		AdminPage.actionsLink(driver).click();
	}
	
}
