package chap12_7;

public class AddThread extends Thread{

	
	private long num=0;
	
	public long getNum() {
		return num;
	}
	
	public void setNum(long num) {
		this.num = num;
	}
	public void run() {
		for(int i=1;i<=1000;i+=2) {
			num+=i;
		}
		
		
	}
}
