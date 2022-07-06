package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotelpage {

	public static WebDriver driver;

	public Select_Hotelpage(WebDriver driver1) {
		Select_Hotelpage.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input)[1]")
	private WebElement radiobutton;

	@FindBy(xpath = "(//input)[12]")
	private WebElement continueclick;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinueclick() {
		return continueclick;
	}
}
