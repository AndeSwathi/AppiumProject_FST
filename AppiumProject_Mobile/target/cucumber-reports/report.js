$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("APIDemos_ViewsTabs.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Ande Swathi"
    }
  ],
  "line": 3,
  "name": "Testing API Demos - Views",
  "description": "",
  "id": "testing-api-demos---views",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@ViewsTabs"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify Views - Tabs components",
  "description": "",
  "id": "testing-api-demos---views;verify-views---tabs-components",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on API demos home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Click on Views",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User Click on Tabs",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Click on Content By factory",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select the tabs and verify text change",
  "keyword": "Then "
});
formatter.match({
  "location": "ViewsChronometer.user_is_on_API_demos_home_page()"
});
formatter.result({
  "duration": 14729319700,
  "status": "passed"
});
formatter.match({
  "location": "ViewsChronometer.user_Click_on_Views()"
});
formatter.result({
  "duration": 4152840500,
  "status": "passed"
});
formatter.match({
  "location": "ViewsTabs.user_Click_on_Tabs()"
});
formatter.result({
  "duration": 10667267500,
  "status": "passed"
});
formatter.match({
  "location": "ViewsTabs.user_Click_on_Content_By_factory()"
});
formatter.result({
  "duration": 1627977400,
  "status": "passed"
});
formatter.match({
  "location": "ViewsTabs.select_the_tabs_and_verify_text_change()"
});
formatter.result({
  "duration": 2789126500,
  "status": "passed"
});
});