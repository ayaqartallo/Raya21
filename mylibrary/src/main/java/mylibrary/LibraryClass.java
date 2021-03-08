package mylibrary;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LibraryClass {

	private ArrayList <Book>list;
	private Book book;
	private ArrayList <CredentialsClass>credential;
	private boolean lio=false;
	
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
		String s = null;
		String u=user;
		String p=pass;
		while(credential!=null) {
		    for(CredentialsClass c:credential) {
			    if(c.username==user){
				    if(c.password==pass){
					    lio=true;
					    s=pass;
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

	public boolean addBook(String title, String auther, String signature, String isbn) {
		if(lio=true) {
			int i=Integer.parseInt(isbn);
			while(list!=null) {
				for(Book book: list) {
					if(book.isbn==i||book.signature==signature) {
						JOptionPane.showMessageDialog(null, "This book is exist");
					}
					else {
						this.book.title=title;
						this.book.auther=auther;
						this.book.signature=signature;
						this.book.isbn=i;
					}
				}
			}
		}
		return false;
		
	}

	public void setLoggedin() {
		lio=true;
	}
	

}
