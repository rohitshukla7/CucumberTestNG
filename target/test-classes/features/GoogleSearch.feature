Feature: Google Search
  As a user
  I want to search for a keyword on Google
  So that I can navigate to the first search result page and get its URL and title

  Scenario: Search for Python keyword and get the first search result
    Given I am on the Google homepage
    When I search for following keywords
      |keyword|
      |Python |
      |Java   |
    And I click on the first search result
    Then I get the URL and title of the first search result
