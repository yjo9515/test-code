package chap16_5;

import java.util.Arrays;
import java.util.List;

public class MapEx1 {
	
	public static void main(String[] args) {
		
		List<Student> data1 = Arrays.asList(new Student("가",100),new Student("나",200)
				,new Student("다",300));
		data1.stream()
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));
		
		

	}

}
