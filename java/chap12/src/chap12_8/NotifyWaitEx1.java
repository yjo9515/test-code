package chap12_8;

public class NotifyWaitEx1 {

	public static void main(String[] args) {
		WorkObject wo = new WorkObject();
		
		ThreadA TA = new ThreadA(wo);
		ThreadB TB = new ThreadB(wo);
		TA.start();
		TB.start();
		
		
		
	}

}
