package chap14_2;

public class UsingThis {
	//this 사용법
	public int outField = 100;
	class Inner{
		int inField = 200;
		void method() {
			MyFnc1 fmi1 = () -> {
				System.out.println("외부 필드 : "+outField);
				System.out.println("외부 필드 : "+UsingThis.this.outField );	//외부는 맨 앞에 클래스명이 필요
				System.out.println();
				System.out.println("내부 필드 :"+inField);
				System.out.println("내부 필드 : "+this.inField);
				//내부는 맨 앞에 this.맴버필드명
			};
			fmi1.method();
			
			
		}
	}
	
}
