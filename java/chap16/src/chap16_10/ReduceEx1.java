package chap16_10;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class ReduceEx1 {
	public static void main(String[] args) {
		List<Student> sLst = Arrays.asList(
				new Student("배신자",97),
				new Student("김치국",94),
				new Student("최고참",87),
				new Student("이석희",96)
				);
//		위의 리스트 구조에서 합계를 계산
		int sum1 = sLst.stream()
		.mapToInt(Student :: getScore)	
		.sum();
	
//		reduce를 활용하여 계산 람다식에 의해 합계 계산
		int sum2 = sLst.stream()
				.map(Student :: getScore)
				.reduce((a,b) -> a+b) //람다식을 설정하여 계산결과를 유도
				.get();
//		예외 발생코드의 예방을 위한 reduce를 활용하여 람다식에 의해 합계 계산
		int sum3 = sLst.stream()
				.map(Student :: getScore)
				.reduce(0, (a,b) -> a+b);
		
		System.out.println("sum1 : "+sum1 );
		System.out.println("sum2 : "+sum2 );
		System.out.println("sum3 : "+sum3);
				

	}

}
