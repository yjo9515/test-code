package chap04;
import java.io.*;
public class While02 {

	public static void main(String[] args) throws IOException {
		// 키보드 1을 누르면 속도를 가속하고, 2를 누르면 속도를 감속하며, 3을 누르면 중지
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		while(run) {
			//메뉴 출력
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("=====================================");
				System.out.println("| 1. 가속 | 2. 감속 | 3. 중지 |");
				System.out.println("=====================================");
				System.out.println("선택 [1-3] : ");
			}
			keyCode = System.in.read(); // 키보드로 입력된 데이터를 읽어옴
			if(keyCode == 49) {	//1이 입력되었을경우
				speed+=5;
				System.out.println("현재속도 : "+speed);
				
			}else if(keyCode == 50) {	//2가 입력되었을경우
				speed-=5;
				System.out.println("현재 속도 : "+speed);
				
			}else if(keyCode == 51) {	//3을 입력했을경우
				speed =0;
				System.out.println("정지 : "+speed);
			}else {
				System.out.println("입력 에러 : [1-3] 입력요망");
			}
		}
		System.out.println("속도 프로그램 종료");	

		}
		
			
		

	}


