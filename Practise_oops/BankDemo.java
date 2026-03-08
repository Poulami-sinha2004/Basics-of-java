package Practise_oops;

interface Account {
	void deposit(double amount);

	void withdraw(double amount);

	double getBalance();

	String getAccountHolder();

	int getAccountNumber();
}

class BaseAccount implements Account {
	String accountHolderName;
	int accountNumber;
	double balance;

	public BaseAccount(String holderName, int accountNumber, double balance) {
		this.accountHolderName = holderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolderName;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds!");
		}
	}

	public double getBalance() {
		return balance;
	}
}

class CheckingAccount extends BaseAccount {
	public CheckingAccount(String holderName, int accountNumber, double balance) {
		super(holderName, accountNumber, balance);
	}

	public void makeDeposit(double amount) {
		deposit(amount);
	}

	public void makeWithdraw(double amount) {
		withdraw(amount);
	}
}

class SavingAccount extends BaseAccount {
	double interestRate;

	public SavingAccount(String holderName, int accountNumber, double balance, double interestRate) {
		super(holderName, accountNumber, balance);
		this.interestRate = interestRate;
	}

	public void addInterest() {
		balance += balance * interestRate / 100;
	}
}

class CreditCard extends BaseAccount {
	double creditLimit;

	public CreditCard(String holderName, int accountNumber, double balance, double creditLimit) {
		super(holderName, accountNumber, balance);
		this.creditLimit = creditLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (balance + creditLimit >= amount) {
			balance -= amount;
		} else {
			System.out.println("Credit limit exceeded!");
		}
	}
}

public class BankDemo {
	public static void main(String[] args) {
		// Create a Checking Account
		CheckingAccount checking = new CheckingAccount("Alice", 1001, 500.0);
		System.out.println("Checking Account created for " + checking.getAccountHolder());
		checking.makeDeposit(200);
		checking.makeWithdraw(100);
		System.out.println("Checking Balance: " + checking.getBalance());

		// Create a Saving Account
		SavingAccount saving = new SavingAccount("Bob", 2001, 1000.0, 5.0);
		System.out.println("\nSaving Account created for " + saving.getAccountHolder());
		saving.deposit(500);
		saving.addInterest(); // Apply interest
		System.out.println("Saving Balance after interest: " + saving.getBalance());

		// Create a Credit Card Account
		CreditCard credit = new CreditCard("Charlie", 3001, 0.0, 1000.0);
		System.out.println("\nCredit Card Account created for " + credit.getAccountHolder());
		credit.withdraw(300); // Uses credit limit
		System.out.println("Credit Card Balance: " + credit.getBalance());
		credit.deposit(200); // Repay part of credit
		System.out.println("Credit Card Balance after repayment: " + credit.getBalance());
	}
}
