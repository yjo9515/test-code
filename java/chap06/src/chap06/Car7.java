package chap06;

public class Car7 { //상수 클래스
	
	//final static : final은 값이 변경되지않고,
	//static은 정적인 걸로 별도의 인스턴스를 생성할 필요가 없는 것으로 주로 fianl과 static을 동시에 사용하여 상수를 선언
	static final double TIRE_PI = 3.141592;
	static final int TIRE_COUNT = 4;
	static final int TIRE_RADIUS = 250;
	static final double TIRE_AREA;
	static {
		TIRE_AREA = TIRE_PI * TIRE_RADIUS;
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("타이어 원주율 : "+Car7.TIRE_PI);
		System.out.println("타이어 개수 : "+TIRE_COUNT);
		System.out.println("타이어 면적 : "+TIRE_AREA);
		
		
	}

}
