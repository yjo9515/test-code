package test2;

public class B {

	public static void main(String[] args) {
		A a1 = new A();
//		A a2 = new A("문자열"); 생성자 함수가 private이므로 에러
		A a3 = new A(1);
		A a4 = new A(true);
		
		
		a1.field1 = 100;
		a1.field2 = 200;
		
		
		a1.method1();
		a1.method2();
//		a1.method3(); (private)
		
	}

}
