package chap12_5;

public class StateThread extends Thread{
	private Thread targetThread;
	
	public StateThread(Thread targetThread) {
		this.targetThread = targetThread;
		
	}
	public void run() {
		while(true) {
			Thread.State st = targetThread.getState();
			System.out.println("스레드 상태 : "+st);
			if(st == Thread.State.NEW) {
				targetThread.start();
			}
			if(st == Thread.State.TERMINATED) {
				break;
				
			}
			try {
				Thread.sleep(800);
			} catch(Exception e) {
				
			}
		}
		
	}
	
	
}
