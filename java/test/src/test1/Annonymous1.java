package test1;

public class Annonymous1 {

	public static void main(String[] args) {
		Interface1 annony = new Interface1() {
			public void sampleMethod(String name) {
				System.out.println(name + "입니다.");
			}
		};
		annony.sampleMethod("윤준오");
	}

}
