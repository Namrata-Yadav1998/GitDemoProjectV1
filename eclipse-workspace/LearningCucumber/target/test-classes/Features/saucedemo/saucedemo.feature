Feature: User is able to purchase Item successfully

Scenario: User is able to purchase Item successfully

Given open saucedemo Web browser
When User Enters Username and Password
And Click on Login
And User is on Swag Labs Screen
And Enter Two Item in Add to cart
And Click on Add to Cart 
And Navigate to Your cart screen
And Click on Checkout
And Enter First Name andd Last Name and Zipcode
And Click on Continue
And Navigate to Checkout: Overview
And Click on Finish
Then Navigate to Thank you for your order! Screen