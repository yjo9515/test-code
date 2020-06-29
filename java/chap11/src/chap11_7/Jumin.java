package chap11_7;

public class Jumin {

	public static void main(String[] args) {
		String jumin = "010624-3230123";
		char sex = jumin.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default :
			System.out.println("외국인");
			break;
		}

	}

}
