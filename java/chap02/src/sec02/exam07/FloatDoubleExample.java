package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		//float var1 = 3.14; 컴파일에러(float타입으로 저장하려면 뒤에 f,F를 붙여야한다)
		float var2 = 3.14f;
		double var3 = 3.14;
		
		System.out.println(var2);
		System.out.println(var3);
		
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println(var4);
		System.out.println(var5);
		//결과값이 소수점 끝자리에서 반올림된다
		
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		

	}

}
