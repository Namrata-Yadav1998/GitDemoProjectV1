Feature: Check Home Page Functionality

Background: user is logged in
Given User is on login Page
When User enters username and Password
And Click on Login button
Then User is navigated to the Home Page

  Scenario: Check Logout Link
    When User clicks on Welcome Link
    Then logout link is displayed

  Scenario: Verify quick launch tollbar is present
    When user clicks on dashboard Link
    Then Quick Launch toolbar is displayed
