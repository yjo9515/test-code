package test1;

public class ArrayList {	//배열을 객체로 다루기 위한 클래스

	private int size;
	private Object[] elem = new Object[5];
	
	public void add(Object value) {
		//요소 추가 메소드
		elem[size++]= value;
	}
	public Object get(int idx) {
		//해당 번째의 데이터를 가져오는 메소드
		return elem[idx];
	}
}
