Feature: Fees multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fee Functionality and Delete
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the Element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User deleting the Element from Dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name       | code | intCode  | priority |
      | ulv2Fee786 | 9087 | PayPal   | 1927     |
      | ulv2Fee785 | 9086 | Cash     | 1928     |
      | ulv2Fee784 | 9085 | Crypto   | 1929     |
      | ulv2Fee783 | 9084 | Cheque   | 1930     |
      | ulv2Fee782 | 9083 | ApplePay | 1931     |
