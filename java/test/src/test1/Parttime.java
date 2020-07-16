package test1;

public class Parttime extends Employee {

	private String shift;
	private String name;
	

	public Parttime(String name) {
		
		this.name = name;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	//다형성
	@Override
	public void work() {
		System.out.println(this.name+"이 교대근무를 시작합니다.");
	}
	
	

}
