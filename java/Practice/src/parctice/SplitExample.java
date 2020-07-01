package parctice;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디, 이름, 패스워드";
		//방법1 (split() 메소드 이용)
		
		
		String[] imfor = str.split(", ");
		
		for(String imf : imfor) {
			System.out.println(imf);
		}
		
		
		System.out.println();
		
		//방법2 (StringTokenizer 이용)
		
		StringTokenizer str2 = new StringTokenizer("아이디,이름,패스워드",",");
		while (str2.hasMoreTokens()) {
			String s =str2.nextToken();
			System.out.println(s);
		}

	}

}
