package chap05;

public class Ref01 {

	public static void main(String[] args) {
//		기본 변수 : 독립형 저장소 - null값을 허용하지 않으므로 초기화 반드시 필요
		int age1 =32, age2=10 , age3=10, age4;
		double price1 = 3000, price2, price3;
		
//		참조 변수  : 객체형 저장소 - null값을 허용하므로 초기화가 필요하지만 생략 가능
		String name1 = "윤준오"; //참조 변수
		String name2="윤",name3="윤";
		
		if(age2==age3) {System.out.println("age2=age3");}
		if(name2==name3) {System.out.println("name2=name3");}
		
//		객체타입 인스턴스명 = new 객체생성자함수 ();
		String n1 = new String("윤준오");
		String n2 = new String("윤준오");
		if(n1==n2) {System.out.println("서로 같다");}
		if(n1!=n2) {System.out.println("서로 같지 않다");}
// 		기본 변수는 값이 같으면 같은 것으로 인식
//		참조 변수는 값이 같아도 다른 것으로 인식		
		boolean res = n1.equals(n2);	//참조 변수의 값 비교 >> 객체명1.equals(객체명2)를 사용
		if(res) {System.out.println("n1=n2");}
	}

}
