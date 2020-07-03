package chap13;

public class Util {
	public static <T> Box3<T> boxing(T t){
		Box3<T> box = new Box3<T>();
		box.set(t);
		return box;	//반환타입을 Box3으로만 리턴시켜서 제한함
		
		
	}
}
