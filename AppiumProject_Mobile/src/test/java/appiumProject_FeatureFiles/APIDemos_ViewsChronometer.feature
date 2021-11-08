#Author: Ande Swathi
@ViewsChronometer
Feature: Testing API Demos - Views

  Scenario: Verify Views - Chronometer components
    Given User is on API demos home page
    When User Click on Views
    And User Click on Chronometer
    Then Verify Start, Stop and Rest Options
