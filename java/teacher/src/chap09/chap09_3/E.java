package chap09_3;

public class E {
	int field1;
	void method1() { }
	
	static int field2;
	static void method2() { }
	
	class F {
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}
	
	static class G {
		void method() {
			//field1 = 10;
			//method1();

			field2 = 10;
			method2();
		}
	}	
}
