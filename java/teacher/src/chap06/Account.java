package chap06;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private String ano;
	private String owner;
	private int balance;
	
	public Account() {
		this("1", "amugae", 0);
	}
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	int getBalance() {
		return balance;		
	}
	void setBalance(int balance) {
		if(balance >= 0 && balance <= 100000) {
			this.balance = balance;
		}
	}
}