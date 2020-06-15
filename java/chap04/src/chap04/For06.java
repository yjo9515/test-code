package chap04;

public class For06 {

	public static void main(String[] args) {
		int[] su = {60, 75, 85, 90, 80, 70, 65}; //su[7]
		int tot = 0;
		for(int i=0;i<su.length;i++) {
			if(su[i]<=0) {
				System.out.println("건너뜀");
				continue;
			} else if(su[i]>=101) {
				break;
			}
			
			
			System.out.println((i+1)+"번 점수 : "+su[i]);
			tot += su[i];
		}
		
		int k=0;
		for(int arr : su ) {
//			새로 향상된 foreach문
			k++;
			System.out.println(k+"번 점수 : "+arr);
			tot+=arr;
		}
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+(double) (tot/su.length));
		
	}

}
