package practice5;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max=0;
		int sum=0;
		double avg=0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수>");
				studentNum=scanner.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				
				for(int i = 0; i<scores.length;i++) {
					System.out.println("scores["+i+"]>");
					
					scores[i]+=scanner.nextInt();
						
					
				}
				
				
//				scores[0]+=scanner.nextInt();
//				System.out.println("scores[0]>"+scanner.nextInt());
//				scores[1]+=scanner.nextInt();
//				System.out.println("scores[1]>"+scanner.nextInt());
//				scores[2]+=scanner.nextInt();
//				System.out.println("scores[2]>"+scanner.nextInt());
			}else if(selectNo == 3) {
				for(int k =0; k<scores.length;k++) {
				System.out.println("scores["+k+"]: "+scores[k]);
				}
			}else if(selectNo == 4) {
				
				for(int z = 0; z<scores.length;z++) {
					if(scores[z]>max) {
						
						max+=scores[z];
					}
					
				}
				for(int d = 0; d<scores.length;d++) {
					sum+=scores[d];
					
					
				}
				avg=(double)sum/studentNum;
				System.out.println("최고 점수:"+max);
				System.out.println("평균 점수:"+avg);
				
			}else if(selectNo == 5) {
				run = false;
			}
			
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		

	}

}
