package chap04;
import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		int sum=0;
//		for(�ʱⰪ; ���ǽ�; ������) {
//			�ݺ������� ����;
//		}
//		�ʱⰪ���� �����Ŀ� ���� ���� ���ϰ�, ���ǽ��� ������ ���ȸ� ����
		
		
		for(int i=1; i<100; i++) {
			sum=sum+i;
			
		}
		
		System.out.println("sum="+sum);
//		for (int i=0; i>=0; i+=2) {} => ���ѹݺ�
//		for(int i=0; i<0;i++) {} => ������ݺ�
//		for(int i=100;i>0;i--) {} => ��for��
		for(int i=1;i<=9;i++) {
			System.out.println("2 X "+i+" = "+(2*i));
			
		}

	
		int dan;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է����ּ��� [2-9] : ");
		dan = sc.nextInt();
		for(int su=1;su<=9;su++) {
			System.out.println(dan+"*"+su+"="+(dan*su));
			
		}
		
	
	}

}
