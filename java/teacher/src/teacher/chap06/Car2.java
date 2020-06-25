package chap06;

public class Car2 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	Car2(){
		this("그랜저", "검정", 400);
	}
	Car2(String model){
		this(model, "검정", 400);
	}
	Car2(String model, String color){
		this(model, color, 400);
	}
	Car2(String model, String color, int maxSpeed){  //<-모두 this를 이용하여 실행
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public void setCompany(String company) {
		this.company = company;
		System.out.println("새로운 제작사가 추가되었습니다.");
	}
	public void getCompany() {
		System.out.println("제작사 : "+this.company);
	}
	public void powerOn() {
		System.out.println("시동이 켜졌습니다.");
		this.speed = 0;
	}
	public void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
		this.speed = 0;
	}
	public int speedUp() {  //메서드 오버로딩
		return this.speed+=10;
	}
	public int speedUp(int speed) {
		this.speed+=speed;
		return this.speed;
	}
	public void speedDown() {  //리턴값이 없으므로  인스턴스명.speed를 출력
		this.speed-=10;
	}
	public int speedDown(int speed) {
		this.speed-=speed;
		return this.speed;
	}
	public int breakPush() {
		this.speed = 0;
		return this.speed;
	}
}













