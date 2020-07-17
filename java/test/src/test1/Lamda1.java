package test1;

public class Lamda1	 {

	public static void main(String[] args) {
		Interface1 lamda = (String name)->{
			System.out.println(name+"입니다.");
		}; //람다식 -> 표현식이나 수식으로 줄이는 것
	
		lamda.sampleMethod("김기태");
	}

}
