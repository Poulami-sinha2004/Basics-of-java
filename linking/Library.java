package linking;

public class Library {
	private String name;
	private String location;
	private String address;
	private String pincode;
	Book [] b= new Book[4];
	
	
	public Book[] addBook(int size) {
		return new Book[size];
	}

	
	public String getname() {
		return name;
		
	}
	public String getlocation() {
		return location;
		
	}
	public String getaddress() {
		return address;
		
	}
	public String getpincode() {
		return pincode;
		
	}
	
	//setter 
	
	public void  setlocation(String location) {
		this.location=location;
		
	}
	public void  setpincode(String pincode ) {
		this.pincode=pincode;
		
	}
	public void  setaddress(String address) {
		this.address=address;
		
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public String getLibraryDetials() {
		return "Name "+name+" Location "+location+" Address "+address+" Pincode : "+pincode; 
	}
	
}
