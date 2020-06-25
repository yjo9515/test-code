package chap06;

public class Car3 { //정적 클래스 : 인스턴스를 만들지 않는다.
	static String company = "현대자동차";  //정적 변수
	static int speed = 0;
	static void speedUp() { System.out.println("속도가 증가되었습니다."); }  //정적 메서드
	static void speedDown() { System.out.println("속도가 감소되었습니다."); }
}