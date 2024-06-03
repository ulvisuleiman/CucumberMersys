#Senaryo :
#  Inventory Çalışmasını test ediniz
#  Item category girişi yapıp
#  sonrasında silmesini yapınız

Feature: Inventory Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create Inventory
    And Click on the Element in LeftNav
      | inventory      |
      | setupInv       |
      | itemCategories |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |

    And Click on the Element in Dialog
      | userType |
      | student |
      | saveButton |

    Then Success message should be displayed

    And User deleting the Element from Dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name    |
      | Ulvi123 |
      | Ulvi124 |
      | Ulvi125 |
      | Ulvi126 |
      | Ulvi127 |
