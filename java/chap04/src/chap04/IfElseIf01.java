package chap04;

public class IfElseIf01 {

	public static void main(String[] args) {
		
//		if(���ǽ�1) {
//			���๮1;
//			
//		}else if(���ǽ�2) {
//			���ǽ�1�̸��������ʰ�, ���ǽ�2�� �����ɶ� �����ҹ���;
//		}
//		else if(���ǽ�3) {
//			���ǽ�1, ���ǽ�2�� �������� �ʰ�, ���ǽ�3�� �����ɶ� �����ҹ���;
//		}
//		else if(���ǽ�n) {
//			���ǽ�1,���ǽ�2..�� �������� �ʰ�, ���ǽ�n�� �����ɶ� �����ҹ���;
//		}
//		else {
//			������ ��� ������ �������� ������ ������ ����;
//		}
		
		int js = 70, js2 = 80, js3 = 85, tot=0;
		float avg=0;
		tot = js+js2+js3;
		avg =(float)tot/3;
		if(avg>=90) {
			System.out.println("����� ������ A�Դϴ�.");
		}else if(avg>=80) {
			System.out.println("����� ������ B�Դϴ�.");
		}else if(avg>=70) {
			System.out.println("����� ������ C�Դϴ�.");
		}else if(avg>=60) {
			System.out.println("����� ������ D�Դϴ�.");
			
		}else {
			System.out.println("��� : "+avg);
		}
	}

}
