package chap12_8;

public class WorkObject {

	public synchronized void MethodA() {
		System.out.println("ThreadA의 MethodA()가 실행중");
		notify();
		try {
			wait();
		}catch(Exception e) {
			
			
		}
		
	}
	public synchronized void MethodB() {
		System.out.println("ThreadB의 MethodB()가 실행중");
		notify();
		try {
			wait();
		}catch(Exception e) {
			
			
		}		

	}
}

