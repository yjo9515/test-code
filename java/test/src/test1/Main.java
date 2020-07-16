package test1;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("윤준오");
		emp.getName();
		
		emp.setPosition("알바");
		emp.getPosition();
		
		emp.clockIn();
		emp.clockOut();
		emp.work();
		
		Parttime time = new Parttime("백유안");
		time.setShift("이동");
		time.getShift();
		time.work();
		
		

	}

}
