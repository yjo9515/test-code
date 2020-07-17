package test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List1 {
	//컬렉션 : map, list, set, stack, queue, tree, graph
	public static void main(String[] args) {
		int[] arr = {10,30,50};
		List<Integer> lst1 =new ArrayList<>();
		lst1.add(10);
		lst1.add(20);
		lst1.add(30);

		System.out.println("***************");
		System.out.println(lst1.get(0));
		System.out.println(lst1.get(1));
		System.out.println(lst1.get(2));
		lst1.remove(1);
		try {
			System.out.println(lst1.get(0));
			System.out.println(lst1.get(1));
			System.out.println(lst1.get(2));
			
		} catch(Exception e) {
			System.out.println("리스트 구조와 요청한 작업의 개수가 서로 다릅니다.");
		}
		
		lst1.add(500);
		lst1.add(200);
		for(int i=0; i<lst1.size();i++) {
			System.out.println(i+"번째 : "+lst1.get(i));
			
		}
		//반복자: Iterator -> 컬렉션에서 데이터 처리를  반복할 때 사용
		Iterator<Integer>it1 = lst1.iterator();
		while(it1.hasNext()) {
			int data = it1.next();
			System.out.println(data);
		}
		
		System.out.println();
		
		lst1.add(500);
		lst1.add(20);
		lst1.add(10);
		for(int i = 0; i<lst1.size();i++) {
			
			System.out.println(i+"번째 : "+lst1.get(i));
			
		}
		
		Set<Integer> set1 = new HashSet<Integer>(lst1); //리스트 -> 셋
		Set<Integer> set2 = new TreeSet<Integer>(lst1);
		
		Iterator<Integer> it2 = set1.iterator();
		while(it2.hasNext()) {
			int data = it2.next();
			System.out.println(data);
		}
		
		
		
	}

}
