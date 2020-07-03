package chap13;

public class BoxEx1 {

	public static void main(String[] args) {
		Box bx = new Box();
		bx.set("김기태");
		String name =(String) bx.get();
		
		
		bx.set(new Apple());
		Apple apple =(Apple) bx.get();

		
	}

}
