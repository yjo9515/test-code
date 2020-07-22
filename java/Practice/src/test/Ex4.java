package test;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println("\n 중첩for문");
		
		for(int i=1; i<=9; i++) {
			for(int k=2; k<=9; k++) {
				System.out.print(i+"*"+k+"="+i*k+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int jum[] = {95,80,75};
		for(int scores : jum) {	//forEach문
			System.out.println("정수 : "+scores);
		}
		System.out.println();
		
		int i=1, sum=0;
		while(i<=100) {
			
			i++;
			sum+=i;
			
		}
		System.out.println("1부터 100까지의 합 : "+sum);
		
		System.out.println("\n do~while문");
		
		int k = 8;
		do {	//최소 1번 이상 실행 보장
			System.out.println(k);
			k++;
		}while(k>10);
		
		System.out.println();
		
		int sum2=0;
		for(int z=1; z<=100; z++) {
			
			if(z%2==0) {
				
				sum2+=z;
				
			}
			
		}
		System.out.println(sum2);
		System.out.println();
		int sum3 = 0;
		for(int o=1; o<=100; o++) {
			if(o%2 !=0) {
				continue;
			}
			
			sum3+=o;
			
		}
		System.out.println(sum3);
		
		System.out.println();
		int sum4 =0;
		int t = 0;
		while(t<100) {
			
			t+=2;
			sum4+=t;
		}
		System.out.println(sum4);
	}

}
