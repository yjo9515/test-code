package test1;

public class Manager3 {	//위임 클래스
	Employee3 emp3 = new Employee3();	//원본 클래스로부터 인스턴스를 만듦
	
	public void echo() {	//위임:상속받지않고 다른클래스를 객체로 받아서 실행시킴
		emp3.echo();		//원본 클래스의 매소드를 호출
		
	}
}
