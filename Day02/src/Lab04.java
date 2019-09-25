
public class Lab04 {

	public static void main(String[] args) {
		Account acc1 = new Account(15000);
		acc1.deposit(1000);
		acc1.deposit(1000);
		acc1.deposit(1000);
		acc1.withdraw(100);
		acc1.withdraw(100);
		acc1.withdraw(100);
		acc1.withdraw(100);
		acc1.withdraw(100);
		acc1.withdraw(100);
		System.out.println("Balance: " + acc1.balance);
	}

}
