package com.fdmgroup.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.tools.classfile.Annotation.element_value;

public class NaveBarPage {
	
	private static WebElement element;
	
	public static WebElement profileIcon(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[2]/a"));
		return element;
	}
	
}
