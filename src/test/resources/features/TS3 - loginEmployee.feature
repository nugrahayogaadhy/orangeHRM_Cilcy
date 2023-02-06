Feature: Login Employee functionality
#  @Positive
  Scenario: Ensure employee successfully login
    Given user is at orangeHRM login page
    When user inputs valid username employee
    And user inputs valid password employee
    And user clicks on login button
    Then user is directed to home page
    And user can see HRM menu