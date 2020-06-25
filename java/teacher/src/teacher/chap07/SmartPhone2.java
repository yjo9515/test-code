package chap07;

public class SmartPhone2 extends Phone2 {
	public SmartPhone2(String name) {
		//추상화한 클래스를 상속받을 경우는 
		//필히 멤버 필드나 생성자를 기술해야함
		super(name);
	}
	
	@Override
	public void powerOn() { 
		//추상화 메서드는 반드시 재정의해야함
		System.out.println("전원을 켭니다.");
	}
	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//슈퍼 클래스의 메서드와 자식 클래스 간의 데이터 타입이 
	//다를 경우는 오버라이딩을 할 수 없다. 
	//메서드를 재생성해야 함
	//@Override
	public void power1On() { 
		//추상화 메서드는 반드시 재정의해야함
		System.out.println("전원을 켭니다.");
	}
	//@Override
	public void power1Off() {
		System.out.println("전원을 끕니다.");
	}

	public void internetRun() {
		System.out.println("스마트폰을 "
				+ "인터넷을 합니다.");
	}
}