$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddAcct.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@New_Account"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario_01"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\" and clicks on submit",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should be able to validate the account",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 18,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "acf095",
        "saving",
        "11229",
        "1122339",
        "sav tim",
        "2140000005",
        "https://techfios.com/billing/?ng\u003daccounts/add"
      ],
      "line": 19,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6040330500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 3011149400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@New_Account"
    },
    {
      "line": 7,
      "name": "@Scenario_01"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on bank and cash",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks on new account",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User fill up the form entering \"acf095\"and \"saving\"and \"11229\"and \"1122339\"and \"sav tim\"and \"2140000005\"and \"https://techfios.com/billing/?ng\u003daccounts/add\" and clicks on submit",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should be able to validate the account",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "StepDefs.user_enters_the_and(String,String)"
});
formatter.result({
  "duration": 446583000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1545255900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 35835900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "duration": 87312100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 889468900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "acf095",
      "offset": 32
    },
    {
      "val": "saving",
      "offset": 44
    },
    {
      "val": "11229",
      "offset": 56
    },
    {
      "val": "1122339",
      "offset": 67
    },
    {
      "val": "sav tim",
      "offset": 80
    },
    {
      "val": "2140000005",
      "offset": 93
    },
    {
      "val": "https://techfios.com/billing/?ng\u003daccounts/add",
      "offset": 109
    }
  ],
  "location": "StepDefs.user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1718444700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.user_should_be_able_to_validate_the_account()"
});
formatter.result({
  "duration": 43531700,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[]Account Created Succ...\u003e but was:\u003c[×\n]Account Created Succ...\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat steps.StepDefs.user_should_be_able_to_validate_the_account(StepDefs.java:79)\r\n\tat ✽.Then User should be able to validate the account(features/AddAcct.feature:16)\r\n",
  "status": "failed"
});
});