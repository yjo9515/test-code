package parctice;

public class Printer {
	
	static void println(int a,boolean b,double c, String d){
		
		System.out.println("10");
		System.out.println("true");
		System.out.println("5.7");
		System.out.println("홍길동");
		
		
	}
	

	public static void main(String[] args) {
	
		Printer printer = new Printer();
		printer.println(10, true, 5.7, "홍길동" );
	;

	}

}
