package chap11_8;

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Programming Study ");
		sb.append("Sleeping Time");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.insert(4, "7");	//추가
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '5');	//변경
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int len = sb.length();
		System.out.println("총 문자수 : "+len);
	}

}
