package chap08;

public class TvRemoconEx1 {
	public static void main(String[] args) {
		RemoteControl rc;  //�������̽��� Ȱ���� �ν��Ͻ� ����
		rc = new TvRemocon();  //��ӹ��� Ŭ������ ������ �Լ��� �̿��Ͽ� �ν��Ͻ� ����
		RemoteControl rc2 = new TvRemocon();
		RemoteControl rc3 = new RemoteControl() {  //�ν��Ͻ��� �͸� Ŭ������ Ȱ��
			public void turnOn() {
				System.out.println("TV�� �մϴ�.");
			}
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("�ý����� ������ ���۵Ǿ����ϴ�.");
			}
		};
	}
}