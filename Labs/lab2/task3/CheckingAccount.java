package task3;

public class CheckingAccount extends Account {
	private int transactions = 0;
	private static final double FREE_TRANSACTIONS = 2;
	
	public CheckingAccount() {
		
	}

	public CheckingAccount(int accNumber) {
		super(accNumber);
	}
	
	public void deductFee() {
		try {
			if(transactions > FREE_TRANSACTIONS) {
				super.withdraw(0.02);
			}
		} catch(Exception e) {
			System.err.println(e);
		}
	}
	
	public void transaction() {
		transactions++;
		try {
			deductFee();
			
		} catch(Exception e) {
			System.err.println(e);
		}
	}
	
	public void transfer(double amount, Account other) {
		super.transfer(amount, other);
		transaction();
		if(other instanceof CheckingAccount) {
			((CheckingAccount) other).transaction();
		}
	}
	
	public String toString() {
		return super.toString() + "\nCheckingAccount[" +
				"transactions made: " + transactions
				+ "]";
	}
}
