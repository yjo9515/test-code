package chap15_1;


import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("김기태");
		list.add("김홍경");
		list.add("김병석");
		list.add("윤재섭");
		list.add("백유안");
		list.add("정영주");
		list.add("이현욱");
	
		
	
		String name1 = list.get(3);
		System.out.println("인덱스가 3인 요소 : "+name1);
		list.add(3, "박성용");
		list.add("박지원");
		
		int size = list.size();
		System.out.println("총 객체수 : "+size);
		System.out.println();
		String name2 = list.get(3);
		System.out.println("인덱스가 3인 요소 객체"+name2);
		String name3 = list.get(4);
		System.out.println("인덱스가 4인 요소 객체"+name3);
		
		for(int i = 1; i<list.size(); i++) {
			System.out.println(i+"번째 : "+list.get(i));
			
			
		}
		
		list.remove(2);
		System.out.println("인덱스가 2인 데이터 : "+list.get(2));
		list.remove(3);
		list.remove("박지원");
		
		for(int i=1;i<list.size(); i++) {
			
			System.out.println(i+"번째 : "+list.get(i));
		}
		
	
		
		
	}

}
