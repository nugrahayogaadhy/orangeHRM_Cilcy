Feature: Punch In and Punch Out functionality
#  @Positive
  Scenario: Ensure user successfully punch in and punch out
    Given user is at orangeHRM login page
    When user inputs valid username employee
    And user inputs valid password employee
    And user clicks on login button
    Then user is directed to home page
    And user clicks on clock Punch In icon
    And user inputs notes
    And user clicks on In button
    Then user should success Punch In
    And user is directed to Punch Out page
    And user inputs notes
    And user clicks on Out button
    Then user should success Punch Out

