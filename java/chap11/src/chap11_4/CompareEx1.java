package chap11_4;

import java.util.Objects;
import java.util.Comparator;


public class CompareEx1 {

	public static void main(String[] args) {
		
		Student s1 = new Student(10);
		Student s2 = new Student(10);
		Student s3 = new Student(30);
		
		int res1 = Objects.compare(s1, s2, new StudentComparator());
		int res2 = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(res1+" : "+res2);
	}
	static class Student {	//Objects를 상속
		int sno;
		Student(int sno){
			this.sno = sno;
			
		}
		
	}
	static class StudentComparator implements Comparator<Student>{	//Comparator를 상속
		@Override
		public int compare(Student a, Student b) {
			return Integer.compare(a.sno, b.sno);
//			if(a.sno<b.sno) {
//				return -1;
//			}else if(a.sno == b.sno) {
//				
//				return 0;
//			}else {
//				return 1;
//			}
		}
		
		
	}
}
