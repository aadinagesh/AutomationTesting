
Feature: Login Page

 @smoketest
  Scenario: login to the application
    Given browser initialization
    When link access
    And provide valid username and password
    Then click on login button
    

  