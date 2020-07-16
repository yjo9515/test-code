package test1;

public class ArrayListEx4 {

	public static void main(String[] args) {
		ArrayList3<String> gen1 = new ArrayList3<>();
		gen1.setObject("하이 제네릭");
		System.out.println(gen1.getObject());
		
		ArrayList3<Integer> gen2 = new ArrayList3<>();
		gen2.setObject(60);
		System.out.println(gen2.getObject());

	}

}
