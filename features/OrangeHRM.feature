<<<<<<< HEAD
@Hooks
Feature: This is to login orange hrm page
Scenario Outline: To login orange hrm page
		Given The user is in Orange HRM page "https://opensource-demo.orangehrmlive.com/"
		When The user enters "<UserName>" and "<Password>"
 		Then The user should be landed in home page
 		
 		Examples:
 		| UserName | Password |
=======
@Hooks
Feature: This is to login orange hrm page
Scenario Outline: To login orange hrm page
		Given The user is in Orange HRM page "https://opensource-demo.orangehrmlive.com/"
		When The user enters "<UserName>" and "<Password>"
 		Then The user should be landed in home page
 		
 		Examples:
 		| UserName | Password |
>>>>>>> f5db8fa04558cd2c6170dab5546f6d01ee48559c
 		|   Admin  | admin123 |