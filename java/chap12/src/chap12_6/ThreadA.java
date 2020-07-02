package chap12_6;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("작업중");
			}else {
				Thread.yield();
			}

		}
		System.out.println("A쓰레드 종료");
		
	}
	
	
}
