package MyLibrary2;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class LibraryClass2 {
	
	private ArrayList <Book2>list;
	static ArrayList <CredentialsClass2>credential;
	static boolean lio=false;
	ArrayList <String> details;
	private ArrayList <Book2>list2;
	CredentialsClass2 c1,c2,c3,c4;
	
	private static final Logger log = Logger.getLogger(LibraryClass2.class.getName());
	
	public LibraryClass2()
	{
		list=new ArrayList<Book2>();
		list2=new ArrayList<Book2>();
		
		credential=new ArrayList <CredentialsClass2> ();
		
		credential.add(new CredentialsClass2("alaa","20alaa"));
		credential.add(new CredentialsClass2("aya","1234"));
		credential.add(new CredentialsClass2("malek","1998m"));
		credential.add(new CredentialsClass2("khalid","2021k"));
		
		list.add(new Book2("9781782118619","How to Stop Time","Matt Haig","Haig2017"));
		list.add(new Book2("0394800028","The Cat in the Hat Comes Back","Dr Seuss","Seuss1958"));
		list.add(new Book2("0679882804","The Foot Book","Dr Seuss","Seuss1996"));
		list.add(new Book2("031670704X","Midnight Sun","Stephenie Meyer","Meyer2020"));
		
		details=new ArrayList<String>();
		

	}

	static String loginFunction(String user, String pw) {
		String s ="";

	    for(CredentialsClass2 c:credential) {

		    if(c.username.equals(user) && c.password.equals(pw)){				   
				    lio=true;
				    s="found";

				    return s;
				    
				    
	    	}
	    }
	
	lio=false;

	return s;
	}
	static void logoutFunction() {
		if(lio) {
			lio=false;
		}
		else {
			
			log.info("You are already logged out");
		}
		
	}

	
	public String addBook(String title, String author, String signature, String isbn) {
		Book2 b1=new Book2(isbn,title,author,signature);
		if(lio) {
				for(Book2 book:list) {
					if(b1.equals(book)) {
						log.info("This book is exist");
					}
					else {
						list2.add(b1);
					}
					
				}
				list.addAll(list2);
			
		}
		return "added";
		
	}

	static void setLoggedin(boolean l) {
		lio=l;
	}
	
	public List <Book2> searchBookbysubTitle(String subTitle) {
        ArrayList <Book2> searchedBook=new ArrayList<Book2>();
		
		for(Book2 item:list)
		{
			String title=item.getTitle().toLowerCase();
         int exist=title.indexOf(subTitle.toLowerCase());
         
         if(exist!=-1)
         {
        	 searchedBook.add(item);
         }
            
		}


		
		return searchedBook;
		

		
		
	}
	public List<Book2> searchBookbyAuthorName(String subAuthorName) {
		ArrayList <Book2> searchedBook=new ArrayList<Book2>();
		
		for(Book2 item:list)
		{
			String AuthorName=item.getAuthor().toLowerCase();
         int exist=AuthorName.indexOf(subAuthorName.toLowerCase());
         
         if(exist!=-1)
         {
        	 searchedBook.add(item);
         }
            
		}
		
		return searchedBook;
	}
	
	public List<Book2> searchBookbyISBN(String subStringISBN) {
		ArrayList <Book2> searchedBook=new ArrayList<Book2>();
		for(Book2 item:list)
		{
			String ISBN=item.getISBN();
         int exist=ISBN.indexOf(subStringISBN);
         
         if(exist!=-1)
         {
        	 searchedBook.add(item);
         }
            
		}
		return searchedBook;
	}
	
	public List<Book2> searchBookbySignature(String subSignature) {
		ArrayList <Book2> searchedBook=new ArrayList<Book2>();
		for(Book2 item:list)
		{
		 String Signature=item.getSignature().toLowerCase();
         int exist=Signature.indexOf(subSignature.toLowerCase());
         
         if(exist!=-1)
         {
        	 searchedBook.add(item);
         }
            
		}
		return searchedBook;
	}


}
