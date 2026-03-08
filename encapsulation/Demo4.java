package encapsulation;

public class Demo4 {
	
	//private variable global var,method,Constructor
	//class Initializer not used 
	// Constructor ---> object 
	private Demo4(){
		
	}
	private int a;
	// write value , read the value
	
	//method write design setter method
	//read the value design getter method
	
	public int getValueA() {
		return a;
	}
	
	public void setValueA(int a) {
		this.a=a;
	}
	// Factory Method
	static Demo4 obj1;
	public static Demo4 getA() {
		if(obj1==null) {
			obj1=new Demo4();
		}
		return obj1;
		
	}
}

