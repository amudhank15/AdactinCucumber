package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.PropertiesFile.File_Reader_Manager;
import com.Sdp.Page_Object_Manager;
import com.adactin.baseclass.Base_Class;
import com.adactin.runner.Adactin_Runner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defintion extends Base_Class {

	public static WebDriver driver = Adactin_Runner.driver;

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Launch the application$")
	public void user_Launch_the_application() throws Throwable {

		String url = File_Reader_Manager.getInstance().getInstanceCr().getUrl();

		geturl("https://adactinhotelapp.com/");

	}

	@When("^user enter the username in username field$")
	public void user_enter_the_username_in_username_field() throws Throwable {
		inputText(pom.getAh().getUsername(), "amudhank15");

	}

	@When("^user Enter the password in password field$")
	public void user_Enter_the_password_in_password_field() throws Throwable {
		inputText(pom.getAh().getPassword(), "virat@123");

	}

	@Then("^user click the login button and it navigate to search hotel page$")
	public void user_click_the_login_button_and_it_navigate_to_search_hotel_page() throws Throwable {
		clickonElement(pom.getAh().getLogin());
	}

	@When("^user Select the location$")
	public void user_Select_the_location() throws Throwable {
		dropdown(pom.getSh().getLocation(), "byvalue", "Sydney");

	}

	@When("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		dropdown(pom.getSh().getHotels(), "byvalue", "Hotel Creek");

	}

	@When("^user select the room type$")
	public void user_select_the_room_type() throws Throwable {
		dropdown(pom.getSh().getRoomtype(), "byvalue", "Standard");

	}

	@When("^user select the number of rooms$")
	public void user_select_the_number_of_rooms() throws Throwable {
		dropdown(pom.getSh().getNoofrooms(), "byvalue", "2");

	}

	@When("^user select the check in date$")
	public void user_select_the_check_in_date() throws Throwable {
		inputText(pom.getSh().getDatein(), "18/03/2022");

	}

	@When("^user select the check out date$")
	public void user_select_the_check_out_date() throws Throwable {
		inputText(pom.getSh().getDateout(), "21/03/2022");

	}

	@When("^user select the adults per room$")
	public void user_select_the_adults_per_room() throws Throwable {
		dropdown(pom.getSh().getAdultsperroom(), "byvalue", "1");

	}

	@When("^user select the children per room$")
	public void user_select_the_children_per_room() throws Throwable {
		dropdown(pom.getSh().getChildrenperroom(), "byvalue", "1");

	}

	@Then("^user click on the search button and it navigates to select hotel$")
	public void user_click_on_the_search_button_and_it_navigates_to_select_hotel() throws Throwable {
		clickonElement(pom.getSh().getSearch());

	}

	@When("^user click the select button$")
	public void user_click_the_select_button() throws Throwable {
		clickonElement(pom.getSp().getRadiobutton());

	}

	@Then("^user click on the continue button and it navigates to book a hotel$")
	public void user_click_on_the_continue_button_and_it_navigates_to_book_a_hotel() throws Throwable {
		clickonElement(pom.getSp().getContinueclick());

	}

	@When("^user enter the firstname in the firstname field$")
	public void user_enter_the_firstname_in_the_firstname_field() throws Throwable {
		inputText(pom.getBh().getFirstname(), "Amudhan");

	}

	@When("^user enter the lastname in the lastname field$")
	public void user_enter_the_lastname_in_the_lastname_field() throws Throwable {
		inputText(pom.getBh().getLastname(), "Aston");

	}

	@When("^user enter the billing address in the billing address field$")
	public void user_enter_the_billing_address_in_the_billing_address_field() throws Throwable {
		inputText(pom.getBh().getAddress(), "No:15 kodambakkam, chennai, 600017");

	}

	@When("^user enter the card no in the card no field$")
	public void user_enter_the_card_no_in_the_card_no_field() throws Throwable {
		inputText(pom.getBh().getCardno(), "2522452623456236");

	}

	@When("^user select the credit card type$")
	public void user_select_the_credit_card_type() throws Throwable {
		dropdown(pom.getBh().getCardtype(), "byvisibletext", "American Express");

	}

	@When("^user the expiry date and select month$")
	public void user_the_expiry_date_and_select_month() throws Throwable {
		dropdown(pom.getBh().getMonth(), "byvalue", "7");

	}

	@When("^user the expiry date and select year$")
	public void user_the_expiry_date_and_select_year() throws Throwable {
		dropdown(pom.getBh().getExpyear(), "byvisibletext", "2022");
	}

	@When("^user select the cvv number in the number field$")
	public void user_select_the_cvv_number_in_the_number_field() throws Throwable {
		inputText(pom.getBh().getCvv(), "111");

	}

	@Then("^user click on the book now button and it navigates to booking conformation page$")
	public void user_click_on_the_book_now_button_and_it_navigates_to_booking_conformation_page() throws Throwable {
		clickonElement(pom.getBh().getBook());

	}

}
