package chap08;

public class SmartTvEx1 {
	
	
	RemoteControl rc1 = new SmartTv(); //글로벌 인스턴스
	SmartTvEx1(RemoteControl rc1){
		this.rc1 = rc1;
		}
	void methodA() {	//인스턴스 생성 메소드
		RemoteControl rc4 = new SmartTv();
	}
	void methodB() {	//메소드 호풀에 의해서 인스턴스 생성
		this.methodA();
	}

	public static void main(String[] args) {
		RemoteControl rc2 = new SmartTv(); //로컬(지역) 인스턴스
		Searchable rc3 = new SmartTv();
		SmartTv rc5 = new SmartTv();
		TvRemocon tv1;
		//tv1 = new SmartTv(); //강제 형변환
		if(rc2 instanceof SmartTv) {
			System.out.println("rc2는 SmartTv로 부터 만들어진 인스턴스이다.");
		}
		if(rc5 instanceof SmartTv) {
			System.out.println("rc5는 SmartTv로 부터 만들어진 인스턴스이다.");
			
		}
		
		//RemoteControl 인터페이스의 설계 내용 실행 
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(5);
		
//		Searchable 인터페이스의 설계 내용 실행
//		rc2.search("http://www.naver.com"); 해당 인터페이스에 search가없음
		rc3.search("http://www.naver.com");
		
		rc2.setMute(true);	//default 매소드의 활용 > 오버라이딩하여 사용 가능하게함
		RemoteControl.changeBattery(); //static 매소드의 활용
		
		rc5.turnOn(); //RemoteControl 인터페이스의 설계 내용 실행
		rc5.search("http://www.daum.net"); //Searchable 인터페이스의 설계 내용실행
	}

}
