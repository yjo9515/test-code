package chap07;

public class Tire extends Rubber {
	int num;
	//Rubber r1 = new Rubber();
	//Tire t1 = r1;  
	//상속관계에서 요소의 수가 다르므로 
	//형변환이 일어나지 않음
	//클래스 선언시 내부의 인스턴스
	Rubber flTire = new Rubber();  
	Rubber frTire = new Rubber();
	Rubber blTire = new Rubber();
	Rubber brTire = new Rubber();
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	void run() { System.out.println("수아가"
			+ " 올리래~!");}
}









