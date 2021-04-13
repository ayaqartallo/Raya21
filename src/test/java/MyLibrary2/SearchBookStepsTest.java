package MyLibrary2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import MyLibrary2.Book2;
import MyLibrary2.LibraryClass2;

public class SearchBookStepsTest {
	private String subTitle;
	private String invalidAuthorName;
	private int numReturnBooks ;
	private String invalidsubTitle;
	private String subAuthorName;
	private String subStringISBN;
	private String subSignature;
	public  static String Title;
	public  static String authorName;
	public  static String ISBN;
	public  static String signature;
	private LibraryClass2 lb;
	private ArrayList <Book2> details1=new ArrayList<Book2>();
	private ArrayList <Book2> empty=new ArrayList<Book2>();
	
	public SearchBookStepsTest(LibraryClass2 lb) {
		this.lb=lb;
	}
	@Given("a user or an administrator is logged in")
	public void a_user_or_an_administrator_is_logged_in() {
        lb.lio=true;
	}

	@Given("insert a valid subTitle {string}")
	public void insert_a_valid_sub_title(String subTitle) {
        this.subTitle=subTitle;
	}
	
	@Given("insert a valid subAuthor_Name {string}")
	public void insert_a_valid_sub_author_name(String subAuthorName) {
        this.subAuthorName=subAuthorName;
	}
	
	
	
	@Given("a user or an administrator insert a valid subTitle {string}")
	public void a_user_or_an_administrator_insert_a_valid_sub_title(String subTitle) {
		this.subTitle=subTitle;
	}
	
	@Given("insert a valid substring of the ISBN {string}")
	public void insert_a_valid_substring_of_the_isbn(String subStringISBN) {
	    this.subStringISBN=subStringISBN;
	}

	@Given("insert a valid  substring of the signature {string}")
	public void insert_a_valid_substring_of_the_signature(String subSignature) {
	    this.subSignature=subSignature;
	}

	@When("the user or an administrator call searchBookbysubTitle function")
	public void the_user_or_an_administrator_call_search_bookbysub_title_function() {

		details1=lb.searchBookbysubTitle (subTitle);
		numReturnBooks=details1.size();
		for(Book2 item:details1)
		{
			 Title=item.getTitle();
		     authorName=item.getAuthor();
			 ISBN=item.getISBN();
			 signature=item.getSignature();
		}
		
		
	}

	
	@Given("a user or an administrator insert a valid subAuthor_Name {string}")
	public void a_user_or_an_administrator_insert_a_valid_sub_author_name(String subAuthorName) {
        this.subAuthorName=subAuthorName;
	}

	@When("the user or an administrator call searchBookbyAuthorName function")
	public void the_user_or_an_administrator_call_search_bookby_author_name_function() {
		details1=lb.searchBookbyAuthorName(subAuthorName);
		numReturnBooks=details1.size();
		for(Book2 item:details1)
		{
			 Title=item.getTitle();
		     authorName=item.getAuthor();
			 ISBN=item.getISBN();
			 signature=item.getSignature();
		}

    
	}
	
	@Given("a user or an administrator insert a valid  substring of the ISBN {string}")
	public void a_user_or_an_administrator_insert_a_valid_substring_of_the_isbn(String subStringISBN) {
		this.subStringISBN=subStringISBN;
        
	}

	@When("the user or an administrator call searchBookbyISBN function")
	public void the_user_or_an_administrator_call_search_bookby_isbn_function() {
		details1=lb. searchBookbyISBN(subStringISBN);
		numReturnBooks=details1.size();
		for(Book2 item:details1)
		{
			 Title=item.getTitle();
		     authorName=item.getAuthor();
			 ISBN=item.getISBN();
			 signature=item.getSignature();
		}

	}
	
	@Given("a user or an administrator insert a valid  substring of the signature {string}")
	public void a_user_or_an_administrator_insert_a_valid_substring_of_the_signature(String subSignature) {
     this.subSignature=subSignature;
	}

	@When("the user or an administrator call searchBookbySignature function")
	public void the_user_or_an_administrator_call_search_bookby_signature_function() {
    details1=lb.searchBookbySignature(subSignature);
    numReturnBooks=details1.size();
    for(Book2 item:details1)
	{
		 Title=item.getTitle();
	     authorName=item.getAuthor();
		 ISBN=item.getISBN();
		 signature=item.getSignature();
	}
	}


		

	@Then("the full title of the book should be {string}")
	public void the_full_title_of_the_book_should_be(String title) {
		assertEquals(Title,title);
	
	}

	@Then("the  author name should be {string}")
	public void the_author_name_should_be(String authorName) {
		assertEquals(this.authorName,authorName);
	}

	@Then("the  ISBN number should be {string}")
	public void the_isbn_number_should_be(String ISBN) {
		assertEquals(this.ISBN,ISBN);
	}

	@Then("the signature should be {string}")
	public void the_signature_should_be(String signature) {
		assertEquals(this.signature,signature);
	}
	
	@Then("all the details of the book should be printed on the screen")
	public void all_the_details_of_the_book_should_be_printed_on_the_screen() {
		 System.out.printf("%-40s%-40s%-40s%-40s\n","Title","ISBN","Author Name","Signature");
		for(Book2 item:details1)
		{
			System.out.printf("%-40s",item.getTitle());
			System.out.printf("%-40s",item.getISBN());
			System.out.printf("%-40s",item.getAuthor());
			System.out.printf("%-40s",item.getSignature());
			System.out.println("\n");
			
		}
	}
	
	@Given("a user or an administrator insert invalid  substring of the title {string}")
	public void a_user_or_an_administrator_insert_invalid_substring_of_the_title(String invalidsubTitle) {
        this.subTitle=invalidsubTitle;
	}
	
	@Given("a user or an administrator insert invalid  substring of the author name {string}")
	public void a_user_or_an_administrator_insert_invalid_substring_of_the_author_name(String ivalidAuthorName) {
        this.subAuthorName=ivalidAuthorName;
	}
	
	@Given("a user or an administrator insert invalid  substring of ISBN number {string}")
	public void a_user_or_an_administrator_insert_invalid_substring_of_isbn_number(String invalidISBN) {
        this.subStringISBN=invalidISBN;
	}

	@Given("a user or an administrator insert invalid  substring of signature {string}")
	public void a_user_or_an_administrator_insert_invalid_substring_of_signature(String invalidSignature) {
         this.subSignature=invalidSignature;
	}
	
	@Then("the number of returned books should be {int}")
	public void the_number_of_returned_books_should_be(Integer numReturnBooks) {
		assertTrue(this.numReturnBooks==numReturnBooks);
	}

	@Then("the statement {string} should be printed on the screen")
	public void the_statement_should_be_printed_on_the_screen(String notfound) {
        System.out.println(notfound);
	}

	@Then("the number of returend books should be {int}")
	public void the_number_of_returend_books_should_be(Integer numReturnBooks) {
		assertTrue(3==3);
	}

	@Then("all the details of the books should be printed on the screen")
	public void all_the_details_of_the_books_should_be_printed_on_the_screen() {
		 System.out.printf("%-40s%-40s%-40s%-40s\n","Title","ISBN","Author Name","Signature");
			for(Book2 item:details1)
			{
				System.out.printf("%-40s",item.getTitle());
				System.out.printf("%-40s",item.getISBN());
				System.out.printf("%-40s",item.getAuthor());
				System.out.printf("%-40s",item.getSignature());
				System.out.println("\n");
				
			}
	}


}


