package linking;

public class Book {
	private String BookId;
	private String Title;
	private String Author;
	private String price;
	public Book(String bookId, String title, String author, String price) {
		
		this.BookId = bookId;
		this.Title = title;
		this.Author = author;
		this.price = price;
		
		
	}
//	public Book[] addBook(int size) {
//		return new Book[size];
//	}
	
	public String getBookId() {
		return BookId;
		
	}
	public String getPrice() {
		return price;
		
	}
	public String getBookTitle() {
		return Title;
		
	}
	public String getAuthor() {
		return Author;
		
	}
	
	//setter 
	
	public void  setBookId() {
		this.BookId=BookId;
		
	}
	public void  setAuthor() {
		this.Author=Author;
		
	}
	public void  setTitle() {
		this.Title=Title;
		
	}
	public void setPrice() {
		this.price=price;
		
	}
	
	public String getDetials() {
		return "Book Id : "+BookId+" Title : "+Title+" Author : "+Author+" Price : "+price;
	}

	
}
