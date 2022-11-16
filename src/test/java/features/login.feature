Feature: Login
  Background:
  Given i am at Target Homepage for SignIn purpose
    And i click on sign in link from the Target homepage
    And i click on sign in button to navigate to sign in page


@login1
  Scenario: verify user sign in using valid email and valid password

    And i enter or phone number to sign in to Target
    And i enter password to sign in to Target
    When i click on SignIn button
    Then i should be able to Sign in successfully
@login
  Scenario: verify user sign in using invalid email or phone number and valid password

    And i enter invalid email or phone number to sign in to Target
    And i enter password to sign in to Target
    When i click on SignIn button
    Then i should not be able to Sign in successfully

