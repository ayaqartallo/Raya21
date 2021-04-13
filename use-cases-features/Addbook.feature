Feature: Add Book

Scenario: Add a book when the administrator is logged in
Given Administrator logged in
When He fill the book's "Test-Drivenest Driven Development" and "Kent Beck" and "Beck2002" and "9780321146533"
Then Add the book in the library

Scenario: Add a book when the administrator is not logged in
Given Administrator doesn't logged in
When He fill the book's "Test-Drivenest Driven Development" and "Kent Beck" and "Beck2002" and "9780321146533"
Then A message login to add books should be appear