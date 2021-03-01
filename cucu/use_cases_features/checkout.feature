Feature: Checkout feature
This to some....
@regression
Scenario: I need to buy 1 apple
Given I should have 50 NIS
When I checkout for buying an one apple
Then The amount of money should be 49
@sanity
Scenario: I need to buy 1 apple and I have just 1 NIS
Given I should have 1 NIS
When I checkout for buying an one apple
Then Error should be appeared