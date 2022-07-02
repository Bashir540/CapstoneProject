Feature: Home Page

  @homePageTest
  Scenario: Home Page Scenarios and Items
    Given User is on Retail Website

  @currency
  Scenario: User verify currency values change
    Given User is on Retail Website
    When User click on Currency
    And User Chose Euro from dropdown
    Then currency value should change to Euro

	@emptycart
  Scenario: User empty Shopping cart message displays
    Given User is on Retail Website
    When User click on shopping cart
    Then "Your shopping cart is empty!" message should display
