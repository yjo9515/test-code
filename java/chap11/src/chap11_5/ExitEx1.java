package chap11_5;

public class ExitEx1 {
	
	public static void main(String[] args) {
		
		//System.exit(0); 곧바로 종료
		System.setSecurityManager(new SecurityManager() {	//정적으로 추상화된 SecurityManager 재정으로
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});
		for(int i=0; i<10;i++) {
			System.out.println(i);
			try 
			{
				System.exit(1); 	//JVM 종료 요청
			} catch(SecurityException e) {
				
			}
		}

	}

}
