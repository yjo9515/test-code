package chap12_2;
import java.awt.Toolkit;
public class BeepPrintEx2 {
	public static void main(String[] args) {
		//Runnable 인터페이스를 오버라이딩한 클래스를 이용하는 방법
		Runnable bts1 = new BeepTask();
		Thread th1 = new Thread(bts1);
		
		
		
		
		//Runnable 인터페이스를 오버라이딩을 직접 구현하는방법(따로 클래스 생성 x)
		Thread th2 = new Thread(new Runnable() {
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
		});
		
		
		//람다식을 이용한 쓰레드 구현
		Thread th3 = new Thread(() ->  {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					tk.beep();
					System.out.println("삑~!");
					try {
						Thread.sleep(800);
					}catch(Exception e){
						
					}
					
					
				}
				
		});
		th1.start();
		th2.start();
		th3.start();
		//여기에 출력문 기술
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
