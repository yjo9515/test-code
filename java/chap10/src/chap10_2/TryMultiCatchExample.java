package chap10_2;

public class TryMultiCatchExample {

	public static void main(String[] args) {
		String str1 = null;
		String str2 = null;
		
		int val1, val2;
		try {
			str1 = args[0];
			str2 = args[1];
			val1 = Integer.parseInt(str1);
			val2 = Integer.parseInt(str2);
			int res = val1 / val2;
			System.out.println("결과 : "+res);
		} catch(ArrayIndexOutOfBoundsException e){	//1차 예외처리 조건구문
			System.out.println("실행 매개 값이 부족합니다.");
		} catch(NumberFormatException e) {	//2차 예외처리 조건구문
			System.out.println("숫자로 변환이 불가합니다.");
		} catch(Exception e) {	//3차 예외처리 조건구문
			System.out.println("원인을 알 수 없는 예외가 발생하였습니다");
		} finally {	//최종 필수 처리 구문
			System.out.println("예외가 처리되었습니다.");
		}

	}

}
