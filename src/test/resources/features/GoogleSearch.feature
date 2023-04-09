Feature: Google Search
  As a user
  I want to search for a keyword on Google
  So that I can navigate to the first search result page and get its URL and title

  Scenario: Search for Python keyword and get the first search result
    Given I am on the Google homepage
    When I search for "Python" keyword
    And I click on the first search result
    Then I get the URL and title of the first search result


  Scenario: Explore Java on Google search
    Given I am on Google webpage
    When I enter "Java" keyword
    Then Click on first result and get title of webpage