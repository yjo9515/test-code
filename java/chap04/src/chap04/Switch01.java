package chap04;

public class Switch01 {

	public static void main(String[] args) {
		int num = (int) (Math.random()*45)+1;
		System.out.println(num);
		if(num<=3) {
			switch(num) {
				case 1:
					System.out.println("1��~!");
					break;
				case 2:
					System.out.println("2��~!!");
					break;
				case 3:
					System.out.println("3��~!!!");
					break;
				default:
					System.out.println("���� ���� ����!");
					
					
			}
		}
				

	}

}
