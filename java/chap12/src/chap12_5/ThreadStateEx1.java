package chap12_5;

public class ThreadStateEx1 {

	public static void main(String[] args) {
		StateThread statePrint = new StateThread(new TargetThread());
		statePrint.start();
	}

}
