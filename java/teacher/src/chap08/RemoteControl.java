package chap08;

public interface RemoteControl {
	//����, ������ ����
	//��� ���� : final static �����ڰ� �ʿ� ����
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻� �޼��� : ����θ� ����
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//����Ʈ �޼��� : default
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���˴ϴ�.");
		} else {
			System.out.println("������ �����˴ϴ�.");
		}
	}
	//���� �޼��� : static
	static void changeBattery() {
		System.out.println("������ ��ü~!!");
	}
}