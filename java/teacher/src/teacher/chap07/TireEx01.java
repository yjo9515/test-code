package chap07;

public class TireEx01 {
	public static void main(String[] args) {
		Rubber rb1 = new Rubber();
		Tire tire1 = new Tire();
		Rubber rb2 = tire1;	
		//자동 형변환 - 상속관계에서 부모에 의한 자동 형변환 (O)
		//Tire tire2 = rb1;	
		//자동 형변환 - 상속관계에서 자식에 의한 자동 형변환 (X)
		//Hammer h1 = tire1;  
		//자동 형변환 - 다른 클래스와의 의한 자동 형변환(▲);
		
		int abc=12;
		char n='A';
		abc = n;  //기본형 자동 형변환
		abc = (int) n;	//기본형 수동 형변환
		
		Tire myTire = new Tire();
		myTire.flTire = new Rubber();  
		//클래스 내부의 인스턴스 활용
		myTire.blTire = new Rubber();
		myTire.run();
	}
}