Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create CitizenShip
    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput      | <name>      |
      | shortNameInput | <shortName> |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User deleting the Element from Dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name       | shortName |
      | ulviCTZ991 | ulCTZ54   |
      | ulviCTZ992 | ulCTZ55   |
      | ulviCTZ993 | ulCTZ56   |
      | ulviCTZ994 | ulCTZ57   |
      | ulviCTZ995 | ulCTZ58   |