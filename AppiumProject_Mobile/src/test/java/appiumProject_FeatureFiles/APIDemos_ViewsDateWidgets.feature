#Author: Ande Swathi
@ViewsDateWidgets
Feature: Testing API Demos - Views

  Scenario: Verify Views - Date Widgets components
    Given User is on API demos home page
    When User Click on Views
    And User Click on Date Widgets
    And User Click on Dialog
    Then Change date and verify the results
