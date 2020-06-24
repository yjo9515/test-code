package chap07;

public class Phone {
	public static final int VOICE_CALL = 300; //상수
	String model; //맴버 변수 (필드)
	String color;
	int useTime; //300
	long fee= 0;
	
	
	
	Phone(){	//생성자 오버로딩
		this("S10","블랙",0);
		
	}
	Phone(String model){
		this(model, "블랙",0);
		
	}
	Phone(String model, String color){
		this(model, color, 0);
	}
	Phone(String model, String color, int useTime){
		this.model = model;
		this.color = color;
		this.useTime = useTime;
		
	}
	final void getFee1() {	//final은 상속을 하지 않는다.
		this.feeCalc();
		System.out.println("요금은 "+this.fee);
		
		
	}
	protected void getter() { //자식 클래스에게만 접근이 허용
		System.out.println("현재 사용하는 금액");
	}
	
	public void feeCalc() {
		//기본시간 300분외의 초과된 시간의 분당 요금 20원
		if(this.useTime>VOICE_CALL) {
			this.fee = 12000+(this.useTime-VOICE_CALL)*20;
			
		}else {
			this.fee = 12000;
		}
		
	}
	
	
	
	
	
	public static void main(String [] args) {
		
		
		Phone ph1 = new Phone("Mo10","골드",100);
		HandPhone hp1 = new HandPhone("S10","블랙",100);
		
		ph1.model = "S10";
		hp1.model = "11";
		ph1.getFee1();
		hp1.getFee2();
		ph1.getter();
		hp1.getter();
		
		
		
		
	}
}
