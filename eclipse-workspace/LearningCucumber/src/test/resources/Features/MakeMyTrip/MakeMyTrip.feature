Feature: User is able to search flight from Make my trip website

Scenario: User is able to search flight

Given User is on Make my trip Web
When User click on cross
And Click on Round trip
And Select From City
And Select To City
And Select Departure date
And Select Return Date
And Click on Search
Then User will navigate to next screen