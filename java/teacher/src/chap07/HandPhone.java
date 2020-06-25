package chap07;

public class HandPhone extends Phone {
	public static final int VOICE_CALL = 200;  //��ӵ��� �����Ƿ� �缱��
	public static final int TRAFFIC = 720;
	public static final int SMS = 100;
	int useTraffic;
	int useSms;
	//��������� ����޼���� ��ӵ����� �����ڴ� ��ӵ��� ����
	HandPhone(){  //������ �����ε�
		//super();  //super : �θ� Ŭ�������� Phone() �� �����ڸ� ȣ��
		this("S10", "��", 0, 0, 0);  //�ڱ� �ڽ��� �����ڸ� ȣ��
	}
	HandPhone(String model){
		//super(model);
		this(model, "��", 0, 0, 0);
	}
	HandPhone(String model, String color){
		//super(model, color);
		this(model, color, 0, 0, 0);
	}
	HandPhone(String model, String color, int useTime){
		//super(model, color, useTime);
		this(model, color, useTime, 0, 0);
		//		super.model;  //�θ� Ŭ�������� ��� ����(�ʵ�)�� ȣ��
		//		super.color;
		//		super.useTime;
	}
	HandPhone(String model, String color, int useTime, int useTraffic){
		//super(model, color, useTime);
		this(model, color, useTime, useTraffic, 0);
		//		super.model;  //�θ� Ŭ�������� ��� ����(�ʵ�)�� ȣ��
	}
	HandPhone(String model, String color, int useTime, int useTraffic, int useSms){
		super(model, color, useTime);
		this.useTraffic = useTraffic;
		this.useSms = useSms;
	}
	void getFee2() {  
		//getFee1�� final�̹Ƿ� ��ӵ��� �ʾ� ����
		this.feeCalc();
		//super.feeCalc();
		System.out.println("����� "+this.fee+"�� �Դϴ�.");
	}
	@Override
	public void feeCalc() {  
		//�������̵� : �ڽ� Ŭ�������� �θ� Ŭ������ �޼��带 �����ؼ� ����
		if(this.useTime>VOICE_CALL) {  //�⺻ ������ȭ���� �ʰ����� �д� 10��
			this.fee+=(10000+(this.useTime-VOICE_CALL)*10);
		}
		if(this.useTraffic>TRAFFIC) { //�⺻ Ʈ���Ⱥ��� �ʰ����� MB�� 50�� 
			this.fee+=(10000+(this.useTraffic-TRAFFIC)*50);
		} else {
			this.fee+=10000;
		}
		if(this.useSms>SMS) { //�⺻ ���ں��� �ʰ��� 1�Ǵ� 10��
			this.fee+=(3000+(this.useSms-SMS)*10);
		} else {
			this.fee+=3000;
		}
	}
}