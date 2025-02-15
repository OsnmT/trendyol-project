Feature: trendyol search

  Background: user should be on trendyol
    Given user is on the trendyol main page


  Scenario: search item on trendyol website

    When user search item on the search box
    Then user sees the result

    @new
  Scenario: search item on trendyol website

    When user search "tablet" on the search box
    Then user sees "tablet" on the result