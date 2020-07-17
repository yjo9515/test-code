package test1;

public class Lamda2 {

	public static void main(String[] args) {
		Interface2 anony =	new Interface2() { 
			public String sampleMethod(String name) {
			return name+"입니다.";
				}
		}; 
	
		System.out.println(anony.sampleMethod("김기태"));

	}

}
