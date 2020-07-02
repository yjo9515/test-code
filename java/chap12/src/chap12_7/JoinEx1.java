package chap12_7;

public class JoinEx1 {

	public static void main(String[] args) {
		AddThread plusTrd = new AddThread();
		plusTrd.start();
		try {
			plusTrd.join();		//연결시켜줘야댐
		}catch(Exception e) {
			
			
		}
		System.out.println("1~1000까지 홀수의 합 : "+plusTrd.getNum());
		
		
	
		
		
		

	}

}
