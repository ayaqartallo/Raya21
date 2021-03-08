Feature: Admin Login
@Regression
Scenario: Add a book when the administrator is logged in
Given Administrator logged in
When He fill the book's "Title" and "Auther" and "Signature" and "ISBN"
Then Add the book in the library
@Regression
Scenario: Add a book when the administrator is not logged in
Given Administrator doesn't logged in
When He fill the book's "Title" and "Auther" and "Signature" and "ISBN"
Then A message login to add books should be appear