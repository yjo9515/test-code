package chap12_4;

public class User1 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
		System.out.println(calculator);
	}
	public void run() {
		calculator.setMem(100);
	}
	
	
	
}
