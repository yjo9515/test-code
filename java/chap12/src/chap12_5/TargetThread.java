package chap12_5;

public class TargetThread extends Thread{
	public void run() {
		for(long i=0;i<100000000;i++) {

		}
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			
		}
		for(long i=0;i<100000000;i++) {

		}
		
		
	}
}
