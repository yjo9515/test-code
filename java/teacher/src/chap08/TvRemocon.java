package chap08;

public class TvRemocon implements RemoteControl {
	private int volume;
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {  //상수에 의한 값의 제한
		if(volume>RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;	
		}
		System.out.println("현재 볼륨 : "+this.volume);
	}
}