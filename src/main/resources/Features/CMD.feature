Feature: 
  
  Check orange hrm login

  Scenario: user is able to enter the login with valid input
    Given user is able enter the app with valid url
    Then user is able to enter UN and Pw
    Then he is able to click the lopgin
    And he is must navigate to homepage and close the browser

  Scenario: 
    Given url open
    Then enter invalid Un and Pw
    Then click on login btn
    And error message should come
