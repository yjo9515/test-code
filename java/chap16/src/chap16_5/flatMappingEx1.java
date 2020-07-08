package chap16_5;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class flatMappingEx1 {
	static int sum = 0;
	public static void main(String[] args) {
		List<String> data1 = Arrays.asList("java web","class interface","extends implements override");
		data1.stream()
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		
		List<String> data2 = Arrays.asList("100, 200, 300","200, 250, 300");
		data2.stream()
			.flatMapToInt(data -> {
				String[] sArr = data.split(",");
				int[] iArr = new int[sArr.length];
				for(int i =0; i<sArr.length; i++) {
					iArr[i] = Integer.parseInt(sArr[i].trim());
				}
				return Arrays.stream(iArr);
			})
//			.forEach(number -> System.out.println(number));
			
			.forEach(a -> sum+=a);
			System.out.println("총합 : "+sum);
			
			

	}

}
