package chap15_2;
import java.util.*;
public class HashSetEx1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();	//순서 x, 중복x
		set.add("가");
		set.add("나");
		set.add("다");
		
		
		int size = set.size();
		System.out.println("총 요소의 객체 수 : "+size);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			
			String ele = itr.next();
			System.out.println("\t"+ele);
		}
		set.remove("나");
		
		System.out.println("제거 후의 총 요소의 객체 수 : "+set.size());
		for(String ele : set ) {
			System.out.println("\t"+ele);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
		
		
	}

}
