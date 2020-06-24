package chap07;

public abstract class Phone2 {
	public String name;
	
	
	public Phone2(String name) {
		
		this.name = name;
		
		
		
	}
	
//	public void powerOn() {
//		
//		System.out.println("폰의 전원을 켭니당.");
//		
//		
//	}
//	
//	
//	public void powerOff() {
//		
//		System.out.println("폰의 전원을 끕니당.");
//		
//	}
	public abstract void powerOn();
	public abstract void powerOff();
}
