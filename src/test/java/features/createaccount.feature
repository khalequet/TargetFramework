Feature: Create Account
  Background:
    Given i am at Target Homepage
    And i click on sign in button
    And i click on create account

@signup1
  Scenario: verify user can create new account using valid information


    And i enter valid email address
    And i enter first name
    And i enter last name
    And i enter phone number
    And i enter create password
    When i click on the create account button
    Then i should be able to successfully create an account

  @signup
  Scenario: verify user can create new account using invalid information

    And i enter invalid email address
    And i enter first name
    And i enter last name
    And i enter phone number
    And i enter create invalid password
    When i click on the create account button
    Then i should not be able to successfully create an account