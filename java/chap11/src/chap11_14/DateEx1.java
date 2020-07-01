package chap11_14;
import java.util.*;
import java.text.*;
public class DateEx1 {

	public static void main(String[] args) {
		Date now = new Date();	//시스템의 현재 날짜/시간을 생성
		String str1= now.toString();
		System.out.println(now);	//숫자형태로 유지
		System.out.println(str1);	//문자형태로 치환
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");	//java.text.*을 임포트해야댐
		String str2 = sd.format(now);	//가공(포맷)해서 str2에 넣음
		
		
		System.out.println(str2);
		
		
		
		
		
		
	}

}
