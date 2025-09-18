@sanity
Feature: Login1 To validate the login


@smoke @regression @bug @ATS_2343
Scenario: To verify slider option
Given the user launches the application
When the user navigates to home page from shop
Then the user validates the slider
And the user close the browser

@smoke 
Scenario: To verify new arrival option
Given the user launches the application
When the user navigates to home page from shop
Then the user validates the new arrival
And the user close the browser

@smoke @regression
Scenario Outline: To validate user details
Given user launches account page
When user provides "<Username>" and "<Password>"
Then user validates message
Examples:
|Username|Password|
|testing||
||testpassword|
|testing@gmail.com|eqqweqweqweqwewq|
|testing|test|