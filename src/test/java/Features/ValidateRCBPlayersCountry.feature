Feature: Validating the RCB Players in the ResponseJSON

  Scenario Outline: Counting the foriegn players
    Given <Team> player details submitted
    Then Validate that team has only <playerCount> of <countryOrigin> players
    Examples:
      | Team             | playerCount | countryOrigin   |
      | TeamRCBResponse  | 4           |    foriegn      |



