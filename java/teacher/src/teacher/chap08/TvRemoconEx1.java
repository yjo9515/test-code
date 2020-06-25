package chap08;

public class TvRemoconEx1 {
	public static void main(String[] args) {
		RemoteControl rc;  //인터페이스를 활용한 인스턴스 선언
		rc = new TvRemocon();  //상속받은 클래스의 생성자 함수를 이용하여 인스턴스 생성
		RemoteControl rc2 = new TvRemocon();
		RemoteControl rc3 = new RemoteControl() {  //인스턴스의 익명 클래스를 활용
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("시스템의 볼륨이 동작되었습니다.");
			}
		};
	}
}