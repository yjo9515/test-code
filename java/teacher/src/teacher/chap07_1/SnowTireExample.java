package chap07_1;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;  //�ڵ� ����ȯ
		
		snowTire.run();
		tire.run();
	}
}