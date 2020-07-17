package test1;

public class Lamda3 {

	public static void main(String[] args) {
//		Interface2 lamda = (String name)->{
//			return name + "입니다.";
//		}; 
//		람다식은 매개변수의 타입이나 괄호와 리턴 생략이 가능
		
		Interface2 lamda = name-> name + "입니다.";
		
	System.out.println(lamda.sampleMethod("김기태"));	
	

	}

}
