package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotelpage {

	public static WebDriver driver;

	public Book_Hotelpage(WebDriver driver1) {
		Book_Hotelpage.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input)[11]")
	private WebElement firstname;

	@FindBy(xpath = "(//input)[12]")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(xpath = "(//input)[13]")
	private WebElement cardno;

	@FindBy(xpath = "(//select)[1]")
	private WebElement cardtype;

	@FindBy(xpath = "(//select)[2]")
	private WebElement month;

	@FindBy(xpath = "(//select)[3]")
	private WebElement expyear;

	@FindBy(xpath = "(//input)[14]")
	private WebElement cvv;

	@FindBy(xpath = "(//input)[15]")
	private WebElement book;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

}
