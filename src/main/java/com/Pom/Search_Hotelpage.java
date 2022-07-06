package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotelpage {

	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	public Search_Hotelpage(WebDriver driver1) {
		Search_Hotelpage.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(xpath = "(//select)[3]")
	private WebElement roomtype;

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	@FindBy(xpath="(//select)[4]")
	private WebElement noofrooms;
	
	@FindBy(xpath="(//input)[2]")
	private WebElement datein;

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getDatein() {
		return datein;
	}
	
	@FindBy(xpath="(//input)[3]")
	private WebElement dateout;
	
	@FindBy(xpath="(//select)[5]")
	private WebElement adultsperroom;
	
	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath="(//select)[6]")
	private WebElement childrenperroom;
	
	@FindBy(xpath="(//input)[4]")
	private WebElement search;
	
	
	
	
	
	
	
	
	
}
