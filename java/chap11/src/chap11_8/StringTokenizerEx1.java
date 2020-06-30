package chap11_8;

import java.util.StringTokenizer;
public class StringTokenizerEx1 {

	public static void main(String[] args) {
		// split() 실습 : 문자열을 분리하여 배열형태로 변환
		String text1 = "백유안&최민석,이현욱,정영주-박지원";
		String[] names = text1.split("&|,|-|_");
		for(String name : names) {
			System.out.println(name);
			
		}
		
		String text2 = "윤재섭/정하늘/윤준오";	//옛날방식, 성능이 더 좋음
		StringTokenizer st = new StringTokenizer(text2, "/");
		int cnt = st.countTokens();
		System.out.println();
		for(int i = 0; i<cnt; i++) {
			String token = st.nextToken();
			System.out.println(token);
			
		}
	}

}
