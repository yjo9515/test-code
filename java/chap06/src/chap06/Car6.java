package chap06;

public class Car6 { //final 클래스 : 맴버 필드의 값이 한 번 정해지면 더 이상 변경할 수 없도록 설계된 클래스
	final String company = "hyundai";
	final String model;
	String color;
	public Car6(String model , String color) {
		this.model = model;
		this.color = color;

	}
	public static void main(String[] args) {
		Car6 ins1 =new Car6("소나타", "검정");
		//ins1.company = "kia";
		//ins1.model = "그런저";
		ins1.color = "빨강";
		System.out.println("회사명 : "+ins1.company);
		System.out.println("차종 : "+ins1.model);
		System.out.println("색상 : "+ins1.color);
		
		
	}
	
}
