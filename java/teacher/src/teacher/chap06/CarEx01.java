package chap06;

public class CarEx01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("�Ｚ�ڵ���");
		Car car3 = new Car("�����ڵ���", "�׷���");
		Car car4 = new Car("�����ڵ���", "�ҳ�Ÿ", "���");
		Car car5 = new Car("�����ڵ���", "�ҳ�Ÿ", "���", 350);
		Car car6 = new Car("�����ڵ���", "�ҳ�Ÿ", "���", 350, 120);
		car1.company = "����ڵ���";
		car1.model = "K5";
		car1.color = "RED";
		Car2 hcar1 = new Car2();
		System.out.println("���ۻ� : "+hcar1.company);
		System.out.println("�𵨸� : "+hcar1.model);
		System.out.println("���� : "+hcar1.color);
		System.out.println("�ִ�ӵ� : "+hcar1.maxSpeed);
		
		hcar1.setCompany("����ڵ���");
		hcar1.getCompany();
		hcar1.powerOn();
		System.out.println("���� �ӵ� : "+hcar1.speedUp());
		System.out.println("���� �ӵ� : "+hcar1.speedUp(60));
		System.out.println("���� �ӵ� : "+hcar1.speedDown(20));
		System.out.println("���� �ӵ� : "+hcar1.speed);
		System.out.println("���� �ӵ� : "+hcar1.breakPush());
		
		Car3 kcar2 = new Car3();  //���������� �̻��� ������ ����Ŭ������ �ν��Ͻ��� �������� ���Ѵ�.
		kcar2.speed = 100;
		kcar2.speedUp();
		
		Car3.speedUp();  //���� Ŭ������ �ν��Ͻ� ������� ������, Ŭ������ �ڿ� �״�� �����
		int speed = Car3.speed;
		Car3.speedDown();
		
		
//		Car4 obj1 = new Car4();
//		Car4 obj2 = new Car4();
		
		Car4 obj1 = Car4.getInstance();  //�̱��� Ŭ������ ���� �����޼��带 �̿��� �ϳ��� ��ü�� ����
		Car4 obj2 = Car4.getInstance();	//obj1�� obj2�� ���� ��ü�� ���� �������
		
		if(obj1 == obj2) {
			System.out.println("���� ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
		
		Car5 ins1 = new Car5("�ҳ�Ÿ", "����");
		//ins1.company = "kia";
		//ins1.model = "�׷���";
		ins1.color = "����";
		System.out.println("ȸ��� : "+ins1.company);
		System.out.println("���� : "+ins1.model);
		System.out.println("���� : "+ins1.color);
		
		System.out.println("Ÿ�̾� ������ : "+Car6.TIRE_PI);
		System.out.println("Ÿ�̾� ���� : "+Car6.TIRE_COUNT);
		System.out.println("Ÿ�̾� ���� : "+Car6.TIRE_AREA);
	}
}










