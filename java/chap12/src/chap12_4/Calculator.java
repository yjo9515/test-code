package chap12_4;

public class Calculator {
	private int mem;

	public int getMem() {
		return mem;
	}

	public synchronized  void setMem(int mem) { //싱크로나이즈 : 동기 (같이 실행)
		this.mem = mem;
		try {
			Thread.sleep(2000);
			System.out.println(mem+"값이 저장되어 있습니다.");
//		} catch(InterruptedException e) {
		} catch(Exception e) {
			System.out.println(Thread.currentThread().getName()+" : "+this.mem);
			
		}
	}
	
}
