Feature: Admin Login

Background: 
Given Administrator enter a valid username "alaa"

Scenario: Administrator can log in with valid credentials
Given He enter a valid password "20alaa" 
When He call login funcion
Then Administrator with valid password logged in and the status should be "found"

Scenario: Administrator has the wrong password
Given He enter a unvalid password "alaa20"
When He call login funcion 
Then A message wrong should appear