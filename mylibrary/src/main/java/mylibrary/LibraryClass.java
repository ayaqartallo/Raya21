package mylibrary;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LibraryClass {

	private ArrayList <Book>list;
	private Book book;
	private ArrayList <CredentialsClass>credential;
	public static boolean lio=false;
	
	CredentialsClass c1;
	CredentialsClass c2;
	CredentialsClass c3;
	CredentialsClass c4;
	
	public void addCredentials() {
		c1.username="alaa"; c1.password="20alaa";
		c2.username="aya"; c2.password="1234";
		c3.username="malek"; c3.password="1998m";
		c4.username="khalid"; c4.password="2021k";
		credential.add(c1);
		credential.add(c2);
		credential.add(c3);
		credential.add(c4);
	}
	
	public String loginFunction(String user,String pass) {
		String s = "not found";
		String u=user;
		String p=pass;
		while(credential!=null) {
		    for(CredentialsClass c:credential) {
			    if(c.username==user){
				    if(c.password==pass){
					    lio=true;
					    s="found";
					    return s;
				    }
				
		    	}
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

	public String addBook(String title, String auther, String signature, String isbn) {
		String s = "not found";
		if(lio=true) {
			while(list!=null) {
				for(Book book: list) {
					if(book.isbn==isbn||book.signature==signature) {
						JOptionPane.showMessageDialog(null, "This book is exist");
						s="not fount";
					}
					else {
						this.book.title=title;
						this.book.auther=auther;
						this.book.signature=signature;
						this.book.isbn=isbn;
						list.add(book);
						s="found";
						
					}
				}
			}
		}
		return s;
		
	}

	public void setLoggedin() {
		this.lio=true;
	}
	

}
