package chap16_11;

public class Student {
//	학생명, 정수, 성별, 도시명을 입력 받아서 처리할 수 있는 클래스를 정의한다.
//	생성자와 각 맴버필드에 대한 개터를 작성하고, 성별과 도시는 열거형으로 데이터 입력을 제한할 수 있도록 함
	public enum Sex {MALE, FEMALE}
	public enum City {
		Seoul, Inchen, Kounggi, Daejeon, Chengju, Choongcheong
		
	}
	private String name;
	private int score;
	private Sex sex;
	private City city;
	public Student(String name, int score, Sex sex) {
		
		this.name = name;
		this.score = score;
		this.sex = sex;
		
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public Sex getSex() {
		return sex;
	}
	public City getCity() {
		return city;
	}
	
	
	
}
