Feature: Test Login funtionality1

#Scenario Outline: Check login is successful with valid credentials
#
#Given Browser is open1
#And User is on login Page1 
#When User enter <username> and <password1>
#And User Clicks on Login
#Then User is navigated to the home page1
#
#Examples:
#|username|password1|
#|Namrata|Namrata|
#|Namo|123|
#|NYC| 1234|

#@Test1
#Scenario Outline: Check login is successful with valid credentials 
#
#Given Browser is open1
#And User is on login Page1 
#When User enter <username> and <password1>
#And User Clicks on Login
#Then User is navigated to the home page1
#And User will Click on Open New Account
#When User will Select Account Type and Trasfer fund amount
#And User will click on Open New Account 
#Then User Open an Account
#
#
#Examples:
#|username|password1|
#|Namrata|Namrata|
#
#@Test2
#Scenario Outline: Check login is successful with valid credentials 
#
#Given Browser is open1
#And User is on login Page1 
#When User enter <username> and <password1>
#And User Clicks on Login
#Then User is navigated to the home page1
#And User will Click on Transfer Funds
#When User will Enter the Amount
#And Click on Transfer Funds
#Then Transfer has been Completed 
#
#
#Examples:
#|username|password1|
#|Namrata|Namrata|

@Test3
Scenario Outline: Check Account Activity of User from Home Page

Given Browser is open1
And User is on login Page1 
When User enter <username> and <password1>
And User Clicks on Login
Then User is navigated to the home page1
And User will Click on Account Activity
When User will Click on Account
When select the Avtivity Period
And User will select Type
And User will Click on GO
Then Transfer Fund will show


Examples:
|username|password1|
|Namrata|Namrata|
 