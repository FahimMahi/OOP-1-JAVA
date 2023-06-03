public class Book{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	public Book(){}
	public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy){
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy = bookCopy;
	}
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	public String getBookName(){
		return bookName;
	}
	public void setBookAuthor(String bookAuthor){
		this.bookAuthor = bookAuthor;
	}
	public String getBookAuthor(){
		return bookAuthor;
	}
	public void setBookId(String bookId){
		this.bookId = bookId;
	}
	public String getBookId(){
		return bookId;
	}
	public void setBookType(String bookType){
		this.bookType = bookType;
	}
	public String getBookType(){
		return bookType;
	}
	public void setBookCopy(int bookCopy){
		this.bookCopy= bookCopy;
	}
	public int getBookCopy(){
		return bookCopy;
	}
	public void showInfo(){
		System.out.println("Book Name: " +bookName);
		System.out.println("Book's Author Name: " +bookAuthor);
		System.out.println("Book's Id: " +bookId);
		System.out.println("Book's Type: " +bookType);
		System.out.println("Book's Copy: " +bookCopy);
	}
}