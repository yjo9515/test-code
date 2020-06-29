package chap11_4;

import java.util.Objects;
import java.util.Arrays;

public class EqualsAndDeepEqualsEx1 {

	public static void main(String[] args) {
		Integer obj1 = 1000; //레퍼(객체)
		Integer obj2 = 1000;
		int obj3 = 1000;
		Integer obj4 = null;
		
		System.out.println(Objects.equals(obj1, obj2));
		System.out.println(Objects.equals(obj1, obj3));
		System.out.println(Objects.equals(obj4, null));
		System.out.println();
		
		System.out.println(Objects.deepEquals(obj1, obj2));
		System.out.println(Objects.deepEquals(obj1, obj3));
		System.out.println(Objects.deepEquals(obj4, null));
		
		Integer[] arr1 = {1,2,3};
		Integer[] arr2 = {1,2,3};
		int[] arr3 = null;
		Integer[] arr4 = null;
		
		System.out.println();
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.equals(arr1, arr3));
		System.out.println(Objects.equals(arr4, null));
		System.out.println();
		
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr3));
		System.out.println(Objects.deepEquals(arr4, null));
	}

}
