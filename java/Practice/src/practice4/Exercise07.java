package practice4;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("--------------------");
			System.out.println("선택> ");
			
//			작성 위치
		
			int value = scanner.nextInt();
			
			
			if(value == 1) {
				System.out.println("예금액>");
				balance += scanner.nextInt();
				
			}else if (value == 2) {
				System.out.println("출금액>");
				balance -= scanner.nextInt();
			}else if (value == 3) {
				System.out.println("잔고>"+balance);
				
			}else if (value == 4) {
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
			else {
				System.out.println("잘못입력하셨습니다");
			}
			
			
			
		}
		System.out.println("프로그램 종료");

	}

}
