package chap12_6;

public class ThreadB extends Thread {

	public boolean a = true;
	
	public void run() {
		while(a) {
			if(a) {
				System.out.println("작업중");
			}else {
				Thread.yield();
			}

		}
		System.out.println("A쓰레드 종료");
	}
}
