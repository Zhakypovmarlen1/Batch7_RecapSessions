@regression
Feature: Sign up functionality testing

  @sign-up
  Scenario: user signs up with correct credentials
    Given user is on login page
    Then user clicks on sign up button
    Then user fills out all the required fields
    Then user has to verify if account is created successfully

    @sign-in
  Scenario: user signs in with correct credentials
    Given user is on login page
    Then user clicks on sign in button
    Then user gives proper username and password and clicks on sign in
    Then user verifies if he is signed it




