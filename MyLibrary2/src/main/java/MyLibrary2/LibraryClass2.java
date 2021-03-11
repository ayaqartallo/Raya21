package MyLibrary2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import MyLibrary2.Book2;
import MyLibrary2.CredentialsClass2;

public class LibraryClass2 {
	
	private ArrayList <Book2>list;
	private Book2 book;
	private ArrayList <CredentialsClass2>credential;
	public static boolean lio=false;
	
	CredentialsClass2 c1,c2,c3,c4;

	
	public LibraryClass2()
	{
		credential=new ArrayList <CredentialsClass2> ();
		c1=new CredentialsClass2("alaa","20alaa");
		c2=new CredentialsClass2("aya","1234");
		c3=new CredentialsClass2("malek","1998m");
		c4=new CredentialsClass2("khalid","2021k");
		
		credential.add(c1);
		credential.add(c2);
		credential.add(c3);
		credential.add(c4);
		

	}

	public  String loginFunction(String user, String pw) {
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
		if(lio==true) {
			lio=false;
		}
		else {
			JOptionPane.showMessageDialog(null, "You are already logged out");
		}
		
	}

	public String addBook(String title, String author, String signature, String isbn) {
		Book2 b1=new Book2(isbn,title,author,signature);
		if(lio==true) {
			while(list!=null) {
				for(Book2 book:list) {
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
