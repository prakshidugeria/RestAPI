@createOrder
Feature: As a user I want to place an order for pet
  Scenario Outline: Order is placed for a pet
    #Create Pet
    Given Create Pet entry that should be added to store with following attributes
      | category | <category> |
      | name     | <name>     |
      | status   | <status>   |
    And Prepare POST request for creating new Pet
    When POST request is sent to create Pet endpoint
    Then "<responseCode>" should be returned

    #Order Pet
  Given Order details for ordering pet
    |quantity   | <quantity>  |
  And Prepare POST request for placing order for pet
  When POST request is sent to place an order
  Then "<responseCode>" should be returned
  Examples:
      | quantity | responseCode | category      | name   | status        |
      | 1        | 200          | Domestic      | jackie | available     |
      | 100      | 200          | International | doggu  | not available |