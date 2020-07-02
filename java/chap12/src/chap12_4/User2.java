package chap12_4;

public class User2 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
		System.out.println(calculator);
	}
	public void run() {
		calculator.setMem(50);
	}
}
