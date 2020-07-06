package chap15_1;
import java.util.*;
public class LinkedListEx1 {

	public static void main(String[] args) {
		List<String> lst1 = new ArrayList<String>();
		List<String> lst2 = new LinkedList<String>();
		
		long start;  
		long end;
		
		start=System.nanoTime();
		for(int i = 0; i<10000;i++) {
			lst1.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : "+(end-start)+"ns");
		
		start=System.nanoTime();
		for(int i=0;i<10000; i++) {
			lst2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : "+(end-start)+"ns");

	
	}

}
