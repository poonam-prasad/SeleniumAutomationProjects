Feature: Google Title Test

  Scenario: To validate Google title
    Given Open Google
    When I read title of the page
    Then Title should be Google
