package chap04;
import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		int sum=0;
//		for(초기값; 조건식; 증감식) {
//			반복실행할 문장;
//		}
//		초기값부터 증감식에 따라 값이 변하고, 조건식이 만족할 동안만 실행
		
		
		for(int i=1; i<100; i++) {
			sum=sum+i;
			
		}
		
		System.out.println("sum="+sum);
//		for (int i=0; i>=0; i+=2) {} => 무한반복
//		for(int i=0; i<0;i++) {} => 무실행반복
//		for(int i=100;i>0;i--) {} => 역for문
		for(int i=1;i<=9;i++) {
			System.out.println("2 X "+i+" = "+(2*i));
			
		}

	
		int dan;
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요 [2-9] : ");
		dan = sc.nextInt();
		for(int su=1;su<=9;su++) {
			System.out.println(dan+"*"+su+"="+(dan*su));
			
		}
		
	
	}

}
