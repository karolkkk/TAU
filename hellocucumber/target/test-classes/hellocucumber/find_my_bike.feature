Feature: Find my bike!
 chce znalezc rower wiem ze marka ktora polecil mi znajomy zaczyna sie na r


  Scenario Outline: Is it my bike?
    Given I look for "<myInput>"
    When I hit search
    Then  result should be "<answer>"

    Examples:
      | myInput            | answer         |
      | Romet              | Romet          |
      | Cross              | No             |
      | Cross              | No             |
      | Electra            | No             |