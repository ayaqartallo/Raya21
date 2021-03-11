package mylibrary;

public class Book {

	String ISBN;
	String Title;
	String Author;
	String Signature;
	
	public Book (String ISBN,String Title,String Author,String Signature)//constructor
	{
		this.ISBN=ISBN;
		this.Title=Title;
		this.Author=Author;
        this.Signature=Signature;
		
		
	}
	

	 public String getTitle()
	    {
	    	return Title;
	    }
	 
	 public String getISBN()
	    {
	    	return ISBN;
	    }
	 
	 public String getAuthor()
	    {
	    	return Author;
	    }
	 
	 public String getSignature()
	    {
	    	return Signature;
	    }
	 

}