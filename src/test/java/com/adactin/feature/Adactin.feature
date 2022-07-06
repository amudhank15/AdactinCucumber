Feature: Hotel booking in adactin application 

@smokeTest
Scenario: user login in the adactin application 
	Given user Launch the application 
	When user enter the username in username field 
	And user Enter the password in password field 
	Then user click the login button and it navigate to search hotel page 
	
Scenario: user select and search the room and details in the search hotel page 
	When user Select the location 
	And user select the hotel 
	And user select the room type 
	And user select the number of rooms 
	And user select the check in date 
	And user select the check out date 
	And user select the adults per room 
	And user select the children per room 
	Then user click on the search button and it navigates to select hotel 
	
Scenario: user select the Hotel 
	When user click the select button 
	Then user click on the continue button and it navigates to book a hotel 
	
Scenario: user book a hotel and details in the book a hotel 
	When user enter the firstname in the firstname field 
	And user enter the lastname in the lastname field 
	And user enter the billing address in the billing address field 
	And user enter the card no in the card no field 
	And user select the credit card type 
	And user the expiry date and select month 
	And user the expiry date and select year
	And user select the cvv number in the number field 
	Then user click on the book now button and it navigates to booking conformation page 
	
	
