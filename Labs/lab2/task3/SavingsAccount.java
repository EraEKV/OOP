package task3;

public class SavingsAccount extends Account {
	private static double interestRate = 0.13;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(int accNumber) {
        super(accNumber);
    }
	
	public void calculateInterest(int months) {
		double result = getBalance() * interestRate * months / 12;
		deposit(result);
	}
	
	
	public String toString() {
		return super.toString() + 
				", [Deposit interest=" + interestRate + "]";
	}
}
