package chap08;

public interface RemoteControl {
	//변수, 생성자 없음
	//상수 선언 : final static 지시자가 필요 없음
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메서드 : 선언부만 있음
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메서드 : default
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리됩니다.");
		} else {
			System.out.println("무음이 해제됩니다.");
		}
	}
	//정적 메서드 : static
	static void changeBattery() {
		System.out.println("건전지 교체~!!");
	}
}