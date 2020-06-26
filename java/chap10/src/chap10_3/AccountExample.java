package chap10_3;

public class AccountExample {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.deposit(5000);
		System.out.println("현재 예금액 : " + acc.getBalance());
		try {
			acc.withdraw(10000);
		}
		catch(BalanceInsufficientException e) {
			String msg = e.getMessage();
			System.out.println(msg);
			System.out.println("잔고 부족");
			e.printStackTrace();
			
			
			
			
		}
	}

}
