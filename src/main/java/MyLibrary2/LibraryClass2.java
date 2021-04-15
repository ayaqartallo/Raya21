package MyLibrary2;

import java.util.ArrayList;


import javax.swing.JOptionPane;

public class LibraryClass2 {
	
	private ArrayList <Book2>list;
	static ArrayList <CredentialsClass2>credential;
    static boolean lio=false;
	ArrayList <String> details;
	Book2 book1;
	Book2 book2;
	Book2 book3;
	Book2 book4;
	private ArrayList <Book2>list2;
	CredentialsClass2 c1;
	CredentialsClass2 c2;
	CredentialsClass2 c3;
	CredentialsClass2 c4;
	
	public LibraryClass2()
	{
		list=new ArrayList<Book2>();
		list2=new ArrayList<Book2>();
		
		credential=new ArrayList <CredentialsClass2> ();
		c1=new CredentialsClass2("alaa","20alaa");
		c2=new CredentialsClass2("aya","1234");
		c3=new CredentialsClass2("malek","1998m");
		c4=new CredentialsClass2("khalid","2021k");
		
		credential.add(c1);
		credential.add(c2);
		credential.add(c3);
		credential.add(c4);
		
		book1=new Book2("9781782118619","How to Stop Time","Matt Haig","Haig2017");
		list.add(book1);
		
		book2=new Book2("0394800028","The Cat in the Hat Comes Back","Dr Seuss","Seuss1958");
		list.add(book2);
		
		book3=new Book2("0679882804","The Foot Book","Dr Seuss","Seuss1996");
		list.add(book3);
		
		book4=new Book2("031670704X","Midnight Sun","Stephenie Meyer","Meyer2020");
		list.add(book4);
		
		details=new ArrayList<String>();
		

	}

	static  String loginFunction(String user, String pw) {
		String s ="";

	    for(CredentialsClass2 c:credential) {

		    if(c.username.equals(user)&&c.password.equals(pw)){				   
				    lio=true;
				    s="found";

				    return s;
				    
				    
	    	}
	    }
	
	lio=false;

	return s;
	}
	public void logoutFunction() {
		if(lio) {
			lio=false;
		}
		else {
			JOptionPane.showMessageDialog(null, "You are already logged out");
		}
		
	}

	public String addBook(String title, String author, String signature, String isbn) {
		Book2 b1=new Book2(isbn,title,author,signature);
		if(lio) {
				for(Book2 book:list) {
					if(b1.equals(book)) {
						System.out.println("This book is exist");
						
					}
					else {
						list2.add(b1);
					}
					
				}
				list.addAll(list2);
			
		}
		return "added";
		
	}

	public void setLoggedin(boolean l) {
		lio=l;
	}
	
	public ArrayList <Book2> searchBookbysubTitle(String subTitle) {
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
	public  ArrayList<Book2> searchBookbyAuthorName(String subAuthorName) {
		ArrayList <Book2> searchedBook=new ArrayList<Book2>();
		
		for(Book2 item:list)
		{
			String authorName=item.getAuthor().toLowerCase();
         int exist=authorName.indexOf(subAuthorName.toLowerCase());
         
         if(exist!=-1)
         {
        	 searchedBook.add(item);
         }
            
		}
		
		return searchedBook;
	}
	
	public ArrayList<Book2> searchBookbyISBN(String subStringISBN) {
		ArrayList <Book2> searchedBook=new ArrayList<Book2>();
		for(Book2 item:list)
		{
			String isbn=item.getISBN();
         int exist=isbn.indexOf(subStringISBN);
         
         if(exist!=-1)
         {
        	 searchedBook.add(item);
         }
            
		}
		return searchedBook;
	}
	
	public ArrayList<Book2> searchBookbySignature(String subSignature) {
		ArrayList <Book2> searchedBook=new ArrayList<Book2>();
		for(Book2 item:list)
		{
		 String signature=item.getSignature().toLowerCase();
         int exist=signature.indexOf(subSignature.toLowerCase());
         
         if(exist!=-1)
         {
        	 searchedBook.add(item);
         }
            
		}
		return searchedBook;
	}


}