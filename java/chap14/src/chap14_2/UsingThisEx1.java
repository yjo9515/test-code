package chap14_2;

public class UsingThisEx1 {

	public static void main(String[] args) {
		UsingThis ut1 =new UsingThis();
		UsingThis.Inner inner = ut1.new Inner();
		inner.method();

	}

}
