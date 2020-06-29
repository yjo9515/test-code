package chap11_5;

public class SystemTimeEx1 {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		int sum = 0;
		for(int i=1; i<1000000;i+=2) {
			
			sum+=i;
			
		}
		
		
		long time2 = System.nanoTime();
		System.out.println("1~1000000까지의 홀수의 합 : "+sum);
		System.out.println("계산에 "+(time2-time1)+"나노초가 걸렸습니다.");
	}

}
