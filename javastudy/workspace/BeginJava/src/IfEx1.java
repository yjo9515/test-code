
public class IfEx1 {
	
	public static void main(String[] args) {
		if(true);
		if(true) {
			System.out.println("참이다");
		}
		if(false) System.out.println("거짓이다");
		
		if(false) 
			System.out.println("참입니다!");
		else System.out.println("거짓이다!!");
	
		//다중 if문
		int jumsu = 50;
		//학점을 부여하기위한 변수 공백으로 초기화
		char hakjum = ' ';
		
		if(jumsu >= 90) hakjum = 'A';
		else if(jumsu >= 80) hakjum = 'B';
		else if(jumsu >= 70) hakjum = 'C';
		else if(jumsu >= 60) hakjum = 'D';
		else hakjum = 'F';
		
		System.out.println("당신의 학점은 "+hakjum+"입니다.");
		
		//삼항연산자를 이용해서 위에 다중 if문을 바꿔보자
		
		hakjum = (jumsu >= 90)? 'A':(jumsu >=80)?'B':'C';
		
		
	}//End of main
	

}
