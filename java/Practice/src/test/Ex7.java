package test;

public class Ex7{

	public static void main(String[] args) {
		Student1 st1 = new Student1("kim", 100, 90, 80); 	//객체(인스턴스)활용
		Student2 st2 = new Student2();
		st2.name = "lee";
		st1.kor = 70;
		st2.mat = 50;
		System.out.println("st1의 총점 : "+st1.tot);
		System.out.println("st2의 총점 : "+st2.getTot());
		
	}

}
class Student1 {
	String name;
	int kor;
	int mat;
	int eng;
	int tot;
	float avg;
	public Student1(String name, int kor, int mat, int eng) {
		
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		this.tot = kor+mat+eng;
		this.avg =(float) tot/3;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getMat() {
		return mat;
	}
	public int getEng() {
		return eng;
	}
	public int getTot() {
		return tot;
	}
	public float getAvg() {
		return avg;
	}	
	
}
class Student2{
	String name;	//맴버 필드 = 속성(Attribute)
	int kor;
	int mat;
	int eng;
	int tot;
	float avg;
	public Student2() {
		
	}	//생성자
	public String getName() {			
		return name;
	}	//메소드
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTot() {
		return this.kor+this.eng+this.mat;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public float getAvg() {
		return this.getTot()/3;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
}
