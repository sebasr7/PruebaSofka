Feature: Login an user on demoblaze

  Scenario: Login successfully

    Given url "https://api.demoblaze.com/login"
    And request {"username":"sara1r7",  "password":"sara1r7"}
    When method post
    Then status 200
    And match $ =="Auth_token: c2FyYTFyNzE3MDkwNTA="

  Scenario: Login Failed with wrong password

    * def jsonResponse = read('../../json/wrong_pass.json')

    Given url "https://api.demoblaze.com/login"
    And request {"username":"sara1r7",  "password":"sara11r7"}
    When method post
    Then status 200
    And match $ == jsonResponse