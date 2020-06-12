package chap04;

public class Switch01 {

	public static void main(String[] args) {
		int num = (int) (Math.random()*45)+1;
		System.out.println(num);
		if(num<=3) {
			switch(num) {
				case 1:
					System.out.println("1번~!");
					break;
				case 2:
					System.out.println("2번~!!");
					break;
				case 3:
					System.out.println("3번~!!!");
					break;
				default:
					System.out.println("작은 수가 나옴!");
					
					
			}
		}
				

	}

}
