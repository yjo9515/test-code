package chap07;

public class Tire extends Rubber {
	int num;
	//Rubber r1 = new Rubber();
	//Tire t1 = r1;  
	//��Ӱ��迡�� ����� ���� �ٸ��Ƿ� 
	//����ȯ�� �Ͼ�� ����
	//Ŭ���� ����� ������ �ν��Ͻ�
	Rubber flTire = new Rubber();  
	Rubber frTire = new Rubber();
	Rubber blTire = new Rubber();
	Rubber brTire = new Rubber();
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	void run() { System.out.println("���ư�"
			+ " �ø���~!");}
}









