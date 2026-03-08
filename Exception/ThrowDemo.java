.package Exception;

public abstract class ThrowDemo {
	public static void vote(int age) throws ClassNotFoundException{
		if(age>=18) {
			System.out.println("caandidate voted");
		}
		else{
//			try {
//				throw new ArithmeticException;
//			
			throw new ClassNotFoundException();
		}
//		catch(ArithmeticException e) {
//			System.out.println("cannot vote");
//		}
	}


public static void main(String[] args) {
	System.out.println("candidate goes to vote");
	try {
		vote(17);
	}
	catch(Exception e){
		System.err.println("candidate cannor vote");
		System.err.println(e.getMessage());
		
	}
	System.out.println("Candidate comes growth");
	
	}
}
