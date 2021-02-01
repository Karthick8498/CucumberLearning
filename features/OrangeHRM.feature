@Hooks
Feature: This is to login orange hrm page
Scenario Outline: To login orange hrm page
		Given The user is in Orange HRM page "https://opensource-demo.orangehrmlive.com/"
		When The user enters "<UserName>" and "<Password>"
 		Then The user should be landed in home page
 		
 		Examples:
 		| UserName | Password |
 		|   Admin  | admin123 |