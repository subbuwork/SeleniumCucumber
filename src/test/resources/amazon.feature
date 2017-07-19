Feature: Amazon home page

  Background: Home page
    Given Go to amazon Home page "https:\\amazon.com"

  @regression @smoke
  @driver
  Scenario: Search for products
    Then Enter search term and click on search button
  @smoke
  @driver
  Scenario: User can search product and select product from list and add to the cart
    Then Enter search term and click on search button
    And Select product from product list
    And Add product to the cart
