package chap10;

public class NumberformatExceptionExample {

	public static void main(String[] args) {
		String str1 = "500";
		String str2 = "Skyjeong";
		
		int res1 = Integer.parseInt(str1);
		int res2 = Integer.parseInt(str2);
		
		int r = res1 + res2;	//문자형이라 처리할수없다
		
		System.out.println("나눈 결과");
		
		
		
		
	}

}
