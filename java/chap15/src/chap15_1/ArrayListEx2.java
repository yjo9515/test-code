package chap15_1;

import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("김기태", "박상민", "정하늘", "윤준오");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(90, 68, 74, 82);
		for(int val : list2) {
			System.out.println(val);
			
		}
		
	}
}
