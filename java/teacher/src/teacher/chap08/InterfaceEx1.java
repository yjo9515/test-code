package chap08;

public class InterfaceEx1 implements InterfaceTest3 {
    int b = a; //여기서 a는 InterfaceTest1의 멤버 변수 a 이다.
    
    //InterfaceTest1,2,3의 모든 메서드를 구현해줘야 한다.
    @Override
    public void method1() { /* 구현1 */
          System.out.println(a);
    }
    @Override
    public void method2() { /* 구현2 */
          System.out.println(a);}

    @Override
    public void method3() { /* 구현3 */
          System.out.println(a);  }
	public static void main(String[] args) {
		InterfaceEx1 itf1 = new InterfaceEx1(); 
		itf1.method1();
		itf1.method2();
		itf1.method3();
	}
}
