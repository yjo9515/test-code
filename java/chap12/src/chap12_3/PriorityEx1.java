package chap12_3;

public class PriorityEx1 {

	public static void main(String[] args) {
		for(int i =1;i<=10;i++) {
			Thread th = new CalThread("Thread"+i);
			if(i != 10) {	//우선순위 부여하면 선점형이 됨
				th.setPriority(th.MIN_PRIORITY);
			}else {
				th.setPriority(th.MAX_PRIORITY);
			}
			th.start();
		}

	}

}
