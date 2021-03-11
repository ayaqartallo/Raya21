Feature: Admin Login
Background: 
Given Administrator enter a valid username "alaa"
Scenario: Administrator has the wrong password
Given He enter a unvalid password "alaa20"
When He call login funcion 
Then A message wrong should appear