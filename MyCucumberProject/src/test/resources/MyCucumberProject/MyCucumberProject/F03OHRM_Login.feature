Feature: Orange HRM Login

  Scenario: To validate login with valid data
    Given Open Orange HRM
    When Enter valid username and valid password
    And Click on login button
    Then Login should be successful
    
Scenario: To validate login with invalid data
    Given Open Orange HRM in browser
    When Enter invalid username and invalid password
    And I Click on login button
    Then Error message should display
    