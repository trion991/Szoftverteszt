Feature: user fills every registration fields

  @test
  Scenario: user fills every registration fields
    Given a new user
    And user navigate to page
    When user fills every registration fields
    Then the registration values are correct
