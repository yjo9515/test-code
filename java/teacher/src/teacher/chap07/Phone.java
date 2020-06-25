package chap07;

public class Phone {
	public static final int VOICE_CALL = 300; // 상수는 상속되지 않음
	String model; // 멤버 변수(필드)
	String color;
	int useTime; // 400
	long fee = 0;

	Phone() { // 생성자 오버로딩
		this("sm2", "블랙", 0);
	}

	Phone(String model) {
		this(model, "블랙", 0);
	}

	Phone(String model, String color) {
		this(model, color, 0);
	}

	Phone(String model, String color, int useTime) {
		this.model = model;
		this.color = color;
		this.useTime = useTime;
	}
	final void getFee1() {  
		//final 상속을 하지 않는다.
		this.feeCalc();
		System.out.println("요금은 "+this.fee+"원 입니다.");
	}
	protected void getter() { 
		//자식 클래스에게만 접근이 허용
		System.out.println("현재 사용이 가능한 상태입니다.");
	}
	public void feeCalc() {
		// 기본시간 300분외의 초과된 시간의 분당 요금 20원
		if (this.useTime > VOICE_CALL) {
			this.fee = 12000 + (this.useTime - VOICE_CALL) * 20;
		} else {
			this.fee = 12000;
		}
	}
}