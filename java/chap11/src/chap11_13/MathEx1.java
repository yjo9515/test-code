package chap11_13;

public class MathEx1 {

	public static void main(String[] args) {
		int v1 = Math.abs(-12);	//절댓값
		System.out.println(v1);
		double v2 = Math.ceil(6.25);	//올림
		double v3 = Math.ceil(-6.25);	//올림
		System.out.println(v2+", "+v3);
		
		double v4 = Math.floor(6.52);	//내림(버림)
		double v5 = Math.floor(-6.52);	
		System.out.println(v4+", "+v5);
		
		double v6 = Math.round(6.52);	//반올림
		double v7 = Math.round(-6.52);
		System.out.println(v6+", "+v7);

		int v8 = Math.max(6, 4);	//최대값, 최소값
		int v9 = Math.min(6, 4);
		System.out.println(v8+", "+v9);
		
		double v10 = Math.rint(6.52);	//가까운 정수를 구성
		double v11 = Math.rint(-6.52);
		
		System.out.println(v10+", "+v11);
		
		double v12 = Math.random(); //0~1 사이의 숫자 아무거나 
		
		System.out.println(v12);
		
	}

}
