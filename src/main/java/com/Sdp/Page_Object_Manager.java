package com.Sdp;

import org.openqa.selenium.WebDriver;

import com.Pom.Adactin_Homepage;
import com.Pom.Book_Hotelpage;
import com.Pom.Search_Hotelpage;
import com.Pom.Select_Hotelpage;

public class Page_Object_Manager {

	public static WebDriver driver;

	public Page_Object_Manager(WebDriver driver1) {
		Page_Object_Manager.driver = driver1;
	}

	private Adactin_Homepage ah;

	private Book_Hotelpage bh;

	private Search_Hotelpage sh;

	private Select_Hotelpage sp;

	public static WebDriver getDriver() {
		return driver;
	}

	public Adactin_Homepage getAh() {
		ah = new Adactin_Homepage(driver);
		return ah;
	}

	public Book_Hotelpage getBh() {
		bh= new Book_Hotelpage(driver);
		return bh;
	}

	public Search_Hotelpage getSh() {
		sh= new Search_Hotelpage(driver);
		return sh;
	}

	public Select_Hotelpage getSp() {
		sp= new Select_Hotelpage(driver);
		return sp;
	}

}
