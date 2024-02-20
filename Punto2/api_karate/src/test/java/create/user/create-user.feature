Feature: create an user on demoblaze

  Scenario: Create an user successfully

    Given url "https://api.demoblaze.com/signup"
    And request {"username":"sarar7p6",  "password":"sarar7p6"}
    When method post
    Then status 200





  Scenario: Create an existing user

    Given url "https://api.demoblaze.com/signup"
    And request {"username":"sara1r7",  "password":"sara1r7"}
    When method post
    Then status 200
    And match $ =={"errorMessage": "This user already exist."}
