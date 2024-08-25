Feature: Google Test

#  @regression @Connor @ignore
#    Scenario: Shop a shirt
#      Given Given I launched Connor
#      Then Connor page is loaded
#      When I click shop shirts
#      Then Shirts page is loaded
#      When I select shirt at proceed to payout

  @regression @Connor
  Scenario: Shop a New Item
      Given Given I launched Connor
      Then Connor page is loaded
      When I click NEW

  @regression @Connor
  Scenario: Shop Clothing
    Given Given I launched Connor
    Then Connor page is loaded
    When I click CLOTHING

  @regression @Connor
  Scenario: Shop a SUITING
    Given Given I launched Connor
    Then Connor page is loaded
    When I click SUITING

