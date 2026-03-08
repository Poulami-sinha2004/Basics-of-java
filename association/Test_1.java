package association;

public class Test_1 {
	public static void main(String[] args) {
			
		Car_1 c=new Car_1();
		c.setBrand("A");
		c.setPrice(20000000);
		
		
		Engine e=c.getEngine();
		System.out.println(e);
	}
}