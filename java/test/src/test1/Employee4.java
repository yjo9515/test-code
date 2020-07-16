package test1;

public class Employee4 {
	private String name;
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
	public void work() {
		System.out.println(this.name+"는 "+this.position+"입니다.");
	}
	
	
}
