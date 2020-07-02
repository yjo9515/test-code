package chap12_8;

public class ThreadA extends Thread {

	private WorkObject a;
	
	public ThreadA(WorkObject a) {
		this.a = a;
	}

	@Override
	public void run() {
		for(int i = 0;i<10;i+=1) {
			a.MethodA();
		}
	}
	
	
	
}
