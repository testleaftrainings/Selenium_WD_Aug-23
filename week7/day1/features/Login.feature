Feature: Login functionality of Leaftaps application

Background:
Given Open the chrome browser
Given Load the application url

Scenario Outline: TC001_Login with positive credential
And  Enter the username as <username>
And  Enter the password as <password>
When click Login button
Then Homepage should be displayed

Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|
|'democsr'|'crmsfa'|


Scenario: TC002_Login with negative credential
And  Enter the username as 'demo'
And  Enter the password as 'crmsfa'
When click Login button
But Error message displayed