package chap04;

public class While03 {

	public static void main(String[] args) {
		//do~while~문 : 최소1회 이상 실행 보장
		//do ( 실행문; ) while(조건식);
		//for(int i=1;i<0;i++) {실행문;} for(;;){} (무한)
		//int i=1; while(i<0){ 실행문; i++; } while(true){} (무한)
		int i=1;
		do {
			System.out.println("실행"+i);
			i++;
		} while(i<0);

	}

}
