package mylibrary;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LibraryClass {

	private ArrayList <Book>list=new ArrayList<Book>();
	private Book book;
	private ArrayList <CredentialsClass>credential=new ArrayList<CredentialsClass>();
	
	CredentialsClass c1=new CredentialsClass("alaa", "20alaa");
	CredentialsClass c2=new CredentialsClass("aya", "1234");
	CredentialsClass c3=new CredentialsClass("malek", "1998m");
	CredentialsClass c4=new CredentialsClass("khalid", "2021k");
	
	public void addCredentials() {
		credential.add(c1);
		credential.add(c2);
		credential.add(c3);
		credential.add(c4);
	}
	
	public String loginFunction(String user,String pass,boolean lio) {
		String s = null;
		String u=user;
		String p=pass;
		for(int i=0;i<credential.size();i++) {
			if(credential.contains(user)){
				if(credential.contains(pass)){
					lio=true;
					s=pass;
					return s;
				}
				
			}
		}
		lio=false;
		return s;
		
	}
	
	public void logoutFunction(boolean lio) {
		
		JOptionPane.showMessageDialog(null, "You are logout");
		
	}

	public void addBook(String title, String auther, String signature, String isbn) {
		book.title=title;
		book.auther=auther;
		book.signature=signature;
		book.isbn=Integer.parseInt(isbn);
		list.add(book);
		
	}
	

}
