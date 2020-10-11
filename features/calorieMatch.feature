Feature: Calorie check from Tim Hortons menu
In order to check calorie of an item
I need to choose a store and then choose the right item from the menu

Scenario: Calorie check of a particular item by choosing particular store for pick up and then the item from their takeout menu
Given I want to go to Tim Hortons homepage
When I select the Language and Region
Then I click on Order
Then I choose how i like to get my order
Then I locate the store manually
Then I do Order here
Then I prefer takeout option
Then I like to check Bagel
And I find calorie of Everything Bagel 