
public class Casting_ex {
	public static void main(String [] args)
	{
		byte bt = 10;
		long ln = bt; // 자동형변환

		int i = (int)ln; //강제형변환 (casting)
		
		System.out.println("ln = "+ln);
		System.out.println("i ="+i);
		
		char ch = 'A';
		System.out.println("ch ="+ch+1);
		System.out.println(ch+1); //정수값이나옴>일종의 정수로 자동형변환
		
		char ch2 = 'C';
		int result = ch2 + 3;
		System.out.println("result = "+result);
		
		char ch3 = (char)result;
		System.out.println("ch3 = "+ch3);
	

	}
}
