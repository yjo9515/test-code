package chap10_3;



public class BalanceInsufficientException extends Exception{
	BalanceInsufficientException() { }
	public BalanceInsufficientException(String msg) {
		super(msg);
	}
}
