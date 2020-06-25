package chap07;

public class PhoneEx2 {
	public static void main(String[] args) {
		//Phone2 p1 = new Phone2();  
		//추상화 클래스는 직접적으로 인스턴스 생성 안됨
		Phone2 p1 = null;
		SmartPhone2 sp1 = new SmartPhone2(
				"정하늘");
		p1 = new SmartPhone2("정하늘");
		sp1.powerOn();
		sp1.internetRun();
		sp1.powerOff();
	}
}