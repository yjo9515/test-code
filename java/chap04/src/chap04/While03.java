package chap04;

public class While03 {

	public static void main(String[] args) {
		//do~while~�� : �ּ�1ȸ �̻� ���� ����
		//do ( ���๮; ) while(���ǽ�);
		//for(int i=1;i<0;i++) {���๮;} for(;;){} (����)
		//int i=1; while(i<0){ ���๮; i++; } while(true){} (����)
		int i=1;
		do {
			System.out.println("����"+i);
			i++;
			
		} while(i<0);

	}

}
