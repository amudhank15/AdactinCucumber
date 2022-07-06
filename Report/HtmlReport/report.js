$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel booking in adactin application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user login in the adactin application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the username in username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter the password in password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login button and it navigate to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defintion.user_Launch_the_application()"
});
formatter.result({
  "duration": 8829430600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defintion.user_enter_the_username_in_username_field()"
});
formatter.result({
  "duration": 459747800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defintion.user_Enter_the_password_in_password_field()"
});
formatter.result({
  "duration": 174677700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defintion.user_click_the_login_button_and_it_navigate_to_search_hotel_page()"
});
formatter.result({
  "duration": 1776186900,
  "status": "passed"
});
});