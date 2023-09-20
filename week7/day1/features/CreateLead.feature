Feature: Create Lead Functionality of Leaftaps application
Background:
Given Open the chrome browser
Given Load the application url

Scenario: Tc003_Create new Lead with mandatory information
And  Enter the username as 'demosalesmanager'
And  Enter the password as 'crmsfa'
When click Login button
When Click CRMSFA
And Click Lead
And Click CreateLead
Given Enter  the companyName
