package chap06;

public class Car2{
	
	String company = "기아 자동차";
	String model = "아반떼";
	String color = "흰색";
	
	Car2(){//생성자 함수 오버로딩 : 같은 이름을 가진 함수나 매소드를 변수의 개수나 타입을 다르게 여러 개 기술하여
//	어떠한 입력값이 들어오더라도 처리가 가능하게 해야하기때문	
		
		
		this.company = "없음";
		this.model = "없음";
		this.color = "흰식";
	}
	Car2(String company){
		this.company = "없음";
		this.model = "없음";
		this.color = "흰색";
	}
	Car2(String company,String model){
		this.company = "없음";
		this.model = "없음";
		this.color = "흰색";
	}
	
	public static void main(String[] args) {

		Car2 myCar = new Car2();
		
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("제작회사 : "+myCar.company+ "모델명 : "+myCar.model);
		System.out.println("제작회사 : "+myCar.company+ "모델명 : "+myCar.model+"색깔 : "+myCar.color);
		
		
		
	}
	}