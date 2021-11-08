#Author: Ande Swathi
@ViewsTabs
Feature: Testing API Demos - Views

  Scenario: Verify Views - Tabs components
    Given User is on API demos home page
    When User Click on Views
    And User Click on Tabs
    And User Click on Content By factory
    Then Select the tabs and verify text change 
