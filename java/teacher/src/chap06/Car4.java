package chap06;

public class Car4 {  //싱글톤 클래스 : 단, 하나의 객체만 만들도록 허용하는 클래스
	//정적 필드
	private static Car4 singletone = new Car4();  //내부에서 인스턴스를 생성
	//생성자
	private Car4() { }
	//정적 메서드
	static Car4 getInstance() { return singletone; }  //인스턴스 생성시 getInstance()메서드 사용
}