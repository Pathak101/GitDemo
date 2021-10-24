Feature: Application Login

Scenario: Home page defaul login

Given User are on the Netbanking landing page
When  User login into application with "sid" and "1234"
Then  Home Page is populated
And   Cards are displayed is "true" 
  
Scenario: Home page defaul login

Given User are on the Netbanking landing page
When  User login into application with "shiv" and "1234"
Then  Home Page is populated
And   Cards are displayed is "false" 
  