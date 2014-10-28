package library;

//constructors and methods

public class Book {
	
	//fields
	String author;
	String title;
	String ISBN; //an ISBN or International Standard Book Number that provides a unique number used by publishers and book stores.


	// a null constructor
	public Book() {
		author = "";
		title = "";
		ISBN = "";

	}

	// a constructor using 3 parameters for an author, title, and ISBN number
	public Book(String au, String ti, String num) {
		author = au;
		title = ti;
		ISBN = num;

	}

	// getters and setters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return ISBN;
	}



	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	// toString method to yield nicely formatted output string
	public String toString() {
		return "Author: " + author + "\nTitle: " + title + "\nISBN: " + ISBN;
	}

}
