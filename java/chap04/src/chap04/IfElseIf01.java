package chap04;

public class IfElseIf01 {

	public static void main(String[] args) {
		
//		if(조건식1) {
//			실행문1;
//			
//		}else if(조건식2) {
//			조건식1이만족하지않고, 조건식2가 만족될때 실행할문장;
//		}
//		else if(조건식3) {
//			조건식1, 조건식2가 만족하지 않고, 조건식3이 만족될때 실행할문장;
//		}
//		else if(조건식n) {
//			조건식1,조건식2..가 만족하지 않고, 조건식n이 만족될때 실행할문장;
//		}
//		else {
//			선행의 모든 조건이 만족되지 않을때 실행할 문장;
//		}
		
		int js = 70, js2 = 80, js3 = 85, tot=0;
		float avg=0;
		tot = js+js2+js3;
		avg =(float)tot/3;
		if(avg>=90) {
			System.out.println("당신의 학점은 A입니다.");
		}else if(avg>=80) {
			System.out.println("당신의 학점은 B입니다.");
		}else if(avg>=70) {
			System.out.println("당신의 학점은 C입니다.");
		}else if(avg>=60) {
			System.out.println("당신의 학점은 D입니다.");
			
		}else {
			System.out.println("평균 : "+avg);
		}
	}

}
