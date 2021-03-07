Feature: Admin Login

Background: 
Given Administrator enter a valid username "aya" 
When He call login funcion

Scenario: Administrator can log in with valid credentials
Given He enter a valid password "1234" 
Then Administrator with valid password "1234" logged in

Scenario: Administrator has the wrong password
Given He enter a unvalid password "aya20" 
Then A message wrong should appear