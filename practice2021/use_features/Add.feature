Feature: Admin Login

Scenario: Add a book when the administrator is logged in
Given Administrator logged in
When He fill the book's "Title" and "Auther" and "Signature" and "ISBN"
Then Add the book in the library