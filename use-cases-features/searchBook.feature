Feature: Search Book Feature

This feature enables a user (either regular user or administrator) searches for books by providing a substring
of either the title, author , signature, or the ISBN.The user dose not necessarily to be logged in

@tag1
Scenario Outline:  Searching for a substring of the title

Given a user or an administrator insert a valid subTitle <subStringTittle>
When the user or an administrator call searchBookbysubTitle function
Then the full title of the book should be <title> 
And the  author name should be <author-name>
And the  ISBN number should be <ISBN>
And the signature should be <signature>
And all the details of the book should be printed on the screen

Examples:
|subStringTittle|title|author-name|ISBN|signature|
|"How"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"to"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"Stop"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"Time"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"Cat"|"The Cat in the Hat Comes Back"|"Dr Seuss"|"0394800028"|"Seuss1958"|
|"in"|"The Cat in the Hat Comes Back"|"Dr Seuss"|"0394800028"|"Seuss1958"|
|"Hat"|"The Cat in the Hat Comes Back"|"Dr Seuss"|"0394800028"|"Seuss1958"|
|"Comes"|"The Cat in the Hat Comes Back"|"Dr Seuss"|"0394800028"|"Seuss1958"|
|"Back"|"The Cat in the Hat Comes Back"|"Dr Seuss"|"0394800028"|"Seuss1958"|
|"How to"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"The Cat in the Hat Comes Back"|"The Cat in the Hat Comes Back"|"Dr Seuss"|"0394800028"|"Seuss1958"|
|"in the hat"|"The Cat in the Hat Comes Back"|"Dr Seuss"|"0394800028"|"Seuss1958"|
@tag2
Scenario Outline: Searching for a substring of the author

Given a user or an administrator insert a valid subAuthor_Name <subStringAuthorName>
When the user or an administrator call searchBookbyAuthorName function
Then the full title of the book should be <title> 
And the  author name should be <author-name>
And the  ISBN number should be <ISBN>
And the signature should be <signature>
And all the details of the book should be printed on the screen

Examples:
|subStringAuthorName|title|author-name|ISBN|signature|
|"Matt"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"Haig"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"Matt Haig"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|

@tag3
Scenario Outline: : Searching for a substring of the ISBN

Given a user or an administrator insert a valid  substring of the ISBN <subStringISBN>
When the user or an administrator call searchBookbyISBN function
Then the full title of the book should be <title> 
And the  author name should be <author-name>
And the  ISBN number should be <ISBN>
And the signature should be <signature>
And all the details of the book should be printed on the screen

Examples:
|subStringISBN|title|author-name|ISBN|signature|
|"97"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"817"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"8211"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"8619"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"9781"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"78178"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"9781782118619"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|

@tag4
Scenario Outline: : Searching for a substring of the signature

Given a user or an administrator insert a valid  substring of the signature <subStringSignature>
When the user or an administrator call searchBookbySignature function
Then the full title of the book should be <title> 
And the  author name should be <author-name>
And the  ISBN number should be <ISBN>
And the signature should be <signature>
And all the details of the book should be printed on the screen

Examples:
|subStringSignature|title|author-name|ISBN|signature|
|"haig"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"haig2017"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|
|"HAIG20"|"How to Stop Time"|"Matt Haig"|"9781782118619"|"Haig2017"|

@tag5
Scenario: Searching by subTitle works when the user/administrator is logged in

Given  a user or an administrator is logged in 
And  insert a valid subTitle "ho"
When the user or an administrator call searchBookbysubTitle function
Then the full title of the book should be "How to Stop Time"
And the  author name should be "Matt Haig"
And the  ISBN number should be "9781782118619"
And the signature should be "Haig2017"
And all the details of the book should be printed on the screen

@tag6
Scenario: Searching by subAuthor Name works when the user/administrator is logged in

Given  a user or an administrator is logged in 
And  insert a valid subAuthor_Name "Meyer"
When the user or an administrator call searchBookbyAuthorName function
Then the full title of the book should be "Midnight Sun"
And the  author name should be "Stephenie Meyer"
And the  ISBN number should be "031670704X"
And the signature should be "Meyer2020"
And all the details of the book should be printed on the screen



@tag7
Scenario: Searching by subISBN Number works when the user/administrator is logged in

Given  a user or an administrator is logged in 
And  insert a valid substring of the ISBN "0679"
When the user or an administrator call searchBookbyISBN function
Then the full title of the book should be "The Foot Book"
And the  author name should be "Dr Seuss"
And the  ISBN number should be "0679882804"
And the signature should be "Seuss1996"
And all the details of the book should be printed on the screen

@tag8
Scenario: Searching by substring of the signature works when the user/administrator is logged in

Given  a user or an administrator is logged in 
And   insert a valid  substring of the signature "2020"
When the user or an administrator call searchBookbySignature function
Then the full title of the book should be "Midnight Sun"
And the  author name should be "Stephenie Meyer"
And the  ISBN number should be "031670704X"
And the signature should be "Meyer2020"
And all the details of the book should be printed on the screen


@tag9
Scenario: No books match the criteria (substring of title)

Given a user or an administrator insert invalid  substring of the title "white space"
When the user or an administrator call searchBookbysubTitle function
Then the number of returend books should be 0
And the statement "This Book Dose Not Exist" should be printed on the screen

@tag9
Scenario: No books match the criteria (substring of author name)

Given a user or an administrator insert invalid  substring of the author name "Raya"
When the user or an administrator call searchBookbyAuthorName function
Then the number of returend books should be 0
And the statement "This Book Dose Not Exist" should be printed on the screen


@tag9
Scenario: No books match the criteria (substring of ISBN number)

Given a user or an administrator insert invalid  substring of ISBN number "202020"
When the user or an administrator call searchBookbyISBN function
Then the number of returend books should be 0
And the statement "This Book Dose Not Exist" should be printed on the screen

@tag9
Scenario: No books match the criteria (substring of signature)


Given a user or an administrator insert invalid  substring of signature "Ahmad2021"
When the user or an administrator call searchBookbySignature function
Then the number of returend books should be 0
And the statement "This Book Dose Not Exist" should be printed on the screen

@tag10
Scenario: Find more than one book when search by subtitle

Given a user or an administrator insert a valid subTitle "THE"
When the user or an administrator call searchBookbysubTitle function
Then the number of returned books should be 2
And all the details of the books should be printed on the screen

@tag10
Scenario: Find more than one book when search by subtitle
Given a user or an administrator insert a valid subAuthor_Name "S"
When the user or an administrator call searchBookbyAuthorName function
Then the number of returned books should be 3
And all the details of the books should be printed on the screen

@tag10
Scenario: Find more than one book when search by subtitle
Given a user or an administrator insert a valid  substring of the ISBN "8"
When the user or an administrator call searchBookbyISBN function
Then the number of returned books should be 3
And all the details of the books should be printed on the screen

@tag10
Scenario: Find more than one book when search by subtitle
Given a user or an administrator insert a valid  substring of the signature "E"
When the user or an administrator call searchBookbySignature function
Then the number of returned books should be 3
And all the details of the books should be printed on the screen
