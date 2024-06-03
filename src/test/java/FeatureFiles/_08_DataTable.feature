Feature: DataTable functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | ulviUlk432 |
      | codeInput | ulKod1312  |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

  # And User deleting the Element from Dialog
  #   | ulviUlk442 |

  #  Then Success message should be displayed

  Scenario: Create CitizenShip
    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput      | ulviCTZ87 |
      | shortNameInput | ulCTZ5    |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User deleting the Element from Dialog
      | ulviCTZ87 |

    Then Success message should be displayed

  Scenario: Create Nationality
    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | ulviNT29 |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User deleting the Element from Dialog
      | ulviNT29 |

    Then Success message should be displayed

  Scenario: Fee Functionality and Delete
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | ulFee142 |
      | codeInput       | 9874       |
      | integrationCode | 78      |
      | priorityCode    | 568      |

    And Click on the Element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User deleting the Element from Dialog
      | ulFee142 |

    Then Success message should be displayed


