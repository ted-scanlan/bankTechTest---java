
public class Account {
	
	private int balance;
	
	public Account() {
		this(100);
	}
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	
	public int getCurrentBalance() {
		return this.balance;
	}
	
	public void setDepositAmount(int amount) {
		this.balance += amount;
	}
	
	public void setWithdrawAmount(int amount) {
		if(this.balance < amount) {
			throw new IllegalArgumentException("You don't have enough funds!");
		}
		this.balance -= amount;
	}
	

}
