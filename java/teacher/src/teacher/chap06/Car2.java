package chap06;

public class Car2 {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	int speed;
	Car2(){
		this("�׷���", "����", 400);
	}
	Car2(String model){
		this(model, "����", 400);
	}
	Car2(String model, String color){
		this(model, color, 400);
	}
	Car2(String model, String color, int maxSpeed){  //<-��� this�� �̿��Ͽ� ����
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public void setCompany(String company) {
		this.company = company;
		System.out.println("���ο� ���ۻ簡 �߰��Ǿ����ϴ�.");
	}
	public void getCompany() {
		System.out.println("���ۻ� : "+this.company);
	}
	public void powerOn() {
		System.out.println("�õ��� �������ϴ�.");
		this.speed = 0;
	}
	public void powerOff() {
		System.out.println("�õ��� �������ϴ�.");
		this.speed = 0;
	}
	public int speedUp() {  //�޼��� �����ε�
		return this.speed+=10;
	}
	public int speedUp(int speed) {
		this.speed+=speed;
		return this.speed;
	}
	public void speedDown() {  //���ϰ��� �����Ƿ�  �ν��Ͻ���.speed�� ���
		this.speed-=10;
	}
	public int speedDown(int speed) {
		this.speed-=speed;
		return this.speed;
	}
	public int breakPush() {
		this.speed = 0;
		return this.speed;
	}
}













