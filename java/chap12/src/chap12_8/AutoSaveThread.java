package chap12_8;

public class AutoSaveThread extends Thread{
	public void save() {
		//실제 저장할 수 있는 프로그램명
		System.out.println("작업 내용을 저장합니다.");
		
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				break;
			}
			save();
			
		}
	}

	
}
