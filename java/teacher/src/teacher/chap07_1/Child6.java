package chap07_1;

public class Child6 extends Parent6 {
	private String name;
	
	public Child6() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child6(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
