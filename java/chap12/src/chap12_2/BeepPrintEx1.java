package chap12_2;

import java.awt.Toolkit;

public class BeepPrintEx1 {

	public static void main(String[] args) {
		// Beep음 출력
		Toolkit tk1=Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {	//소리출력
			tk1.beep();
			try {
				Thread.sleep(500);	//쓰레드 실행 추가
			}	catch(Exception e) {
				
			}
		}
		for(int i=0;i<5;i++) {	//문자 출력 작업
			System.out.println("빽~");
			try {
				Thread.sleep(500);
			}
			catch(Exception e){
				
			}
		}
	}

}
