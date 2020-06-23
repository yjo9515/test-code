package chap06;

public class Car5 {	//싱글톤 클래스 : 단, 하나의 객체만 만들도록 허용하는 클래스
	//정적 필드
	private static Car5 singletone = new Car5(); // 내부에서 인스턴스를 생성
	//생성자
	private Car5() {}
	//정적 메소드
	static Car5 getInstance() { return singletone; } //인스턴스 생성시 getInstance()메소드 사용
	
	public static void main(String[] args) {
		Car5 obj1 = Car5.getInstance(); // 싱글톤 클래스는 내부 생성메소드를 이용해 하나만 객체를 생성
		Car5 obj2 = Car5.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른객체입니다.");
		}
		
		
	}

}
