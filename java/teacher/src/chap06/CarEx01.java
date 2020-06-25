package chap06;

public class CarEx01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("삼성자동차");
		Car car3 = new Car("현대자동차", "그랜저");
		Car car4 = new Car("현대자동차", "소나타", "흰색");
		Car car5 = new Car("현대자동차", "소나타", "흰색", 350);
		Car car6 = new Car("현대자동차", "소나타", "흰색", 350, 120);
		car1.company = "기아자동차";
		car1.model = "K5";
		car1.color = "RED";
		Car2 hcar1 = new Car2();
		System.out.println("제작사 : "+hcar1.company);
		System.out.println("모델명 : "+hcar1.model);
		System.out.println("색상 : "+hcar1.color);
		System.out.println("최대속도 : "+hcar1.maxSpeed);
		
		hcar1.setCompany("기아자동차");
		hcar1.getCompany();
		hcar1.powerOn();
		System.out.println("현재 속도 : "+hcar1.speedUp());
		System.out.println("현재 속도 : "+hcar1.speedUp(60));
		System.out.println("현재 속도 : "+hcar1.speedDown(20));
		System.out.println("현재 속도 : "+hcar1.speed);
		System.out.println("현재 속도 : "+hcar1.breakPush());
		
		Car3 kcar2 = new Car3();  //문법적으로 이상은 없지만 정적클래스는 인스턴스를 생성하지 못한다.
		kcar2.speed = 100;
		kcar2.speedUp();
		
		Car3.speedUp();  //정적 클래스는 인스턴스 만들수가 없으며, 클래스를 자연 그대로 사용함
		int speed = Car3.speed;
		Car3.speedDown();
		
		
//		Car4 obj1 = new Car4();
//		Car4 obj2 = new Car4();
		
		Car4 obj1 = Car4.getInstance();  //싱글톤 클래스는 내부 생성메서드를 이용해 하나만 객체를 생성
		Car4 obj2 = Car4.getInstance();	//obj1과 obj2는 같은 객체로 공유 저장소임
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		Car5 ins1 = new Car5("소나타", "검정");
		//ins1.company = "kia";
		//ins1.model = "그랜저";
		ins1.color = "빨강";
		System.out.println("회사명 : "+ins1.company);
		System.out.println("차종 : "+ins1.model);
		System.out.println("색상 : "+ins1.color);
		
		System.out.println("타이어 원주율 : "+Car6.TIRE_PI);
		System.out.println("타이어 개수 : "+Car6.TIRE_COUNT);
		System.out.println("타이어 면적 : "+Car6.TIRE_AREA);
	}
}










