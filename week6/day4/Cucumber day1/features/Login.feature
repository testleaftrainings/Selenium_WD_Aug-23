Feature: Login functionality of Leaftaps application

Scenario: TC001_Login with positive credential
Given Open the chrome browser
And  Load the application url
And  Enter the username as demosalesmanager
And  Enter the password as crmsfa
When click Login button
Then Homepage should be displayed
