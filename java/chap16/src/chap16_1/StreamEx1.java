package chap16_1;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.stream.*;

public class StreamEx1 {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("박상민","정하늘","박성용","박지원");
		
//		iterator : 분리자메소드
		Iterator<String> it = lst.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("성명 : "+name);
					
		}
//		Stream 이용하는 방법
		Stream<String> st = lst.stream();
		st.forEach(name -> System.out.println(name));
//		람다식을 활용하여 코딩, 내부반복자를 활용하여 병렬처리, 중간처리나 최종 처리에 유리
		
		List<Student> lst2 = Arrays.asList(
				new Student("김기태",100),
				new Student("김병석",70),
				new Student("윤재섭",80)
				
				);
		
		//Stream 이용하는 방법2 - 속성(맴버가 다수이고, 클래스를 활용해야 하는 경우)
		Stream<Student> st2 = lst2.stream();	//컬렉션으로부터 스트림을 얻기
		st2.forEach(s -> {String name = s.getName();
		int score = s.getScore();
		System.out.println(name + " : "+ score);
		});
		
		//Stream 이용하는 방법3 - 순차처리
		List<String> lst3 = Arrays.asList("김홍경","최성호","서지원","박성용");
		Stream<String> st3 = lst3.stream();
		st3.forEach(StreamEx1 :: print);
		
		//병렬처리
		System.out.println("\n 병렬처리 구조");
		Stream<String> st4 = lst3.parallelStream();	//컬렉션으로부터 병렬처리 스트림으로 얻기
		st4.forEach(StreamEx1 :: print);	
		System.out.println();
		
		//중간처리와 최종처리의 개념
		double avg = lst2.parallelStream()
				.mapToInt(Student :: getScore)	//중간처리(매핑)
				.average()						//중간처리(평균)
				.getAsDouble();					//최종처리(실수화)
		
		System.out.println("평균 : "+avg);
	}
	public static void print(String str) {
		System.out.println(str+"은(는) 복습을 하고 있니?");
	}
	
}
