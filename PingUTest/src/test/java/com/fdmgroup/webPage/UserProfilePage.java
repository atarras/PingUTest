package com.fdmgroup.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserProfilePage {

	private static WebElement element;

	
	public static WebElement countryField(WebDriver driver) {
		element = driver.findElement(By.id("country"));
		return element;
	}
	
	public static WebElement cityField(WebDriver driver) {
		element = driver.findElement(By.id("city"));
		return element;
	}
	
	public static WebElement phoneField(WebDriver driver) {
		element = driver.findElement(By.id("phone"));
		return element;
	}
	
	public static WebElement submitButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\'registrationForm\']/div[4]/div/button[1]"));
		return element;
	}
	
	public static WebElement resetButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\'registrationForm\']/div[4]/div/button[2]"));
		return element;
	}
	
	public static WebElement passwordSecurityLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Password and Security"));
		return element;
	}
	
	public static WebElement oldPasswordField(WebDriver driver) {
		element = driver.findElement(By.id("old-password"));
		return element;
	}
	
	public static WebElement newPasswordField(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='new-password']"));
		return element;
	}
	
	public static WebElement confirmNewPasswordField(WebDriver driver) {
		element = driver.findElement(By.name("new-password"));
		return element;
	}
	
	public static WebElement newSecurityAnswerField(WebDriver driver) {
		element = driver.findElement(By.name("security-answer"));
		return element;
	}
	
	public static WebElement submitButtonForPasswordAndSecurity(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='securityForm']/div[5]/div/button[1]"));
		return element;
	}
	
	public static WebElement resetButtonForPasswordAndSecurity(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='securityForm']/div[5]/div/button[2]"));
		return element;
	}
}
