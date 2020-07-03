package chap13;

public class CompairEx1 {

	public static void main(String[] args) {
		Pair<Integer, String> p1 =new Pair<Integer, String>(1,"정하늘");
		Pair<Integer, String> p2 =new Pair<Integer, String>(1,"정하늘");
		boolean res1 = Util2.<Integer, String>compare(p1, p2);
		if(res1) {
			System.out.println("두 개의 객체가 같습니다.");
			
		}else {
			System.out.println("두 개의 객체가 다릅니다.");
		}
		Pair<String, String> p3 = new Pair<String, String>("ksb1004","123123");
		Pair<String, String> p4 = new Pair<String, String>("yjo9515","@yjo3202");
		boolean res2 = Util2.<String, String>compare(p3,p4);
		if(res2) {
			System.out.println("입력하신 내용과 회원정보가 일치하지 않습니다.");
			
		}else {
			System.out.println("입력하신 내용과 회원정보가 일치하지 않습니다.");
		}
		
		
		
	}

	
	
	
	
}
