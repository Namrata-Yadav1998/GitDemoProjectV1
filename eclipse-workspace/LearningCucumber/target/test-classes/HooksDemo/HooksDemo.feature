Feature: Check Login Functionality
@Smoke
  Scenario: 
    Given User is on Login Page
    When user enters valid username and Password
    And Click on Logins
    Then User is navigated to the home Page

    Scenario: 
    Given User is on Login Page
    When user enters valid username and Password
    And Click on Logins
    Then User is navigated to the home Page