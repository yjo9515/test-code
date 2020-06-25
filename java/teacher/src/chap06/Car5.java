package chap06;

public class Car5 {  //final 클래스 : 멤버 필드의 값이 한 번 정해지면 더 이상 변경할 수 없도록 설계된 클래스 
	final String company = "hyundai";
	final String model;
	String color;
	public Car5(String model, String color) {
		this.model = model;
		this.color = color;
	}
}