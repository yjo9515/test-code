package chap07;

public class Phone {
	public static final int VOICE_CALL = 300; // ����� ��ӵ��� ����
	String model; // ��� ����(�ʵ�)
	String color;
	int useTime; // 400
	long fee = 0;

	Phone() { // ������ �����ε�
		this("sm2", "��", 0);
	}

	Phone(String model) {
		this(model, "��", 0);
	}

	Phone(String model, String color) {
		this(model, color, 0);
	}

	Phone(String model, String color, int useTime) {
		this.model = model;
		this.color = color;
		this.useTime = useTime;
	}
	final void getFee1() {  
		//final ����� ���� �ʴ´�.
		this.feeCalc();
		System.out.println("����� "+this.fee+"�� �Դϴ�.");
	}
	protected void getter() { 
		//�ڽ� Ŭ�������Ը� ������ ���
		System.out.println("���� ����� ������ �����Դϴ�.");
	}
	public void feeCalc() {
		// �⺻�ð� 300�п��� �ʰ��� �ð��� �д� ��� 20��
		if (this.useTime > VOICE_CALL) {
			this.fee = 12000 + (this.useTime - VOICE_CALL) * 20;
		} else {
			this.fee = 12000;
		}
	}
}