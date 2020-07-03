package chap13;

public class LimitedTypeEx1 {

	public static void main(String[] args) {
//		String str = Util3.compare("a", "b");
		int res1 = Util3.compare(1004, 2004);
		System.out.println(res1);

		int res2 = Util3.compare(3.14, 3);
		double res3 =Util3.compare(3.14, 3);
		int data = 10;
		data = Util3.compare(data, 10);
		
		
		System.out.println(res2+" : "+res3+" : "+data);
		
	}

}
