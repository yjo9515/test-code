package chap11_7;

import java.io.UnsupportedEncodingException;

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
		
//		equals() 실습
		String strVar1 = new String("김기태");
		String strVar2 = "김기태";
		if(strVar1 == strVar2) {	//기억장소나 다른 타입의 객체로 인식하므로 다름
			System.out.println("같은 String 객체를 참조");
		}	else {
			System.out.println("다른 String 객체를 참조");
		}
		if(strVar1.equals(strVar2)) {	//값을 비교적으로 같은 것으로 인식
		System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
		
//		getBytes() 실습 - 차지하고 있는 용량 계산을 위해 바이트배열로 전환해주는 매소드
		String str = "안녕하세요";
		byte[] byte1 = str.getBytes();	//문자열을 바이트 배열로 전환
		System.out.println("byte수 : "+byte1.length);
		System.out.println("글자수 : "+str.length());
		String str1 = new String(byte1);	//바이트 배열을 문자열로 치환하여 생성
		System.out.println("byte1의 문자열 : "+byte1);
		System.out.println("str1의 문자열 : "+str1);
		try {
		byte[] byte2 = str.getBytes("EUC-KR");
		System.out.println("EUC-KR byte수 : "+byte2.length);
		byte[] byte3 = str.getBytes("UTF-8");
		System.out.println("UTF-8 byte수 : "+byte3.length);
	 }catch(UnsupportedEncodingException e) {
		 System.out.println("지원하지 않는 언어 코드입니다.");
		 e.printStackTrace();
	 }
		
		
		//indexOf() 실습
		String subject = "자바 프로그래밍";
		int loc = subject.indexOf("프로그래밍");	//"프로그래밍"의 위치를 찾아줌
		System.out.println("프로그래밍의 위치 : "+loc);
		System.out.println(subject);
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련이 없는 책이군요"); //-1이면 없는것이다
		}
		
		//length() 실습 : 글자수 [배열일때만허용]
		int len = jumin.length();
		if(len == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}	else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
		
		//	replace() 실습 : 치환
		String oldStr = "자바는 특별한 객체지향언어입니다. 자바는 API라는 라이브러리로 이루어집니다.";
		String newStr = oldStr.replace("자바", "JAVA"); //(바꿀 문장, 바꾸고싶은 문장)
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//	substring() 실습 : 두 개의 인덱스 사이에 있는 문자열을 반환
		String firstNum = jumin.substring(0,6); //인덱스가 0부터 6전까지 추출
		System.out.println(firstNum);
		String secNum = jumin.substring(7); // 7부터 끝까지 (시작값만 넣으면 끝까지 진행하여 추출)
		System.out.println(secNum);
		
		// toLowerCase(), toUpperCase() 실습 : 영문 대소문자 변경
		String str3 = "Java Programming";
		String str4 = "JAVA programming";
		System.out.println(str3.contentEquals(str4));
		String lowStr1 = str3.toLowerCase();
		String lowStr2 = str4.toLowerCase();
		System.out.println(lowStr1.equals(lowStr2));
		System.out.println(str3.equalsIgnoreCase(str4));
		String upStr1 = str3.toUpperCase();
		String upStr2 = str4.toUpperCase();
		System.out.println(lowStr1+" : "+upStr1);
		
		// trim() 실습 : 공백제거
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		System.out.println("tel1 글자수 : "+tel1.length());
		System.out.println("tel2 글자수 : "+tel2.length());
		System.out.println("tel3 글자수 : "+tel3.length());
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println("tel의 글자수 : "+tel.length());
		System.out.println("tel : "+tel);
		
		// valueOf() 실습 : 문자열로 변환
		int num = 50;
		String str5 = String.valueOf(10);
		String str6 = String.valueOf(num);
		String str7 = String.valueOf(true);
		String str8 = String.valueOf(10.15);
		System.out.println(str5+str6+str7+str8);
		
		
		
	}

}
