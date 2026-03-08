package encapsulation;
public class program1{

	
	int acno;
	String name;
	double balance;
	
	public void deposit(double amt) {
		if(amt>=0) {
		balance=balance+amt;
		System.out.println("Amount of "+amt+"Credited to your Account"+acno);
		System.out.println("Current Balance "+balance);
		}else {
			System.out.println("invalid amount Transaction cannot complete");
		}
	}
	
	public void withdraw(double amt) {
		if(amt<=balance) {
			balance=balance-amt;
			System.out.println("Amount of "+amt+"Debited from your Account "+acno);
			System.out.println("Current Balance "+balance);
		}else {
			System.out.println("invalid amount Transaction cannot complete");
		}
	}
}