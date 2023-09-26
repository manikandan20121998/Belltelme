@E2E
Feature: To validate thr login functionality of belltelme application
Background:
Given The user should be in belltelme application

@tc1
Scenario: To validate the login credentials

When The user has enter the username and password then click loginbtn
And the user has pass the search of wanted item
Then the user get product bill
@tc2
Scenario: To get all mobile details on iphone

When the user click the smart phone icon
When the user click iphone subtitle
And the user get all iphone details 

@tc3
Scenario: To screenshot company about details

When to scroll down last down
Then To take screenshot on that place

@tc4
Scenario: To get all amount of watches 

When To click smartwatch option
When To click iBrit option
When to get all amount of watches list

@tc5
Scenario: to subscribe belltelme instagram icon

When to scroll down till bottom of page
Then the user has click to instra icon
Then screen shot on that page

@tc6
Scenario: to get all datas on search box dropdown
When to click search near button of dropdown
Then to collect all datas and select if present samsung

@tc7
Scenario: to get realme mobilr prices and models
When to click on powerbank section
Then to click on realme option
And get all mobile models with price

