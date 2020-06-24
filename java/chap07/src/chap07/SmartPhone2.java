package chap07;

public class SmartPhone2 extends Phone2{
	public SmartPhone2(String name) {
		//추상화한 클래스를 상속받을 경우는 필히 맴버 필드나 생성자를 기술해야함
 		super(name);
		
		
		
	}
	
	//슈퍼 클래스의 메소드와 자식 클래스 간의 데이터 타입이 다를 경우는 오버라이딩을 할 수 없다.
	//메소드를 재생성해야함
//	@Override
	public void powerOn() {
		//추상화 메소드는 반드시 재정의 해야함
		System.out.println("전원을 킵니다.");			
	}
//	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다.");			
	}
	
	public void internetRun(){
		
		System.out.println("인터넷을 합니다.");
	}


	

}
