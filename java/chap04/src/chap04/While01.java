package chap04;

public class While01 {

	public static void main(String[] args) {
//		���۰�; while(���ǽ�) { ������; ���๮;} - ���ǽ��� �����ϴ� ���ȸ� ����
		int i=1; //���۰�
		int sum = 0;
		while(i<=100) { //���Ǻ�
			sum+=i; //���๮
			i++; //������
		}
		System.out.println("1���� 100������ �հ� : "+sum);
	}

}
