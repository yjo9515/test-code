package chap04;

public class If02 {

	public static void main(String[] args) {
//		if(조건식) {
//			if(내부조건식) {
//				
//			}
//		}
	int js=92;
	String hak="A";
	if(js>=90) {
		if(js>=96) {
			hak="A+";
		} else if(js>=95 && js>=91) {
			hak="AB";
		} else {
			hak="A";
		}
		
	}
	System.out.println("당신의 학점은 "+hak+"입니다");
}
	}
