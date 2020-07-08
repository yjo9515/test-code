package chap16_9;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.*;


public class TotalEx1 {

	public static void main(String[] args) {
		int [] arr = {10,8,9,7,11,12};

//		홀수의 개수 : count
		long count = Arrays.stream(arr)
		.filter(a->a%2==1)
		.count();
		System.out.println("홀수 : "+count);
		
//		3의 배수의 합계 : sum
		long sum = Arrays.stream(arr)
		.filter(a->a%3==0)
		.sum();
		System.out.println("3의 배수의 합계 : "+sum);
//		2의 배수의 평균 : average
		OptionalDouble average = Arrays.stream(arr)
		.filter(a->a%2==0)
		.average();
		System.out.println("2의 배수의 평균 : "+average);
		
//		2의 배수의 최대값 : max
		OptionalInt max = Arrays.stream(arr)
		.filter(a->a%2==0)
		.max();
		System.out.println("2의 배수의 최대값 : "+max);
		
//		홀수의 최소값 : min
		int min = Arrays.stream(arr)
		.filter(a->a%2==1)
		.min()
		.getAsInt();
		System.out.println("홀수의 최소값 : "+min);
		
//		짝수의 첫번째 값 : findFirst(첫 번째로 이동)
		int first = Arrays.stream(arr)
		.filter(a->a%2==0)
		.findFirst()
		.getAsInt();
		System.out.println("짝수의 첫 번째 값 : "+first);
	}

}
