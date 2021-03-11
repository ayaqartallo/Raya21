package mylibrary;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import practice2021.Books;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LibraryClass {

	private ArrayList <Book>list;
	private Book book;
	private ArrayList <CredentialsClass>credential;
	public static boolean lio=false;
	
	CredentialsClass c1,c2,c3,c4;

	
	public LibraryClass()
	{
		credential=new ArrayList <CredentialsClass> ();
		c1=new CredentialsClass("alaa","20alaa");
		c2=new CredentialsClass("aya","1234");
		c3=new CredentialsClass("malek","1998m");
		c4=new CredentialsClass("khalid","2021k");
		
		credential.add(c1);
		credential.add(c2);
		credential.add(c3);
		credential.add(c4);
		

	}
		
	
	public String loginFunction(String user,String pass) {
		String s ="";

		    for(CredentialsClass c:credential) {

			    if(c.username.equals(user)&&c.password.equals(pass)){				   
					    lio=true;
					    s="found";

					    return s;
					    
					    
		    	}
		    }
		
		lio=false;

		return s;
		
	}
	public void logoutFunction() {
		if(lio==true) {
			lio=false;
		}
		else {
			JOptionPane.showMessageDialog(null, "You are already logged out");
		}
		
	}

	public String addBook(String title, String author, String signature, String isbn) {
		Book b1=new Book(isbn,title,author,signature);
		if(lio==true) {
			while(list!=null) {
				for(Book book:list) {
					if(book.equals(b1)) {
						System.out.println("This book is exist");
					}
					else {
						list.add(b1);
					}
				}
			}
		}
		return "added";
		
	}

	public void setLoggedin(boolean l) {
		this.lio=l;
	}


}

