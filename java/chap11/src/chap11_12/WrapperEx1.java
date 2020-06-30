package chap11_12;

public class WrapperEx1 {

	public static void main(String[] args) {
		//Byte, Character, Short, Integer, Long, Float, Double, Boolean 클래스는 래퍼 클래스임
		//박싱 : 데이터값이 래퍼 클래스의 형태로 저장되는 구조 > 포장
		Integer obj1 = new Integer(100);
		Float obj2 = new Float(3.14);
		Boolean obj3 = new Boolean(true);
		
		//언박싱 : 데이터값이 래퍼 클래스가 아닌 기본형의 형태로 저장되는 구조 > 포장헤체
		int val1 = obj1.intValue();
		float val2 = obj2.floatValue();
		boolean val3 = obj3.booleanValue();
		
		System.out.println("obj1 = "+obj1);
		System.out.println("obj2 = "+obj2);
		System.out.println("obj3 = "+obj3);
		System.out.println();
		System.out.println("val1 = "+val1);
		System.out.println("val2 = "+val2);
		System.out.println("val3 = "+val3);
		
//		자동 박싱과 언박싱
		Integer obj = 100; //자동박싱
		System.out.println("obj = "+obj);
		int val = obj; //기본형에 레퍼의 값을 넣어주므로서 자동언박싱이 이루어짐
		System.out.println("val = "+val);
		int res = obj + 904;	//레퍼는 연산시에도 자동 언박싱이 이루어짐
		System.out.println("res = "+res);
		
		int val4 = Integer.parseInt("10");	//래퍼,메소드 (o), 기본형,메소드(x)
		double val5 = Double.parseDouble("3.14");
		boolean val6 =Boolean.parseBoolean("false");
		
		
		
	}

}
