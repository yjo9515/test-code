package chap12_6;

public class VieldEx1 {

	public static void main(String[] args) {
		// 양보하는 쓰레드 구현
		
		ThreadA trdA = new ThreadA();
		ThreadB trdB = new ThreadB();
		trdA.start();
		trdA.start();

		try {
			Thread.sleep(3000);
		} catch(Exception e) {
			trdA.work = false;
			trdB.a = true;
		}
		try {
			Thread.sleep(3000);
		} catch(Exception e) {
			trdB.a = false;
			trdA.work = true;
		}
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		
		trdA.stop = true;
		trdB.a = true;
		
	}

}
