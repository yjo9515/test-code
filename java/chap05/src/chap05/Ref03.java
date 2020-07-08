package chap05;

public class Ref03 {

	public static void main(String[] args) {
		
		//Array 를 이용한 for문
		int[] arr1 = { 10, 20, 30};
		int[] arr2 = new int[5];
		int[] arr3 = new int[7];
		for(int i=0;1<arr1.length;i++) { //for문을 이용한 배열객체의 값 복사
			arr2[i] = arr1[i];
			
		}
		for(int i=0;i<arr2.length; i++) {//배열의 for문 사용
			System.out.println("arr2의 "+i+"번째 값 : " +arr2[i]);
		}
		//arraycopy함수에 의한 배열객체의 값 복사
		//System.arraycopy(원본객체명, 원본시작주소, 복사본객체명, 복사본시작주소, 복사개수);
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		int n=0;
		for(int su : arr3) {//향상된 for문(foreach문)
		System.out.println("arr3의 "+n+"번째 값 : "+su);
			n++;
		
			
		
		}
		}
	}


