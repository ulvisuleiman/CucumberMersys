# Nationality menusunun kayit ve silme ozelligini
# DataTable ile 5 farkli deger seti ile calistiriniz.
Feature: Nationality functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Create Nationality
    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User deleting the Element from Dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name       |
      | ulviNT998  |
      | ulviNT999  |
      | ulviNT1000 |
      | ulviNT1001 |
      | ulviNT1002 |