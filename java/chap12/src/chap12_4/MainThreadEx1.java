package chap12_4;

public class MainThreadEx1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		//비동기공유 (각각)
		User1 user1 = new User1();
		user1.setCalculator(cal);	//메모리 100번지
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(cal);	//메모리 50번지
		user2.start();

	}

}
