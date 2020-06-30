package chap11_8;
import java.util.regex.Pattern;
public class PatternEx {

	public static void main(String[] args) {
//		(02|031|032|010)-\\d{3,4}-\\d(4)
//		\\w+@\\w+\\.+(\\.\\w+)? : 이메일 주소 형식
//		\\w+\\.+\\w+(\\.\\w+)\\.\\w+
		String regExp = "(02|031|032|010)-\\d{3,4}-\\d(4)";
		String data1 = "010-3048-1004";
		boolean res1 = Pattern.matches(regExp, data1);
		if(res1) {
			System.out.println("전화번호 형식이 맞습니다.");
		}else {
			System.out.println("전화번호 형식이 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.+(\\.\\w+)?";
		String data2 = "ksb450424@naver.com";
		boolean res2 = Pattern.matches(regExp, data2);
		if(res2) {
			System.out.println("이메일주소 형식이 맞습니다.");
		}else {
			System.out.println("이메일주소 형식이 아닙니다.");
		}
	}

}
