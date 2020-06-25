package chap08;

public class SmartTv implements RemoteControl, Searchable {
	private int volume;
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	public void setVolume(int volume) {  //����� ���� ���� ����
		if(volume>RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;	
		}
		System.out.println("���� ���� : "+this.volume);
	}
	public void search(String url) {
		System.out.println("�ּҰ� "+url+"�� �������� �˻��մϴ�.");
	}
}