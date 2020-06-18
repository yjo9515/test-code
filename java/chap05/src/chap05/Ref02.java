package chap05;

public class Ref02 {

	public static void main(String[] args) {
		// 배열 선언
		int[] 변수명1;
		int 변수명2[];
		int[] 변수명3 = null; //참조 변수는 null값으로 초기화(생략 가능)
		int[] arr = {80, 90, 'a', 'b', 100};
		arr[4] = 85; //배열의 한 요소의 값 변경 []안의 순번 숫자는 0부터 시작([] = 인덱스)
		arr[5] = 100; 
		int[] jum; //배열선언
		jum = new int[] {80, 70, 100}; //초기값 부여
		int[] num = {1,2,3}; //선언과 동시에 초기값 부여
		int num2 = add(new int[] {10,20,30} ); //선언과 동시에 초기값 부여
			int sum = 0;
			public static int add(int[] num) { //add 함수 선언 
			for(int i=0; i<3; i++) {
				sum+=num2[i];
			}
			return sum;
		}

	}

}
