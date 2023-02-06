Feature: Login functionality
#  @Positive
  Scenario: Ensure admin successfully login
    Given admin is at orangeHRM login page
    When admin inputs valid username
    And admin inputs valid password
    And admin clicks on login button
    Then admin is redirected to home page