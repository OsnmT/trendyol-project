Feature: trendyol search

  Scenario: search item on trendyol website

    Given user is on the trendyol main page
    When user search item on the search box
    Then user sees the result