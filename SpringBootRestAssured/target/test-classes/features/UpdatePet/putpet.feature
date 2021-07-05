Feature: As a user I want to update pet details
  Scenario Outline: Pet is created first
    #Create Pet
    Given Create Pet entry that should be added to store with following attributes
      | category | <category> |
      | name     | <name>     |
      | status   | <status>   |
    And Prepare POST request for creating new Pet
    When POST request is sent to create Pet endpoint
    Then "<responseCode>" should be returned

    #Update Pet
    Given pet entry is created with updated details
    | updatedname | <updatedname> |
    And Prepare PUT request for creating new Pet
    When PUT request is sent to create Pet endpoint
    Then Details should be update successfully
    Then "<responseCode>" should be returned
    Examples:
      | updatedname            | responseCode | category      | name   | status    |
      | Kuroku                 | 200          | Domestic      | jackie | available |
      | Kuroku Number 2        | 200          | International | doggu  | available |