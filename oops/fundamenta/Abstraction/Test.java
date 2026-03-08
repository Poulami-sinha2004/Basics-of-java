package oops.fundamenta.Abstraction;

abstract class payment{
	double amount;
	public payment(double amount) {
		this.amount=amount;
	}

public void paymentInfo(){
	System.out.println("amount"+amount);
}
public abstract void makePayment();

}

class CreditCard extends payment{
	String creditcompany;
	public CreditCard(double amount,String creditcompany){
		super(amount);
		this.creditcompany=creditcompany;
	}
	@Override
	public void paymentInfo() {
		System.out.println("company"+creditcompany);
	}
	public void makePayment() {
		System.out.println("amount is done using credit card");
	}
	
}
class UpiPayment extends  payment{
	String UpiApp;
	public UpiPayment(double amount, String UpiApp) {
		super(amount);
		this.UpiApp=UpiApp;
	}
		public void PaymentInfo() {
			System.out.println("upi payment");
			
		}
		@Override
		public void makePayment() {
			System.out.println("amount is credited");
		}
		
	}
	

	public class Test {
		public static void main(String[] args) {
			payment p= new CreditCard(244.5,"polu company");
			payment p1=new UpiPayment(2333.5,"yono");
			p1.makePayment();
			p1.paymentInfo();
			p.makePayment();
			p.paymentInfo();
			
		}
		
}


