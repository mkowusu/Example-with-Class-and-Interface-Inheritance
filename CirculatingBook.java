package library;

public class CirculatingBook extends LibraryBook {
	
	//fields
	static String currentHolder;
	static String dueDate;
	
	//constructor
	public CirculatingBook(String au, String ti, String num, String callNumber){
		super(au, ti, num, callNumber);
		currentHolder = "";
		dueDate = "";
	}
	
	//setters and getters
	public static String getCurrentHolder() {
		return currentHolder;
	}

	public void setCurrentHolder(String currentHolder) {
		CirculatingBook.currentHolder = currentHolder;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		CirculatingBook.dueDate = dueDate;
	}

	@Override
	public void checkout(String Patron, String DueDate) {
		setCurrentHolder(Patron);
		setDueDate(DueDate);
		
	}

	@Override
	public void returned() {
		setCurrentHolder("");
		setDueDate("");
		
	}

	@Override
	public String circulationStatus() {
		//	this.getCallNumber().compareTo(lib.getCallNumber());
		if (CirculatingBook.getCurrentHolder().compareTo("") == 0)
			return "\nCirculation Status: Book available on shelves\n\n";
		else return "\nChecked out by: " +currentHolder 
				+ "\nWill Return: " + dueDate + "\n\n";
		
	}
}
