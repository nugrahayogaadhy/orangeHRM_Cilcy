Feature: Edit Employee functionality
#  @Positive
  Scenario: Ensure employee successfully edit data
    Given user is at orangeHRM login page
    When user inputs valid username employee
    And user inputs valid password employee
    And user clicks on login button
    Then user is directed to home page
    When user clicks on My Info menu
    And user clicks on Nationality
    And user select Nationality
    And user clicks on Marital Status
    And user select Marital Status
    And user clicks on Gender
    And user select Gender
    And user clicks on Save button
    Then user is should success edit information
