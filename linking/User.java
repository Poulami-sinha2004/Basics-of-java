package linking;

public class User {
	public static void main(String[] args) {

		Library library=new Library();
		library.setname("ABC Library");
		library.setlocation("Mumbai");
		library.setaddress("Mumbai");
		library.setpincode("86456");
		
		
//		Book[] book1=Library.addBook(4);
		Book[] book=library.addBook(4);

		book[0]=new Book("1","Harry Potter and Chamber of secrets", "JK rowlings","250");
		book[1]=new Book("2","Sherlock homes","Arthur canon","600");
		book[2]=new Book("3","Perfect Murder","Ruskin Bond","400");
		book[3]=new Book("4","No Exit","Taylor Adam","700");
		
		System.out.println(library.getLibraryDetials());
		
		System.out.println("===================================================");
		
		for(int i=0;i<book.length;i++) {
			System.out.println(book[i].getDetials());
		}
	}
}