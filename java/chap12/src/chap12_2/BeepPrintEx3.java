package chap12_2;

import java.awt.Toolkit;

public class BeepPrintEx3 {

	public static void main(String[] args) {
		//Thread를 상속 받은 클래스를 이용하는 방법
		Thread th1 = new BeepThread();
				
		//Thread에 직접 생성할 수 있는 내용을 기술하는 방법
		Thread th2 = new Thread() {
			
			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					tk.beep();
					System.out.println("삑~!");
					try {
						Thread.sleep(800);
					}catch(Exception e){
						
					}	
				}	
			}
		};
		//시작!
		th1.start();
		th2.start();
		//출력문 입력
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
