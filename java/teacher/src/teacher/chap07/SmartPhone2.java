package chap07;

public class SmartPhone2 extends Phone2 {
	public SmartPhone2(String name) {
		//�߻�ȭ�� Ŭ������ ��ӹ��� ���� 
		//���� ��� �ʵ峪 �����ڸ� ����ؾ���
		super(name);
	}
	
	@Override
	public void powerOn() { 
		//�߻�ȭ �޼���� �ݵ�� �������ؾ���
		System.out.println("������ �մϴ�.");
	}
	@Override
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	//���� Ŭ������ �޼���� �ڽ� Ŭ���� ���� ������ Ÿ���� 
	//�ٸ� ���� �������̵��� �� �� ����. 
	//�޼��带 ������ؾ� ��
	//@Override
	public void power1On() { 
		//�߻�ȭ �޼���� �ݵ�� �������ؾ���
		System.out.println("������ �մϴ�.");
	}
	//@Override
	public void power1Off() {
		System.out.println("������ ���ϴ�.");
	}

	public void internetRun() {
		System.out.println("����Ʈ���� "
				+ "���ͳ��� �մϴ�.");
	}
}