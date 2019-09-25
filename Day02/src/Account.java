public class Account {
	double balance;
	int withdrawCount;
	
	//constructor overloading
	Account() {
		balance = 10000;
	}
	
//	Account() {
//		//check the guy who recommended you
//		//initialize balance
//	}
	
	Account(double initialBalance) {
		if(initialBalance < 10000) {
			//TALK ABOUT THIS LATER ONLY
			throw new RuntimeException("Invalid balance");
		}
		balance = initialBalance;
	}
	
	void deposit(double amount) {
		balance += amount;
	}
	
	void withdraw(double amount) {
		if(balance < amount) {
			System.out.println("Insufficient balance");
			return;
		}
		balance -= amount;
		withdrawCount++;
		if(withdrawCount > 3) {
			double fee = amount * 0.005;
			balance -= fee;
		}
	}
}
