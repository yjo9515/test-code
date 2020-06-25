package chap07;

public abstract class Phone2 {
	public String name;
	
	public Phone2(String name) {
		this.name = name;
	}
	
	public abstract void powerOn();
	public abstract void powerOff();
}