Feature: This is to add tariff plans in guru99 telecom page
Scenario Outline: This is add tariff plan scenario
		Given The user is in guru telecom tariff plan page "http://demo.guru99.com/telecom/addtariffplans.php"
		When The user enter the tariff "<MonthlyRental>" , "<FreeLocalMinutes>" , "<FreeInternationalMinutes>" , "<FreeSMSPack>" , "<LocalPerMinutesCharges>" , "<InternationalPerMinutesCharges>" and "<SMSPerCharges>"
 		And click the submit button
 		Then The tariff plan should be added 
		
		Examples:
		| MonthlyRental | FreeLocalMinutes | FreeInternationalMinutes | FreeSMSPack | LocalPerMinutesCharges | InternationalPerMinutesCharges | SMSPerCharges |
		| 199 | 1000 | 100 | 50 | 2 | 10 | 1 |
		
#		| 399 | 3000 | 300 | 100 | 2 | 10 | 1 |
#		| 599 | 5000 | 500 | 150 | 2 | 10 | 1 |