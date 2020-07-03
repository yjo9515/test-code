package chap13;

public class BoxEx3 {
	public static void main(String[] args) {	//제한 클래스 static Util을 사용
		Box3<Integer> box1 = Util.<Integer>boxing(100);
		int val = box1.get();
		System.out.println("값 : "+val);
		
		Box3<String>box2 = Util.boxing("김기태");		//언박싱 : 규정하지 않은 박싱
		String str = box2.get();
		System.out.println("문자값 : "+str);
	}

}
