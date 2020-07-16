package test1;

public class Employee {
	
	public String name;
	private String position;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void clockIn() {System.out.println(this.name+"가 출근합니다.");}
	public void clockOut() {System.out.println(this.name+"가 퇴근합니다.");}
	public void work() {System.out.println(this.position+"가 일을 합니다.");}
	
	
	
}
