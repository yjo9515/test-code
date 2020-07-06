package chap15_2;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 맵에 객체 저장
		map.put("김기태", 100);
		map.put("김찬호", 200);
		map.put("손인욱", 300);
		map.put("진재승", 400);
		
		System.out.println("총 엔트리 수 : "+map.size());
		System.out.println("\t진재승 : "+map.get("진재승"));
		System.out.println();
		
		map.remove("김찬호");	//객체 삭제
		
		//객체의 개별 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator(); //이더레이터 = 분리
		while(keyIter.hasNext()) {
			
			String key = keyIter.next();
			Integer val = map.get(key);
			System.out.println("\t"+key+" : "+val);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 엔트리 수 :"+map.size()); //객체의 수
		
		
		
	}

}
