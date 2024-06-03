Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario Outline: Create a citizenship with parameter
    When Create a citizenship name as "<name>" code as "<shortName>"
    Then Success message should be displayed

    When Create a citizenship name as "<name>" code as "<shortName>"
    Then Already exist message should be displayed

    When user delete name as "<name>"
    Then Success message should be displayed

    Examples:
      | name   | shortName   |
      | ulvCS1 | ulvCS1short |
      | ulvCS2 | ulvCS2short |
      | ulvCS3 | ulvCS3short |
      | ulvCS4 | ulvCS4short |
      | ulvCS5 | ulvCS5short |

 # dataProvider (TestNG için), Senaryo Outline (cucumber)
 #  görevi verilen her değer için, tüm senayo çalışır
 #
 #  DataTable ise , sadece bir step e, çoklu parametre vermek
 #  için kullanılır
