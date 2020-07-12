package practice6;

public class Account {

	public static final int MAX_BALANCE = 1000000;
	public static final int MIN_BALANCE = 0;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>MAX_BALANCE || balance<MIN_BALANCE) {
			return;
			
		}
		this.balance=balance;
			
			

	}
	
	
	
	
}
