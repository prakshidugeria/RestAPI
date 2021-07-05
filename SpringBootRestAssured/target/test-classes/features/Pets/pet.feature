@createPet
Feature: As a user I want to verify pet API (Get, Post, Delete)

  Scenario Outline: verify adding pet to the store
    Given Create Pet entry that should be added to store with following attributes
      | category | <category> |
      | name     | <name>     |
      | status   | <status>   |
    And Prepare POST request for creating new Pet
    When POST request is sent to create Pet endpoint
    Then Pet should be successfully created
    Examples:
      | category | name   | status    |
      | Domestic | jackie | available |