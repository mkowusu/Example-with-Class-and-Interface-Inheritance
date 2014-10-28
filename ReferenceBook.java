package library;

public class ReferenceBook extends LibraryBook {

	
	String collection;

	//The constructor ReferenceBook(String, String, String, String, String) is undefined
	public ReferenceBook (String au, String ti, String num, String callNum, String Collection) {
		super(au, ti, num, callNum);
		collection = Collection;
	}
	
	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	@Override
	public void returned() {
		System.out.println("\nReference book could not have been checked out" +
				"-- return impossible\n\n");
	}
	
	@Override
	public void checkout(String Patron, String DueDate) {
		System.out.println("\nCannot check out a reference book\n\n");

	}
	
	@Override
	public String circulationStatus() {
		return "\nCirculation Status: non-circulating reference book\n\n";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nCollection: " + collection;
		
	}
	
	
}