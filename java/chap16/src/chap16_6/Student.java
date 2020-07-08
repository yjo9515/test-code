package chap16_6;

public class Student implements Comparable<Student> {
	//정렬(sort) 구현 -> compareTo 메소드 : Comparable 인터페이스에 있는 매소드로 구현시 상속받아
	//오버라이딩을 해서 사용해야함
	//학생명과 점수로 구성된 클래스이며, 정렬 구현을 위한 compareTo 매소드를 오버라이딩
	private String name;
	private int score;
	public Student(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}
	
	
}
