package chap06;

public class StudentEx1 {
	public static void main(String[] args) {
		//��ü(�ν��Ͻ�) ����
		Student st1 = new Student(); 
		st1.name = "���缷";
		st1.design = 80;
		st1.ui = 90;
		st1.sw = 40;
		st1.pg = 85;
		st1.getTot();
		System.out.println("���� : "+st1.tot);
		System.out.println("��� : "+st1.getAvg());
		Student st2 = new Student("�ֹμ�");
		Student st3 = new Student("�ڼ���", 100);
		Student st4 = new Student("�ڻ��", 90, 80);
		Student st5 = new Student("������", 100, 90, 95);
		Student st6 = new Student("�躴��", 85, 70, 100, 95);
		st2.getTot();
		st3.getTot();
		st4.getTot();
		st5.getTot();
		st6.getTot();
		System.out.println("���� : "+st2.tot);
		System.out.println("��� : "+st2.getAvg());
		System.out.println("���� : "+st3.tot);
		System.out.println("��� : "+st3.getAvg());
		System.out.println("���� : "+st4.tot);
		System.out.println("��� : "+st4.getAvg());
		System.out.println("���� : "+st5.tot);
		System.out.println("��� : "+st5.getAvg());
		System.out.println("���� : "+st6.tot);
		System.out.println("��� : "+st6.getAvg());
	}
}