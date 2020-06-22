package chap06;

public class Car3 {
	
	String company = "기아자동차";
	String model = "아반떼";
	String color = "흰색";
	int speed = 0;
	Car3(){
		this("아반떼", "흰색");
		
	}

	Car3(String model){
		
		this(model, "흰색");
	}
	Car3(String model, String color){
		//<< 모두 this를 이용하여 갱신
		this.model=model;
		this.color=color;
	}
	public void setCompany() {
		this.company = company;
		System.out.println("새로운 제작사가 추가되었습니다.");	
		
	}
	
public void getCompany() {
	System.out.println("제작사 : "+this.company);	
}

public int speedUp() { //메소드 오버로딩
	return this.speed+=10;
	
}
public int speedUp(int speed) {
	this.speed+=speed;
	return this.speed;
}
public void speedDown() {
	
	this.speed-=speed;
}


public static void main(String[] args) {
	
	Car3 hcar1 = new Car3();
	System.out.println(hcar1.model);
	System.out.println(hcar1.color);
	
	
		
		System.out.println("현재 속도 : "+hcar1.speedUp());
		System.out.println("현재 속도 : "+hcar1.speedUp(60));
		System.out.println("현재 속도 : "+hcar1.speedUp(20));
		System.out.println("현재 속도 : "+hcar1.speed);
	
		
		Car4 kcar2 = new Car4(); // 문법적으로 이상은 없지만 정적클래스는 인스턴스를 생성하지 못한다.
		kcar2.speed = 100;
		kcar2.speedUp();
		
		Car4.speedUp();
		int speed = Car4.speed;
		Car4.speedDown();
		
	
	
	
	
}
	
	
	
}
