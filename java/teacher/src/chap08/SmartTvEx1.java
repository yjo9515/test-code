package chap08;

public class SmartTvEx1 {
	RemoteControl rc1 = new SmartTv();  //�۷ι�(����) �ν��Ͻ�
	SmartTvEx1(RemoteControl rc1){	//������ �Լ�
		this.rc1 = rc1;
	}
	void methodA() {  //�ν��Ͻ� ���� �޼���
		RemoteControl rc4 = new SmartTv();
	}
	void methodB() {	//�޼��� ȣ�⿡ ���ؼ� �ν��Ͻ� ����
		this.methodA();
	}
	public static void main(String[] args) {
		RemoteControl rc2 = new SmartTv();   //����(����) �ν��Ͻ�
		Searchable rc3 = new SmartTv();	//�ڵ� ����ȯ
		SmartTv rc5 = new SmartTv();
		TvRemocon tv1;
		//tv1 = new SmartTv();  //���� ����ȯ
		if(rc2 instanceof SmartTv) {
			System.out.println("rc2�� SmartTv�� ���� ������� �ν��Ͻ��̴�.");
		}
		if(rc5 instanceof SmartTv) {
			System.out.println("rc5�� SmartTv�� ���� ������� �ν��Ͻ��̴�.");
		}
		//RemoteControl �������̽��� ���� ���� ����
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(5);
		//rc2.search("http://www.google.com");  �ش� �������̽��� search�� ����
		
		//Searchable �������̽��� ���� ���� ����
		//rc3.turnOn();	//�ش� �������̽��� turnOn�� ����
		rc3.search("http://www.naver.com");
		
		rc2.setMute(true);		//default �޼����� Ȱ�� -> �������̵��Ͽ� ��� ������
		RemoteControl.changeBattery(); //static �޼����� Ȱ��
		
		rc5.turnOn();	//RemoteControl �������̽��� ���� ���� ����
		rc5.search("http://www.daum.net"); //Searchable �������̽��� ���� ���� ����
		
		
		
	}
}