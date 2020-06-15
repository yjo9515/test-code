package chap04;

public class While01 {

	public static void main(String[] args) {
//		시작값; while(조건식) { 증감식; 실행문;} - 조건식이 만족하는 동안만 실행
		int i=1; //시작값
		int sum = 0;
		while(i<=100) { //조건비교
			sum+=i; //실행문
			i++; //증감식
		}
		System.out.println("1부터 100까지의 합계 : "+sum);
	}

}
