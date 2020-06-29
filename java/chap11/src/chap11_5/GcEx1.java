package chap11_5;

public class GcEx1 {
	
	public static void main(String [] args) {
		Employee emp;
		
		emp = new Employee(1);
		
		emp = null;
		emp = new Employee(1000);
		emp = new Employee(1004);
		
		System.out.println("emp가 참조하는 사원번호는 ? : "+emp.eno+" : "+emp.toString());
		System.out.println("emp가 참조하는 사원번호는 ? : "+emp.eno+" : "+emp.toString());
		System.out.println("emp가 최종적으로 참조하는 사원번호는 ? : "+emp.eno+" : "+emp.toString());
		
		System.gc(); //쓰레기 수집
		
	}
}
class Employee{
	public int eno;
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Emplyee("+eno+") 가 메모리에 생성됨");
		
	}
	
	public void finalize() {
		System.out.println("Emplyee("+eno+") 가 메모리에서 제거됨");
	}
}
