package chap08;

public class InterfaceEx1 implements InterfaceTest3 {
    int b = a; //���⼭ a�� InterfaceTest1�� ��� ���� a �̴�.
    
    //InterfaceTest1,2,3�� ��� �޼��带 ��������� �Ѵ�.
    @Override
    public void method1() { /* ����1 */
          System.out.println(a);
    }
    @Override
    public void method2() { /* ����2 */
          System.out.println(a);}

    @Override
    public void method3() { /* ����3 */
          System.out.println(a);  }
	public static void main(String[] args) {
		InterfaceEx1 itf1 = new InterfaceEx1(); 
		itf1.method1();
		itf1.method2();
		itf1.method3();
	}
}
