package oops.fundamenta.Abstraction.multi_level;
abstract class Course{
	String name;
	public void CourseInfo() {
		System.out.println("gives course info details");
		
	}
	abstract void CoursePrice();

}


class onlineCourse extends Course{
	public int platformCharge;
	onlineCourse(int platformCharge){
		this.platformCharge=platformCharge;
	}
	@Override
	public void CoursePrice() {
		System.out.println("gives the price of platform "+platformCharge);
	}

}

class onlinepaidcourse extends onlineCourse{
	int coursefee;
	onlinepaidcourse(int coursefee, int platformCharge){
		super(platformCharge);
		this.coursefee=coursefee;
		
	}
	@Override
	public void CoursePrice() {
		System.out.println("platform fee: "+platformCharge+" course fee: "+ coursefee);
	}
	
}


public class Test {
	public static void main(String[] args) {
		onlineCourse op= new onlinepaidcourse(1222,122233);
		op.CourseInfo();
		op.CoursePrice();
		
		
		
	}
}