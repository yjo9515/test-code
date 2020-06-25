package chap06;

public class Student {
	String name;   //��� ���� = �Ӽ�
	int design;
	int ui;
	int sw;
	int pg;
	int tot;
	public Student() {  //������ �Լ� : �ν��Ͻ� ������ ���� ���԰� ������ �ϱ� ���� �Լ� 
		this.name = "�ƹ���";
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