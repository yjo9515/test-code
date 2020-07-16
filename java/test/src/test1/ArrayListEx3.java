package test1;

public class ArrayListEx3 {

	public static void main(String[]args) {
		ArrayList2<String> lst = new ArrayList2<>();
		lst.add("50");
		lst.add("100");
		lst.add("150");
	
		int val1 = Integer.valueOf(lst.get(0)); //문자열의 ""을 없애서 숫자로 변경
		int val2 = Integer.valueOf(lst.get(1)); 
		int val3 = Integer.valueOf(lst.get(2));
		
		System.out.println(val1+" : "+val2+" : "+val3);
		
		
	}
}
