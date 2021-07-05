@getPet
Feature: As a user I want to get the details of pet
  Scenario Outline: Info is returned for pet
    #Create Pet
    Given Create Pet entry that should be added to store with following attributes
      | category | <category> |
      | name     | <name>     |
      | status   | <status>   |
    And Prepare POST request for creating new Pet
    When POST request is sent to create Pet endpoint
    Then "<responseCode>" should be returned

    #Get Pet
    Given Prepare GET request for getting pet info
    When GET request is sent to get the info
    Then "<responseCode>" should be returned

    Examples:
    | responseCode | category      | name   | status        |
    | 200          | Domestic      | jackie | available     |
    | 200          | International | doggu  | not available |