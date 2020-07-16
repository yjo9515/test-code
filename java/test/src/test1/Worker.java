package test1;

public class Worker extends Employee4 {
	public void echo() {
		System.out.println("여러분 자바는 언어입니다.");	//따로 메소드를 작성
	}

	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.setName("정영주"); 	//Employee4의 구조를 알기가 어렵다.
		worker.setPosition("차장");
		worker.work();
		worker.echo();
	}

}
