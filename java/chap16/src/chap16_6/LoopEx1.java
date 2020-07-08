package chap16_6;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class LoopEx1 {

	public static void main(String[] args) {
		//	peek() : 순호나해주는 매소드를 중찬거리만 함
		//	forEach() : 순환해주는 매소드로 최종처리만함
		
		int[] arr = {10,8,7,6,13,9,12};
		Arrays.stream(arr)
			.filter(a->a%2==0)
//			.forEach(a -> System.out.println("짝수 : "+a);	//최종처리만 가능
			.peek(a -> System.out.println("짝수 : "+a));		//중간처리만 가능
		
		
		int res = Arrays.stream(arr)
		.filter(a->a%2==0)
		.peek(a -> System.out.println("짝수 : "+a))		//중간처리만 가능
		.sum();											//집계중 합계를 구하기 떄문에
														//변수할당이필요
		System.out.println("짝수의 더한 결과"+res);
		
		
//		대조 또는 검색과 비교
		boolean t1 = Arrays.stream(arr)
				.allMatch(a -> a%2==0);					//모든 데이터가 존재하는가
		System.out.println("모든 데이터가 2의 배수인가? "+t1);
		boolean t2 = Arrays.stream(arr)
				.anyMatch(a -> a%2==0);					//하나 이상의 존재유무
		System.out.println("하나라도 2의 배수가 있는가? "+t2);
		boolean t3 = Arrays.stream(arr)
				.noneMatch(a -> a%2==0);				//개수에 상관없이 존재하는가
		System.out.println("2의 배수가 없는가? "+t3);
	}													

}
