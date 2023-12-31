Feature: search for product

  Background:
    Given Navigate to url
@Regression
  Scenario Outline: verifying that search functionality is working appropriately
    Then Verify that home page is visible successfully
    And Click on Products button
    When Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in <search-input> and click search button
    Then Verify SEARCHED PRODUCTS is visible
    Examples:
      | search-input                         |
      | Sleeveless Unicorn Patch Gown - Pink |