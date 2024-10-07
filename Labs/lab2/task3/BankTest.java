package task3;

public class BankTest {
	
	public static void main(String[] args) {
		Bank kaspi = new Bank("Kaspi");
		
		Account acc = new Account(5);
		CheckingAccount acc1 = new CheckingAccount(1);
		CheckingAccount acc2 = new CheckingAccount(2);
		SavingsAccount acc3 = new SavingsAccount(3);
		
		kaspi.openAccount(acc);
		kaspi.openAccount(acc1);
		kaspi.openAccount(acc2);
		kaspi.openAccount(acc3);
		
		acc1.deposit(1512.0);
		acc.deposit(1000.0);
		acc3.deposit(1000.0);
		
		
		kaspi.update();
		System.out.println(kaspi);
		acc1.transfer(512, acc2);
		acc1.transfer(500, acc2);
		acc1.transfer(10, acc2);
		acc3.calculateInterest(1);
		System.out.println(kaspi);
		
		acc3.transfer(200, acc1);
		kaspi.closeAccount(acc3);
		System.out.println(kaspi);
	}
}
