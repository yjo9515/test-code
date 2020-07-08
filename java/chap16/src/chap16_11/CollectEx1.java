package chap16_11;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

import chap16_11.Student.Sex;
public class CollectEx1 {
	public static void main(String[]args) {
		List<Student> tLst = Arrays.asList(	//배열 데이터를 Student 객체로 저장
				new Student("윤재섭",90,Student.Sex.MALE),
				new Student("김병석",85,Student.Sex.FEMALE),
				new Student("김호경",95,Student.Sex.FEMALE),
				new Student("최선호",75,Student.Sex.MALE)
			
				);
//		 남학생들만 묶어(collect) 리스트(list)로 생성하여 학생명을 출력하시오.
		List<Student > mLst = tLst.stream()
				.filter(s->s.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		mLst.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
//		여학생들만 묶어(collect) 집합(Set)으로 생성하여 학생명을 출력하시오.
		Set<Student> fLst = tLst.stream()
				.filter(s->s.getSex()==Student.Sex.FEMALE)
				.collect(Collectors.toSet());
		fLst.stream()
			.forEach(s -> System.out.println(s.getName()));
				
				
				
				
				
		
		
		
	}
}
