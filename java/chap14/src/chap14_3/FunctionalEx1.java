package chap14_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;	//기타 데이터
import java.util.function.ToIntFunction;	//정수 데이터

public class FunctionalEx1 {
	private static List<Student1> list = Arrays.asList(
			new Student1("김기태",100,100,100),
			new Student1("박지원",50,70,80),
			new Student1("박성용",80,60,70)
			
			);
	public static void printInt(ToIntFunction<Student1> function) {
		for(Student1 std : list) {
			System.out.println(function.applyAsInt(std)+" ");
			
		}
		System.out.println();
	}
	public static void printString(Function<Student1, String> function) {
		for(Student1 std : list) {
			System.out.println(function.apply(std)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("[성명]");
		printString(t -> t.getName());
		
		System.out.println("[국어]");
		printInt(t -> t.getKor());
		
		System.out.println("[영어]");
		printInt(t -> t.getEng());
		
		System.out.println("[수학]");
		printInt(t -> t.getMat());
	}

}
