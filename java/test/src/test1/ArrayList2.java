package test1;

public class ArrayList2<T> {

	private int size;
	private Object[] elem = new Object[5];
	
	public  void add(T value) {
		//요소 추가 메소드
		elem[size++]= value;
	}
	public T get(int idx) {
		//해당 번째의 데이터를 가져오는 메소드
		return (T) elem[idx];
	}
}
