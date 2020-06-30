package chap11_11;
import java.util.Arrays;
public class ArraysEx1 {

	public static void main(String[] args) {
//		배열 복사
		char[] arr1 = {'j','A','V','A'};
		// 방법1 : arraycopy() 활용
		char[] arr2 = new char[arr1.length]; //배열 선언
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for(int i = 0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		
		char[] arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr3));
		
		char[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr4));
		
//		equals(), deepEquals() 비교
		int[][] ori = {{1,2},{3,4}};
//		얕은 복사
		int[][] clone1 = Arrays.copyOf(ori, ori.length);
		System.out.println("배열 주소 비교 : "+ori.equals(clone1));	//주소 비교
		System.out.println("1차원 배열만 비교 :"+Arrays.equals(ori, clone1));	//첫번째 1차원 배열의 값 비교
		System.out.println("전체 교차 비교 : "+Arrays.deepEquals(ori, clone1));	//전체 교차비교
		
//		깊은 복사
		int[][] clone2 = Arrays.copyOf(ori, ori.length);
		clone2[0] = Arrays.copyOf(ori[0], ori[0].length);
		clone2[1] = Arrays.copyOf(ori[1], ori[1].length);
		System.out.println("배열 주소 비교 : "+ori.equals(clone2));
		System.out.println("1차원 배열만 비교 : "+Arrays.equals(ori, clone2));
		System.out.println("전체 교차 비교 : "+Arrays.deepEquals(ori, clone2));
		
//		순서 정렬(sort : 순서재배치)
		int idx;
		int key1=70;
		int[] jum = {80, 70, 75};
		
		
		
		idx = Arrays.binarySearch(jum, 70); //배열요소의 위치를 선택
		System.out.println("정렬전");
		System.out.println("key1의 인덱스 : "+idx);
		for(int i = 0; i<jum.length; i++) {
			
			System.out.println("jum["+i+"]="+jum[i]);
			
		}
		Arrays.sort(jum);
		System.out.println("정렬후");
		for(int i = 0; i<jum.length; i++) {
			
			System.out.println("jum["+i+"]="+jum[i]);
			
		}
		System.out.println();
		Arrays.sort(jum);
		
		String key2 = "이수아";
		String[] name = {"김병석","육현석","박상민","이수아"};
		System.out.println("정렬전");
		for(int i =0;i<name.length;i++) {
			
			System.out.println("name["+i+"]="+name[i]);
			
		}
		Arrays.sort(name);
		System.out.println("정렬후");
		for(int i=0;i<name.length;i++) {
			System.out.println("name["+i+"]="+name[i]);
		}
		
		Member m1 = new Member("박성용");
		Member m2 = new Member("서지원");
		Member m3 = new Member("최성호");
		Member m4 = new Member("김홍경");
		Member[] mem = {m1, m2, m3, m4};
		System.out.println("정렬전");
		for(int i=0;i<mem.length;i++) {
			System.out.println("mem["+i+"].name="+mem[i].name);
		}
		Arrays.sort(mem);
		System.out.println("정렬후");
		for(int i=0;i<mem.length;i++) {
			System.out.println("mem["+i+"].name="+mem[i].name);
		}
	}
	
	

}

class Member implements Comparable<Member>{
	
	String name;
	Member(String name){
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
	
	
}
