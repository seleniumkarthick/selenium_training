Feature: Login2 To validate the login

Background:
Given the user launches the application

Scenario: one To verify slider option
Given the user launches the application
When the user navigates to home page from shop
Then the user validates the slider
And the user close the browser

Scenario: one To verify new arrival option
Given the user launches the application
When the user navigates to home page from shop
Then the user validates the new arrival
And the user close the browser

Scenario Outline: one To validate user details
Given user launches account page
When user provides "<Username>" and "<Password>"
Then user validates message
Examples:
|Username|Password|
|testing||
||testpassword|
|testing@gmail.com|eqqweqweqweqwewq|
|testing|test|