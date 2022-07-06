package com.Runner;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.Sdp.Page_Object_Manager;
import com.adactin.baseclass.Base_Class;

public class Runner_Class extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

		geturl("https://adactinhotelapp.com/");

		inputText(pom.getAh().getUsername(), "amudhank15");

		inputText(pom.getAh().getPassword(), "virat@123");

		clickonElement(pom.getAh().getLogin());

		dropdown(pom.getSh().getLocation(), "byvalue", "Sydney");

		dropdown(pom.getSh().getHotels(), "byvalue", "Hotel Creek");

		dropdown(pom.getSh().getRoomtype(), "byvalue", "Standard");

		dropdown(pom.getSh().getNoofrooms(), "byvalue", "2");

		clear(pom.getSh().getDatein());

		inputText(pom.getSh().getDatein(), "18/03/2022");

		clear(pom.getSh().getDateout());

		inputText(pom.getSh().getDateout(), "21/03/2022");

		dropdown(pom.getSh().getAdultsperroom(), "byvalue", "1");

		dropdown(pom.getSh().getChildrenperroom(), "byvalue", "1");

		clickonElement(pom.getSh().getSearch());

		clickonElement(pom.getSp().getRadiobutton());

		clickonElement(pom.getSp().getContinueclick());

		inputText(pom.getBh().getFirstname(), "Amudhan");

		inputText(pom.getBh().getLastname(), "Aston");

		inputText(pom.getBh().getAddress(), "No:15 kodambakkam, chennai, 600017");

		inputText(pom.getBh().getCardno(), "2522452623456236");

		dropdown(pom.getBh().getCardtype(), "byvisibletext", "American Express");

		dropdown(pom.getBh().getMonth(), "byvalue", "7");

		dropdown(pom.getBh().getExpyear(), "byvisibletext", "2022");

		inputText(pom.getBh().getCvv(), "111");

		clickonElement(pom.getBh().getBook());
		
		
		

	}

}
