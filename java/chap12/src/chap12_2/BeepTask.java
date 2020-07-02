package chap12_2;
import java.awt.Toolkit;
public class BeepTask implements Runnable{

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

	
	
	
	
}
