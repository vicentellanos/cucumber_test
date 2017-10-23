$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Authentication",
  "description": "",
  "id": "authentication",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2891408538,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Successfully logging in",
  "description": "",
  "id": "authentication;successfully-logging-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "the Heroku home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click on the signup button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the home page navigation is available",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_Symbiote_home_page()"
});
formatter.result({
  "duration": 4268043275,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.logging_in_as_an_admin()"
});
formatter.result({
  "duration": 2300658890,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_home_page_navigation_is_available()"
});
formatter.result({
  "duration": 91811821,
  "status": "passed"
});
formatter.after({
  "duration": 365506164,
  "status": "passed"
});
});