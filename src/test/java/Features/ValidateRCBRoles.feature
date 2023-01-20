Feature: Validate RCB Team Player Section Strategy

  Scenario Outline: Counting the wicket keepers
    Given <Team> player details submitted
    Then Verify whether the response has more than one wicketKeeper
    Examples:
      | Team             |
      | TeamRCBResponse  |

