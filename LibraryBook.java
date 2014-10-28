package library;

public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{

	
	//field
	String callNumber;
	
	public LibraryBook (String au, String ti, String num, String callNum){
		super(au, ti, num);
		callNumber = callNum;
	}

	//getters and setters
	public String getCallNumber() {
		return callNumber;
	}
	
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}
	
	//abstract functions
	public abstract void checkout(String Patron, String DueDate);
	public abstract void returned();
	public abstract String circulationStatus();
	
	/** 
	 * implementation of Comparable's compareTo method
	 * @param lib:  Library object being compared
	 * @return 0 if call numbers of this and lib match
	 *         < 0 if call number of this comes before call number of lib
	 *         > 0 otherwise
	 *         to do- Make this work for call number!!
	 */
	public int compareTo (LibraryBook lib) {
		 return this.getCallNumber().compareTo(lib.getCallNumber());
		
	}
	
	/**
	 * @return title, author, ISBN, call number as a String for printing
	 */
	public String toString(){
		return super.toString() + "\nCallNumber: "+ callNumber + circulationStatus();
	}
	
	
}

