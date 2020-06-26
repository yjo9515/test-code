package chap10_3;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass(); //1) 실행부분의 함수 실행
		}
		catch(ClassNotFoundException e){	//4) 예외처리 실행
			System.out.println("해당 클래스가 존재하지 않음");			
		}

	}
	public static void findClass() throws ClassNotFoundException{	//3) 예외처리를 지시
		Class cla = Class.forName("java.lang.String2");	//2) 실행구문에 예외가 발생
	}
}
