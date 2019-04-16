Feature: Find me a TV
  Customer want to buy electra bike with hand brake that desirably is black



  Scenario Outline: Find me a Bike.
    Given there is bike with "<brakes>"
    And it's color is "<color>"
    And it's brand is "<brand>"
    When I want to buy
    Then I say "<decision>"


    Examples:
      | brakes   | color  | brand     | decision |
      | hand     | grey   | Romet     | No       |
      | pedal    | grey   | Cross     | No       |
      | pedal    | black  | Electra   | No       |
      | hand     | black  | Electra   | Yes      |