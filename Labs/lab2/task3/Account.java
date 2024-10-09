package task3;

public class Account{
	private double balance;
	private int accNumber;

	public Account() {

	}

	public Account(int a){
		balance = 0.0;
		accNumber = a;
	}

	public void deposit(double sum) {
		balance += sum;
	}

	public void withdraw(double sum) throws Exception {
		if(balance >= sum) {
			balance -= sum;
		} else {
			throw new Exception("Under-balance");
		}
	}

	public double getBalance() {
		return this.balance;
	}

	public double getAccountNumber() {
		return this.accNumber;
	}

	public void transfer(double amount, Account other) {
		if(amount <= getBalance()) {
			try {
				this.withdraw(amount);
				other.deposit(amount);
			} catch(Exception e) {
				System.err.println(e);
			}
		}
	}
	
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		
		Account other = (Account) o;
		
		return accNumber == other.getAccountNumber();
	}
	
	public int hashCode() {
		int result = 1;
		result = result * 31 + accNumber;
		result = result * 31 + (int) balance;
		return result;
	}

	@Override
	public String toString() {
		return "Account[" +
				"accNumber=" + accNumber +
				", balance=" + balance +
				"]";
	}
	

	public final void print() {
		System.out.println(toString());
	}
}