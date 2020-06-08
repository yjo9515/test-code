// 변수

public class Variable_ex
{
	public static void main(String [ ] args)
{
	System.out.println("1. 정수형");
	byte bt=10; // -128~127, 변수의 초기화(변수에 어떠한 값을 넣어주는것)
	byte bt2 = 127;
	
	System.out.println("bt ="+bt);
	System.out.println("bt2 ="+bt2);
	
	short st = 1000;
	System.out.println("st ="+st); //-32,768~32,767 (char랑 크기같음)
	
	int i = 1000000;
	System.out.println("i ="+i); // -2147483628~2147483627
	
	long ln = 1000000000L; // 소문자 l을 접미사로 사용한다(long형)
	long ln2 = 3000000000L; //자바에서는 정수형의 기본형이 int(디폴트)
	
	System.out.println("ln ="+ln);
	System.out.println("### 프로그램의 끝 ###");
	
}
}
