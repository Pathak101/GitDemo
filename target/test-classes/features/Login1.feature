Feature: Site Login

Scenario: Home page defaul login

Given User should navigate to chrome browser
And   User should navigate to URL "https://www.qaclickacademy.com/"
And   Click on login button 
When  User login into site with "sid" and password "1234"
Then  Home Page is populated

  

  