Feature: Facebook Application Validation

  Scenario Outline: Facebook validation Using Different Credentials
    Given User able to launch the Facebook url
    When User enters the "<Username>" and "<Password>"
    And User clicks on the User Buuton
    Then User Validates the Error Message

    Examples: 
      | Username   | Password |
      | Susithra   |     1234 |
      | Sathya@123 |     6789 |
      | Pra@1414   | susi     |
      | Harshi987  | bhgk     |
