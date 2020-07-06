package chap14_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx1 {
	private static List<Student2> list = Arrays.asList(
			new Student2("김기태", 100, "남자"),
			new Student2("최성호", 0,"남자"),
			new Student2("이수아",80,"여자"),
			new Student2("서지원",100,"남자")
			);
	public static double avg(Predicate<Student2> predicate) {
		int count = 0, sum= 0;
		for(Student2 std2 : list) {
			if(predicate.test(std2)) {
				count++;
				sum+=std2.getScore();	//합계
			}
		}
		return (double) sum / count;
		
		
	}
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자의 평균 : "+maleAvg);
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자의 평균 : "+femaleAvg);
				

	}

}
