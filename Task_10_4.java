package programming;

public class Account {

	int Number;
	String Name;
	int Balance;

	public Account(int Number, String Name) {
		this.Number = Number;
		this.Name = Name;
		this.Balance = 0;
	}

	
	public void deposit(int amount) {
		Balance += amount;
		System.out.println("Deposited: $" + amount);
	}

	
	public void withdraw(int amount) {
		Balance -= amount;
		System.out.println("Withdrawn: $" + amount);
	}

	// Display account information
	public void getAccountInfo() {
		System.out.println("Account Number: " + Number);
		System.out.println("Account Holder: " + Name);
		System.out.println("Balance: $" + Balance);
	}
}
