package chap07;

public class PhoneEx1 {
	public static void main(String[] args) {
		Phone ph1 = new Phone("Mo10", "���", 100);
		HandPhone hp1 = new HandPhone("S10", "�ǹ�", 200);
		ph1.getFee1();
		hp1.getFee2();
		ph1.getter();
		hp1.getter();
	}
}