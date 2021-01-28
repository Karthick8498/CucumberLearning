Feature: This is to add items into the cart
Scenario Outline: To add multiple items to the cart
		Given the user is in greenkart home page "https://rahulshettyacademy.com/seleniumPractise/#/"
		When the user added items "<item1>" , "<item2>" , "<item3>" to cart
		Then the item "<item1>" , "<item2>" , "<item3>" should be added to the cart
		
		Examples:
		| item1 | item2 | item3 |
		| Corn | Potato | Onion |
	