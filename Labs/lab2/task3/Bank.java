package task3;
import java.util.Vector;

public class Bank {
	private String name;
	
	Vector<Account> accounts = new Vector<>();
	
	public Bank() {
		
	}
	
	public Bank(String name) {
		this.name = name;
	}
	
	public void openAccount(Account account) {
		accounts.add(account);
	}
	
	public void closeAccount(Account account) {
		accounts.remove(account);
	}
	
	public void closeAccount(int accNumber) {
		accounts.remove(new Account(accNumber));
	}
	
	public void update() {
		for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).calculateInterest(1);
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).getOverallFeeDeducted();
            }
        }
	}
	
	public String toString() {
		return "[Bank " +
				"name=" + name + 
				"accounts={" + accounts.toString() + "}" +
				"]";
	}
}
