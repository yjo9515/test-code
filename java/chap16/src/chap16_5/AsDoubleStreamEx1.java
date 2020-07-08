package chap16_5;

import java.util.Arrays;
import java.util.stream.*;

public class AsDoubleStreamEx1 {

	public static void main(String[] args) {
		int[] iArr = {100, 94, 87, 92, 64, 86};
		
		IntStream iStream = Arrays.stream(iArr);
		iStream.asDoubleStream()	//실수화(실수 스트림으로 사용)
		.forEach(a -> System.out.println("실수 : "+a));
		System.out.println();
		
		iStream = Arrays.stream(iArr);
		iStream
			.boxed()	//기본형을 래퍼타입으로 변형하는 매핑
			.forEach(b -> System.out.println(b.intValue()));
		
		iStream = Arrays.stream(iArr);
		iStream
			.asLongStream()	//long으로 매핑
			.forEach(c -> System.out.println("배정도 정수타입 : "+c));
		
		
		System.out.println("이상은 매핑에 대한 내용입니다.");
	}

}
