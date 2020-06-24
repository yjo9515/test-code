package chap07;

public class Tire extends Rubber {

	int num;
	
	// Rubber r1 = new Rubber();
	// Tire t1 = r1; 상속관계에서 요소의 수가 다르므로 형변환이 일어나지 않음

	Rubber flTire = new Rubber();
	Rubber frTire = new Rubber();// 클래스 선언시 내부의 인스턴스 = 클래스안에 클래스
	Rubber blTire = new Rubber();
	Rubber brTire = new Rubber();
//	
//	Tire frTire = new Tire();
//	Tire blTire = new Tire();
//	Tire brTire = new Tire();

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	void run() {
		System.out.println("올려");
	}

	public static void main(String[] args) {
		Rubber rb1 = new Rubber();
		Tire tire1 = new Tire();
		Rubber rb2 = tire1; // 자동 형변환 : 상속관계에서 부모에 의한 자동 형변환(o)
		// Tire tire2 = rb1; //자동 형변환 : 상속관계에서 자식에 의한 자동 형변환(x)
		// Hammer h1 = tire1; //자동 형변환 : 다른 클래스의 의한 자동 형변환(x)

		Tire myTire = new Tire();
		myTire.flTire = new Rubber();// 클래스 내부의 인스턴스 활용
		myTire.blTire = new Rubber();
		myTire.run();

//		Tire tire1 = rb1; 형변환

	}
}
