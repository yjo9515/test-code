package chap09_3;

public class Outer {
	//�ڹ�7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; (x)
		//localVariable = 100; (x)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//�ڹ�8 ����
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100; (x)
		//localVariable = 100; (x)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String nField = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.nField);
			this.method();
			System.out.println(Outer.this.field);
			Outer.this.method();
		}
	}
}   