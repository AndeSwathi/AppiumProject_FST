#Author: Ande Swathi
@ViewsControls
Feature: Testing API Demos - Views

  Scenario: Verify Views - Controls components
    Given User is on API demos home page
    When User Click on Views
    And User Click on Controls
    And User Click on Holo or old theme
    Then Verify Check box selection and Radio button
