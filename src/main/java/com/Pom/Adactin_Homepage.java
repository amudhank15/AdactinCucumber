package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Homepage {

	public static WebDriver driver;

	@FindBy(id = "username")

	private WebElement username;

	public Adactin_Homepage(WebDriver driver1) {
		Adactin_Homepage.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(id="password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	

}
