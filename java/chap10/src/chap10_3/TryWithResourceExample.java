package chap10_3;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception();	//강제 예외 코드 실행
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
			
		}
		
			
			try {
				//처리할 내용이 있는 메소드 실행
				method2();
			}
			catch(ClassNotFoundException e) {	//예외처리
				System.out.println("해당 클래스가 존재하지 않습니다.");
				
			}
		
		public void method2() throws ClassNotFoundException{
			Class cla = Class.forName("java.lang.String2");
			
		}
	
	}
}
