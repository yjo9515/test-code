public class DataType_ex
{
	public static void main(String args [])
	{
		System.out.println("2.실수형");
		//실수형 : float형, double형
		//float: 소수점이하 7자리까지 표현가능
		//double: 소수점이하 15~16자리까지 표현가능
		//자바에서는 실수는 무조건 double 형으로 인식한다.
		
		float ft = 2.456F;//값을 double형으로인식하기때문에 F,f를 접미사로 사용
		
		System.out.println("ft = "+ft);
		float ft2 = 333;
		System.out.println("ft2 = "+ft2);
		
		// byte<short,char<int<long<float<double
		
		double db = 12.1111;
		System.out.println("db = "+db);
		
		double db2 = 0.2333E3; // 0.2333*10^3
		System.out.println("db2 = "+db2);
		
		double db3 = 233333333333.000012;
		// 0.233333333333000012E12
		System.out.println("db3= "+db3);
		
		System.out.println("3.문자형");
		char ch = '가';
		//char:0~65535, 2byte
		//c언어에서는 1byte(ACII코드), 자바에서는 유니코드체계를 사용
		char ch2 = 'a';
		System.out.println("ch = "+ch);
		System.out.println("ch2 = "+ch2);
		char ch3 = '\u0041'; // 4*16^1+1*16^0=65 (16진수 0~9,ABCDEF) 
		System.out.println("ch3 = "+ch3);
		System.out.println(ch3+1); //66
		
		System.out.println("4. 논리형");
		
		boolean bool = true; //True(x) False(x) [소문자를 사용해야함]
		System.out.println("bool = "+bool); //0,1 참거짓 표현할 수 없다
		// 하나의 문자를 쓸땐 작은따옴표('), 문자열은 큰따옴표(")를 사용
		// + 연산자 원리 : 문자열 + 데이터타입 >> 문자열
		
		System.out.println("***참조형***");
		
		String str = "안녕하세요"; //기본형이 아니라 참조형이다
		String str1 = new String("안녕하세요");
		System.out.println(str);
		System.out.println(str1);
	}
}