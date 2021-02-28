Feature: Admin Login

Scenario: Add a book when the administrator is logged in
Given Administrator loged in
When He fill the book's information and press on add button
Then Add the book in the library

Scenario: Add a book when the administrator is not logged in
Given Administrator doesn't loged in
When He fill the book's information and press on add button
Then A message login to add books should appear