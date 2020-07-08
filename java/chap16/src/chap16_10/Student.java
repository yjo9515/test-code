package chap16_10;

public class Student {
	//학생명과 점수를 입력받는 생성자와 값을 가져오는 게터를 정의
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
	
	
	
	
}
