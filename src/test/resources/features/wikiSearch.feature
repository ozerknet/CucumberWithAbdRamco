Feature: Wikipedia search functionality and verifications

  #WSF-45234 --> potential jira ticket number

  @wip

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Bill Gates" in the wiki search box
    And User clicks wiki search button
    Then User sees "Bill Gates" is in the wiki title