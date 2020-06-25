package chap07_1;

public class Parent6 {
	public String nation;
	
	public Parent6() {
		this("¥Î«—πŒ±π");
		System.out.println("Parent() call");
	}
	
	public Parent6(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
