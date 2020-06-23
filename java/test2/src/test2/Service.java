package test2;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("첫 번째 메소드 실행1");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("두 번째 메소드 실행2");
	}
	@PrintAnnotation(value="yun",number=20)
	public void method3() {
		System.out.println("세 번째 메소드 실행");
		
	}
}
