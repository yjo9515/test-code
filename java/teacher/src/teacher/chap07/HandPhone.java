package chap07;

public class HandPhone extends Phone {
	public static final int VOICE_CALL = 200;  //상속되지 않으므로 재선언
	public static final int TRAFFIC = 720;
	public static final int SMS = 100;
	int useTraffic;
	int useSms;
	//멤버변수와 멤버메서드는 상속되지만 생성자는 상속되지 않음
	HandPhone(){  //생성자 오버로딩
		//super();  //super : 부모 클래스에서 Phone() 의 생성자를 호출
		this("S10", "블랙", 0, 0, 0);  //자기 자신의 생성자를 호출
	}
	HandPhone(String model){
		//super(model);
		this(model, "블랙", 0, 0, 0);
	}
	HandPhone(String model, String color){
		//super(model, color);
		this(model, color, 0, 0, 0);
	}
	HandPhone(String model, String color, int useTime){
		//super(model, color, useTime);
		this(model, color, useTime, 0, 0);
		//		super.model;  //부모 클래스에서 멤버 변수(필드)를 호출
		//		super.color;
		//		super.useTime;
	}
	HandPhone(String model, String color, int useTime, int useTraffic){
		//super(model, color, useTime);
		this(model, color, useTime, useTraffic, 0);
		//		super.model;  //부모 클래스에서 멤버 변수(필드)를 호출
	}
	HandPhone(String model, String color, int useTime, int useTraffic, int useSms){
		super(model, color, useTime);
		this.useTraffic = useTraffic;
		this.useSms = useSms;
	}
	void getFee2() {  
		//getFee1은 final이므로 상속되지 않아 재기술
		this.feeCalc();
		//super.feeCalc();
		System.out.println("요금은 "+this.fee+"원 입니다.");
	}
	@Override
	public void feeCalc() {  
		//오버라이딩 : 자식 클래스에서 부모 클래스의 메서드를 변형해서 정의
		if(this.useTime>VOICE_CALL) {  //기본 음성통화보다 초과분은 분당 10원
			this.fee+=(10000+(this.useTime-VOICE_CALL)*10);
		}
		if(this.useTraffic>TRAFFIC) { //기본 트래픽보다 초과분은 MB당 50원 
			this.fee+=(10000+(this.useTraffic-TRAFFIC)*50);
		} else {
			this.fee+=10000;
		}
		if(this.useSms>SMS) { //기본 문자보다 초과분 1건당 10원
			this.fee+=(3000+(this.useSms-SMS)*10);
		} else {
			this.fee+=3000;
		}
	}
}