package test2_2;

import test2.A;

public class C {
	public static void mian(String[] args) {
//		A a1 = new A(); // 생성자 함수가 default 이므로 패키지가 달라 에러
//		A a2 = new A("문자열"); // 생성자 함수가 private이므로 에러
//		A a3 = new A(1); // 생정자 함수가 default이므로 패키지가 달라 에러
		A a4 = new A(true);
		
		a4.field1 = 100; //public
//		a4.field2 = 200;
//		a4.field3 = 300;
		
//		a4.method(); 
//		a4.method();
//		a4.method();
		
		
		
	}
	
	
	
	
	
}
