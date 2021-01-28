Feature: This is to add customer details in guru99 telecom page
Scenario Outline: To add customer details
		Given The user is in guru telecom page "http://demo.guru99.com/telecom/addcustomer.php"
		When The user enter "<FirstName>" , "<LastName>" , "<MailId>" , "<Address>" and "<MobileNo>"
 		Then The user should get their CustomerId
		
		Examples:
		| FirstName | LastName |      MailId      | Address |  MobileNo  |
		| Karthick  | B        | karthi@gmail.com | Chennai | 1111111111 |
		| Balu      | K        | balu@gmail.com   | Madurai | 2222222222 |
		| Meena     | B        | meena@gmail.com  | Trichy  | 3333333333 |