package chap16_3;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class StringPipelineEx1 {

	public static void main(String[] args) {
		List<Member> lst = Arrays.asList(
			new Member("김하늘",Member.FEMALE,32),
			new Member("이하늘",Member.MALE,47),
			new Member("박하늘",Member.FEMALE,21),
			new Member("정하늘",Member.MALE,52)
				);
		double femaleAvgAge = lst.stream()
				.filter(m -> m.getSex()==Member.FEMALE) //필터
				.mapToInt(Member :: getAge) //맵퍼(매핑) - 중간처리
				.average()					//집계함수 - 집계처리
				.getAsDouble();				//종단 처리
		
		System.out.println("여자 평균 나이 : "+femaleAvgAge);
				}

}
