$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Sampless.feature");
formatter.feature({
  "name": "To validate the functionality of login page of facebook.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate the postive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.step({
  "name": "user should hit the url of the facebook",
  "keyword": "When "
});
formatter.step({
  "name": "user should pass the valid data\"\u003cEmaildatas\u003e\" in email feild",
  "keyword": "And "
});
formatter.step({
  "name": "user should pass the invalid data \"\u003cPassworddatas\u003e\"in password feild",
  "keyword": "And "
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should close the entire browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Emaildatas",
        "Passworddatas"
      ]
    },
    {
      "cells": [
        "inmakes@gmail.com",
        "inmakes"
      ]
    },
    {
      "cells": [
        "maheswari@gmail.com",
        "maheswari"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "123456"
      ]
    },
    {
      "cells": [
        "datadriven@gmail.com",
        "erenceaa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the postive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should hit the url of the facebook",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_hit_the_url_of_the_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should pass the valid data\"inmakes@gmail.com\" in email feild",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_pass_the_valid_data_in_email_feild(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should pass the invalid data \"inmakes\"in password feild",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_pass_the_invalid_data_in_password_feild(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should close the entire browser",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_close_the_entire_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the postive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should hit the url of the facebook",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_hit_the_url_of_the_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should pass the valid data\"maheswari@gmail.com\" in email feild",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_pass_the_valid_data_in_email_feild(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should pass the invalid data \"maheswari\"in password feild",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_pass_the_invalid_data_in_password_feild(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should close the entire browser",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_close_the_entire_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the postive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should hit the url of the facebook",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_hit_the_url_of_the_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should pass the valid data\"java@gmail.com\" in email feild",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_pass_the_valid_data_in_email_feild(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should pass the invalid data \"123456\"in password feild",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_pass_the_invalid_data_in_password_feild(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should close the entire browser",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_close_the_entire_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the postive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should hit the url of the facebook",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_hit_the_url_of_the_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should pass the valid data\"datadriven@gmail.com\" in email feild",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_pass_the_valid_data_in_email_feild(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should pass the invalid data \"erenceaa\"in password feild",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_pass_the_invalid_data_in_password_feild(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should close the entire browser",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeScenerio.user_should_close_the_entire_browser()"
});
formatter.result({
  "status": "passed"
});
});