package chap11_4;

import java.util.Objects;
public class HashCodeEx1 {

	public static void main(String[] args) {
		Student s1 = new Student(1004,"정하늘");
		Student s2 = new Student(5000,"김홍경");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
	}
	static class Student{
		int sno;
		String name;
		public Student(int sno, String name){
			
			this.sno = sno;
			this.name = name;
			
		}
		@Override
		public int hashCode() {
			return Objects.hash(this.sno, this.name);
			//super.hashCode();
		}
		
	}
}
