Feature: Datatable Ornek

  Scenario: Users List
    When write username "ismet"
    And write username and password "ismet" and "1234"

    And write username as DataTable
      | ismet  |
      | mehmet |
      | ayse   |
      | fatma  |
      | ulvi   |
      | esma   |

    And write username and password as DataTable
      | ismet  | 1234  |
      | mehmet | 321 |
      | ayse   | 241   |
      | fatma  | 45315  |
      | ulvi   | 2412   |
      | esma   | 32145   |