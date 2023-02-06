Feature: addEmployee functionality

  Scenario: Ensure admin successfully add user
    Given admin is at orangeHRM login page
    When admin inputs valid username
    And admin inputs valid password
    And admin clicks on login button
    And admin is redirected to home page
    And admin clicks on PIM menu and add employee menu
    And admin input first name and last name
    And admin filled employee id
    And admin clicks create login details
    And admin filled username
    And admin click status enabled
    And admin filled password
    And admin filled confirm password
    And admin clicks save button
    Then admin is redirected to PIM page