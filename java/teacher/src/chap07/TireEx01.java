package chap07;

public class TireEx01 {
	public static void main(String[] args) {
		Rubber rb1 = new Rubber();
		Tire tire1 = new Tire();
		Rubber rb2 = tire1;	
		//�ڵ� ����ȯ - ��Ӱ��迡�� �θ� ���� �ڵ� ����ȯ (O)
		//Tire tire2 = rb1;	
		//�ڵ� ����ȯ - ��Ӱ��迡�� �ڽĿ� ���� �ڵ� ����ȯ (X)
		//Hammer h1 = tire1;  
		//�ڵ� ����ȯ - �ٸ� Ŭ�������� ���� �ڵ� ����ȯ(��);
		
		int abc=12;
		char n='A';
		abc = n;  //�⺻�� �ڵ� ����ȯ
		abc = (int) n;	//�⺻�� ���� ����ȯ
		
		Tire myTire = new Tire();
		myTire.flTire = new Rubber();  
		//Ŭ���� ������ �ν��Ͻ� Ȱ��
		myTire.blTire = new Rubber();
		myTire.run();
	}
}