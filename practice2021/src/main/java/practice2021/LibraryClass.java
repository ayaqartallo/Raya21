package practice2021;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class LibraryClass {

	static boolean lio;
	ArrayList <Books> list;

	public void setLoggedin(boolean b) {
		this.lio=b;
		
	}

	public String addBook(String title, String author, String signature, String isbn) {
        
		Books b1=new Books(isbn,title,author,signature);
		while(list!=null) {
			for(Books book:list) {
				if(book.equals(b1)) {
					System.out.println("This book is exist");
				}
				else {
					list.add(b1);
				}
			}
		}
		return "added";
	}
	

}
