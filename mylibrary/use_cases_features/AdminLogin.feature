Feature: Admin Login
Scenario: Administrator can log in with valid credentials
Given He enter a right username and password
When He press on a log on button
Then Administrator login

Scenario: Administrator has the wrong password
Given He enter a wrong username or password
When He press on a log on button
Then A message wrong should appear