package chap13;

public class BoxEx2 {

	public static void main(String[] args) {
		Box2<String> bx2 =new Box2<String>();	//type까지 전달
		bx2.set("김기태");
		String str = bx2.get(); // 캐스팅 과정이 필요없다.
		
		Box2<Integer> bx3 = new Box2<Integer>();
		bx3.set(1004);
		int val = bx3.get();
		//기본타입의 경우 실수(Float, Double)는 별도의 소수점 조정과정이 필요하므로 해당 클래스에서
		//메소드 오버로딩이 필요함(객체 타입일 경우도 마찬가지)		
		//여러 개의 객체타입인 경우 묶는 과정이 필요함
		Box2<Float> bx4 = new Box2<Float>();
		bx4.set(3.14f);
		
		
		
	}

}
