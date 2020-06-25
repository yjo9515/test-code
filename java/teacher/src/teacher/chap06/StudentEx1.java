package chap06;

public class StudentEx1 {
	public static void main(String[] args) {
		//°´Ã¼(ÀÎ½ºÅÏ½º) »ý¼º
		Student st1 = new Student(); 
		st1.name = "À±Àç¼·";
		st1.design = 80;
		st1.ui = 90;
		st1.sw = 40;
		st1.pg = 85;
		st1.getTot();
		System.out.println("ÃÑÁ¡ : "+st1.tot);
		System.out.println("Æò±Õ : "+st1.getAvg());
		Student st2 = new Student("ÃÖ¹Î¼®");
		Student st3 = new Student("¹Ú¼º¿ë", 100);
		Student st4 = new Student("¹Ú»ó¹Î", 90, 80);
		Student st5 = new Student("¹éÀ¯¾È", 100, 90, 95);
		Student st6 = new Student("±èº´¼®", 85, 70, 100, 95);
		st2.getTot();
		st3.getTot();
		st4.getTot();
		st5.getTot();
		st6.getTot();
		System.out.println("ÃÑÁ¡ : "+st2.tot);
		System.out.println("Æò±Õ : "+st2.getAvg());
		System.out.println("ÃÑÁ¡ : "+st3.tot);
		System.out.println("Æò±Õ : "+st3.getAvg());
		System.out.println("ÃÑÁ¡ : "+st4.tot);
		System.out.println("Æò±Õ : "+st4.getAvg());
		System.out.println("ÃÑÁ¡ : "+st5.tot);
		System.out.println("Æò±Õ : "+st5.getAvg());
		System.out.println("ÃÑÁ¡ : "+st6.tot);
		System.out.println("Æò±Õ : "+st6.getAvg());
	}
}