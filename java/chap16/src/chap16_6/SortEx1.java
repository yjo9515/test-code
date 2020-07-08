package chap16_6;

import java.util.Arrays;
import java.util.stream.*;
import java.util.Comparator;
import java.util.List;

public class SortEx1 {

	public static void main(String[] args) {
		//숫자일 경우의 스트림을 이용한 정렬
		IntStream iStream = Arrays.stream(new int[] {80, 75, 100, 95, 85, 70});
		iStream
			.sorted()
			.forEach(num -> System.out.println(num));
		System.out.println();
		
		//객체 요소(Student)일 경우
		List<Student> sLst = Arrays.asList(new Student("김",90), new Student("최",80), new Student("이",40));
		sLst.stream()
			.sorted()
			.forEach(s1 -> System.out.print(s1.getName()+":"+s1.getScore()+","));
		System.out.println();
		
		//객체 요소에 대한 역순(내림차순)으로 정렬할 경우
		sLst.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s2 -> System.out.print(s2.getName()+":"+s2.getScore()+","));
		
	}

}
