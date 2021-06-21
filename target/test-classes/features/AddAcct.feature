@New_Account 
Feature: Techfios bank and cash New Account Functionality 

Background: 
	Given User is on the techfios login page  
	
@Scenario_01 
Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	When User enters the "<username>" and "<password>"  
	And  User clicks on login button  
	Then User should land on dashboard page 
	Then User clicks on bank and cash 
	Then User clicks on new account 
	Then User fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit 
	Then User should be able to validate the account
	Examples:
|username|password|accountTitle|description|initialBalance|accountNumber|contactPerson|phone|internetBankingUrl|
|demo@techfios.com|abc123|acf095|saving|11229|1122339|sav tim|2140000005|https://techfios.com/billing/?ng=accounts/add|
	