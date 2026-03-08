package Linking1;

public class Subscription {
	int amount;
	String enddate;
	int nodev;

	public Subscription(int amount, String enddate, int nodev) {
		this.amount = amount;
		this.enddate = enddate;
		this.nodev = nodev;

	}

	public String getDetails() {
		return "amount " + amount + " enddate " + enddate + " getdevices" + nodev;
	}

}
