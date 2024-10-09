package task3;

public class CheckingAccount extends Account {
	private int transactions = 0;
	private static double FREE_TRANSACTIONS = 2;
	private static double FEE = 0.02;
	
	public CheckingAccount() {
		
	}

	public CheckingAccount(int accNumber) {
		super(accNumber);
	}
	
	public void deductFee() {
		try {
			if(transactions > FREE_TRANSACTIONS) {
				super.withdraw(FEE);
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
	
	public int getTransactions() {
		return this.transactions;
	}
	
	public double getOverallFeeDeducted() {
		return FEE * transactions;
	}
	
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		CheckingAccount other = (CheckingAccount) o;
		return this.transactions == other.getTransactions();
	}
	
	
	public int hashCode() {
		int result = super.hashCode();
		result = result * 31 + transactions;
		
		return result;
	}
	
	
	public String toString() {
		return super.toString() + "\nCheckingAccount[" +
				"transactions made: " + transactions
				+ "]";
	}
}
