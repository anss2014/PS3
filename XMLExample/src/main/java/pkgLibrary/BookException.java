package pkgLibrary;

public class BookException extends Exception {
	private Book book;
	
	public BookException(){
		super();
	}
	public BookException(Book book){
		super("Sorry can't find the Book");
		this.book=book;
	}
	

}