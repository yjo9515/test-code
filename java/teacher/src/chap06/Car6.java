package chap06;

public class Car6 { //��� Ŭ����
	//final static : final�� ���� ������� �ʰ�, static �� ������ ������ ������
	//�ν��Ͻ��� ������ �ʿ䰡 ���� ������ �ַ� final�� static�� ���ÿ� ����Ͽ� ����� ����
	static final double TIRE_PI = 3.141592;
	static final int TIRE_COUNT = 4;
	static final int TIRE_RADIUS = 250;
	static final double TIRE_AREA;
	static {
		TIRE_AREA = TIRE_PI * TIRE_RADIUS;
	}
}