package chap10_2;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			
			//정상적인 처리 구문
			Class cla = Class.forName("java.lang.String");
			System.out.println("해당 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			//예외 발생시 처리할 구문 
			System.out.println("해당 클래스가 존재하지않습니다.");	
		} finally {
			//예외와 관계없이 반드시 처리해야할 구문
			System.out.println("해당 클래스의 존재유무를 파악하였습니다.");
			
		}
		
		
		

	}

}
