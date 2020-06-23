package chap04;

public class Sosu {

	public static void main(String[] args) {
		
		int sum=0;
		int c=0;
		
		
		
		for(int a=2; a<100; a++) { //2,3,4,5,...,100
			
//			c=0; //초기화
			for(int b=2; b<a; b++ ) {
				
				if(a%b==0) {
					
					c++;
					
				}
				
			}
			if(c==0) {
				sum+=a;
				}
			
			
			
			
			
		}
		System.out.println("합산 결과 : "+sum);
		

	}

}
