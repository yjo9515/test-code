package chap09_3;

public class OuterExample {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Nested nested = outer.new Nested();
		nested.print();
	}
}