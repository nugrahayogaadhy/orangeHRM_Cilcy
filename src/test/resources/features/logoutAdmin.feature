Feature: Logout functionality
#  @Positive
  Scenario: Ensure admin successfully logout
    Given admin is redirected to home page cek
    When admin clicks on profile icon
    And admin clicks on logout button
    Then admin is at orangeHRM login page