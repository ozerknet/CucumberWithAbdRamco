Feature: Google search functionality
@one @three
  Scenario: Search page enter "facebook"
    When user is on Google search
    Then user should see search result about facebook
@one @two
  Scenario: Searh page title verification
    When user is on Google search
    Then user should see title is Google
@two @three
    Scenario: user open practice.cydeo.com and check a tag
      When user open page practice.cydeo.com
      Then user take all a tag elements