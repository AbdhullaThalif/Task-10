package programming;

public class ConstructorAccountClass {

	public static void main(String[] args) {
		Account account = new Account(202122, "Ashwin");

		account.getAccountInfo();
		System.out.println();

		account.deposit(1000);
		account.withdraw(500);
		account.getAccountInfo();
	}
}