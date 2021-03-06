Feature: Admin Login

Scenario: Administrator can log in with valid credentials
Given He enter a valid username "aya" and valid password "1234"
When He call login funcion
Then Administrator with username "aya" and password "1234" login

Scenario: Administrator has the wrong password
Given He enter a valid username "aya" but a wrong password "12345"
When He call login funcion
Then A message wrong should appear