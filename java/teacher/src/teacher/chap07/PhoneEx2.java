package chap07;

public class PhoneEx2 {
	public static void main(String[] args) {
		//Phone2 p1 = new Phone2();  
		//�߻�ȭ Ŭ������ ���������� �ν��Ͻ� ���� �ȵ�
		Phone2 p1 = null;
		SmartPhone2 sp1 = new SmartPhone2(
				"���ϴ�");
		p1 = new SmartPhone2("���ϴ�");
		sp1.powerOn();
		sp1.internetRun();
		sp1.powerOff();
	}
}