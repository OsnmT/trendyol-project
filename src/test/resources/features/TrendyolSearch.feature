Feature: trendyol search

  Background: user should be on trendyol
    Given user is on the trendyol main page


  Scenario: search item on trendyol website

    When user search item on the search box
    Then user sees the result

  Scenario: search item on trendyol website

    When user search "orange" on the search box
    Then user sees "orange" on the result

  @new
  Scenario Outline: Search items on the trendyol

    When user search "<items>" on the search box
    Then user sees "<expectedTitle>" on the result

    Examples: search values
      | items  | expectedTitle |
      | tablet | tablet        |
      | iphone | iphone        |