package test;

public class EX {
	char g='a'; 		//문자형 변수(1글자만 저장)
//	byte a = -152; overflow -128~127
	int b=0;	//전역변수, 맴버변수, 기본형-정수형 
	long f=299999999;	//배정도 정수
	float c =0.00f; 	//단정도 실수형
	double d=0.000d;	//배정도 실수형
	boolean e=false;	//논리형 변수
//	final static NAME = "KIM"; //상수
	
	
	public static void main(String[] args) {
		

	}
	public void run() {	//함수 = 메소드	, 메소드오버로딩
		
		System.out.println("여기는 매개변수와 반환값이 없는 벌크함수 입니다.");
		
	}
	public void run(int x) {
		System.out.println("여기는 매개변수가 있는 함수이며, x값음 \n"+x+"입니다.");
	}
	public long run(int x , int y) {
		
		return x*y;
		
	}
public char run(long a , char b) {
		
		System.out.println(b+"="+a);
		return b;
		
	}
}
