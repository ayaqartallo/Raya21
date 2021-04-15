package MyLibrary2;

public class Book2 {
	String isbn;
	String title;
	String author;
	String signature;
	
	public Book2 (String isbn,String title,String author,String signature)//constructor
	{
		this.isbn=isbn;
		this.title=title;
		this.author=author;
        this.signature=signature;
		
		
	}
	

	 public String getTitle()
	    {
	    	return title;
	    }
	 
	 public String getISBN()
	    {
	    	return isbn;
	    }
	 
	 public String getAuthor()
	    {
	    	return author;
	    }
	 
	 public String getSignature()
	    {
	    	return signature;
	    }


	boolean isEqualBook(Book2 book) {
		return equals(book);
	}

}
