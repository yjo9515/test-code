package chap06;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	Car() { //������ �Լ� �����ε� : ���� �̸��� ���� �Լ��� �޼��带 ������ ������ Ÿ���� �ٸ��� ���� �� ����Ͽ� 
			//��� �Է°��� ��� ������ ó���� �����ؾ� �ϹǷ� �̷��� ������ �Լ��� ���Ͽ� �����ϴ� ���� 
			//������ �Լ� �����ε��̶� �Ѵ�.
		this.company = "����";
		this.model = "����";
		this.color = "����";
		this.maxSpeed = 0;
		this.speed = 0;
	}
	Car(String company) {
		this.company = company;
		this.model = "����";
		this.color = "����";
		this.maxSpeed = 0;
		this.speed = 0;
	}
	Car(String company, String model) {
		this.company = company;
		this.model = model;
		this.color = "����";
		this.maxSpeed = 0;
		this.speed = 0;
	}
	Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = 0;
		this.speed = 0;
	}
	Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = speed;
		this.speed = 0;
	}
	Car(String company, String model, String color, int maxSpeed, int speed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
}