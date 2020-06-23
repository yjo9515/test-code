package test2;

public class A {
//	A a1 = new A(true)
//	A a2 = new a(1);
//	A a3 = new A("문자열");
	
//	맴버 필드의 접근 제한자
	public int field1;
	int field2;
//	private field3 = 10;
	
//	매서드의 접근 제한자
	public void method1() {}
	void method2() {}
	private void mathod3() { }
	
	
	
	
	
	
// 생성자 함수의 접근 제한자
	A(){}
	public A(boolean b) {} //public은 모든 패키지내의 클래스
	A(int b){}	//defult는 해당 패키지내 다른 클래스만
	private A(String b) {} //private는해당클래스 내부에서만 
	
}
