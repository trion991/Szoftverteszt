Feature: Adding new item to shopping cart
  @test
  Scenario: user create a new shopping list
    Given user navigate to shopping page
    And user adds new item to shopping cart
    When user checks shopping cart
    Then total payment is right