package chap04;
import java.io.*;
public class While02 {

	public static void main(String[] args) throws IOException {
		// Ű���� 1�� ������ �ӵ��� �����ϰ�, 2�� ������ �ӵ��� �����ϸ�, 3�� ������ ����
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		while(run) {
			//�޴� ���
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("=====================================");
				System.out.println("| 1. ���� | 2. ���� | 3. ���� |");
				System.out.println("=====================================");
				System.out.println("���� [1-3] : ");
			}
			keyCode = System.in.read(); // Ű����� �Էµ� �����͸� �о��
			if(keyCode == 49) {	//1�� �ԷµǾ������
				speed+=5;
				System.out.println("����ӵ� : "+speed);
				
			}else if(keyCode == 50) {	//2�� �ԷµǾ������
				speed-=5;
				System.out.println("���� �ӵ� : "+speed);
				
			}else if(keyCode == 51) {	//3�� �Է��������
				speed =0;
				System.out.println("���� : "+speed);
			}else {
				System.out.println("�Է� ���� : [1-3] �Է¿��");
			}
		}
		System.out.println("�ӵ� ���α׷� ����");	

		}
		
			
		

	}


