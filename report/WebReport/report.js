$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Search.feature");
formatter.feature({
  "line": 1,
  "name": "This is to add items into the cart",
  "description": "",
  "id": "this-is-to-add-items-into-the-cart",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "To add multiple items to the cart",
  "description": "",
  "id": "this-is-to-add-items-into-the-cart;to-add-multiple-items-to-the-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "the user is in greenkart home page \"https://rahulshettyacademy.com/seleniumPractise/#/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the user added items \"\u003citem1\u003e\" , \"\u003citem2\u003e\" , \"\u003citem3\u003e\" to cart",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the item \"\u003citem1\u003e\" , \"\u003citem2\u003e\" , \"\u003citem3\u003e\" should be added to the cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "this-is-to-add-items-into-the-cart;to-add-multiple-items-to-the-cart;",
  "rows": [
    {
      "cells": [
        "item1",
        "item2",
        "item3"
      ],
      "line": 8,
      "id": "this-is-to-add-items-into-the-cart;to-add-multiple-items-to-the-cart;;1"
    },
    {
      "cells": [
        "Corn",
        "Potato",
        "Onion"
      ],
      "line": 9,
      "id": "this-is-to-add-items-into-the-cart;to-add-multiple-items-to-the-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "To add multiple items to the cart",
  "description": "",
  "id": "this-is-to-add-items-into-the-cart;to-add-multiple-items-to-the-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "the user is in greenkart home page \"https://rahulshettyacademy.com/seleniumPractise/#/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the user added items \"Corn\" , \"Potato\" , \"Onion\" to cart",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the item \"Corn\" , \"Potato\" , \"Onion\" should be added to the cart",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://rahulshettyacademy.com/seleniumPractise/#/",
      "offset": 36
    }
  ],
  "location": "AddToCart.the_user_is_in_greenkart_home_page(String)"
});
formatter.result({
  "duration": 9776666300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Corn",
      "offset": 22
    },
    {
      "val": "Potato",
      "offset": 31
    },
    {
      "val": "Onion",
      "offset": 42
    }
  ],
  "location": "AddToCart.the_user_added_items_to_cart(String,String,String)"
});
formatter.result({
  "duration": 627925800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Corn",
      "offset": 10
    },
    {
      "val": "Potato",
      "offset": 19
    },
    {
      "val": "Onion",
      "offset": 30
    }
  ],
  "location": "AddToCart.the_item_should_be_added_to_the_cart(String,String,String)"
});
formatter.result({
  "duration": 279295300,
  "status": "passed"
});
});