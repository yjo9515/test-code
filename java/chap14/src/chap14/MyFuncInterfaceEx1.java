package chap14;

public class MyFuncInterfaceEx1 {

	public static void main(String[] args) {
		MyFuncInterface fmi1;
		fmi1 = () -> {	//람다식 활용법 , 인터페이스가 필요 , 하나의 메소드만기술
			String str = "함수호출";
			System.out.println(str);
		};
		fmi1.method();

		MyFuncInterface2 fmi2;
		fmi2 = (x) -> {
			int res=x*x;
			System.out.println("결과값 : "+res);
		};
		fmi2.method2(12);
		
		MyFuncInterface3 fmi3;
		fmi3 = (x, y) -> {
			int res = x+y;
			return res;
		};
		System.out.println(fmi3.method3(10, 20));
		
		fmi3 = (x,y) -> {
			int res2 = x*y;
			return res2;
		};
		System.out.println(fmi3.method3(10, 20));
	}

}
//람다식 활용문법 
//인터페이스인스턴스명 = () -> { 표현식 };	---- 표현식 정의
//인터페이스인스턴스명, 메소드명();		---- 함수호출