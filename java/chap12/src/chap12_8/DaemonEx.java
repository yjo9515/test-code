package chap12_8;

public class DaemonEx {

	public static void main(String[] args) {
		AutoSaveThread autoSave = new AutoSaveThread();
		autoSave.setDaemon(true);
		autoSave.start();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
			
		}
		System.out.println("메인 스레드 종료");
	}

}
