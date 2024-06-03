Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  @Regression
  Scenario: Create a citizenship with parameter
    When Create a citizenship name as "ulvCTZName4" code as "ulvCTZName4"
    Then Success message should be displayed

  @Regression
  Scenario: Create a citizenship with parameter
    When Create a citizenship name as "ulvCTZName4" code as "ulvCTZName4"
    Then Already exist message should be displayed

  Scenario: Delete Citizenship
    When user delete name as "ulvCTZName4"
    Then Success message should be displayed