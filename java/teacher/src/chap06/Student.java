package chap06;

public class Student {
	String name;   //멤버 변수 = 속성
	int design;
	int ui;
	int sw;
	int pg;
	int tot;
	public Student() {  //생성자 함수 : 인스턴스 생성시 값의 대입과 생성을 하기 위한 함수 
		this.name = "아무게";
		this.design = 0;
		this.ui = 0;
		this.sw = 0;
		this.pg = 0;
	}
	public Student(String name) {
		this.name = name;
		this.design = 0;
		this.ui = 0;
		this.sw = 0;
		this.pg = 0;
	}
	public Student(String name, int design) {
		this.name = name;	
		this.design = design;
		this.ui = 0;
		this.sw = 0;
		this.pg = 0;
	}	
	public Student(String name, int design, int ui) {
		this.name = name;	
		this.design = design;
		this.ui = ui;
		this.sw = 0;
		this.pg = 0;
	}
	public Student(String name, int design, int ui, int sw) {
		this.name = name;	
		this.design = design;
		this.ui = ui;
		this.sw = sw;
		this.pg = 0;
	}
	public Student(String name, int design, int ui, int sw, int pg) {
		this.name = name;	
		this.design = design;
		this.ui = ui;
		this.sw = sw;
		this.pg = pg;
	}
	public void getTot() {
		tot = design + ui + sw + pg;
	}
	public double getAvg() {
		this.getTot();
		return (double) tot/4;
	}
}