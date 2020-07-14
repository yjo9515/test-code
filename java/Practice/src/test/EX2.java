package test;

public class EX2 {

	public static void main(String[] args) {
		int i;
		int j;
		int a,b,d,e;
		float c;
//		a = i+j; 객체가아닌 변수에 값을 저장을안하고 연산하면 에러
		int k=200;
		int z=15;
		a = k + z;
		b = k - z;
		c = (float) k / (float)z;	//연산 결과의 자동 형변환
		d = k * z;
		e = k % z;
		System.out.println("k+z="+a);
		System.out.println("k-z="+b);
		System.out.println("k/z="+c);
		System.out.println("k*z="+d);
		System.out.println("k%z="+e);
		System.out.println("\n 증감연산자");
		System.out.println(b++);	//출력 185, 값 186 --> 후위 연산
		System.out.println(++b); 	//출력 187, 값 187 --> 전위 연산
		System.out.println(b--);	//1씩 감소
		System.out.println(--b);	//1씩 감소
		System.out.println("\n 대입연산자");
		System.out.println(b+=2);	//2씩증가
		System.out.println(b-=3); 	//3씩감소
		System.out.println(b*=2); 	//2씩 곱하기
		System.out.println(b/=2); 	//2씩 나누기
		System.out.println(b%=2); 	//2씩 나머지
		System.out.println(b=190); 	//대입 연산자
		System.out.println("\n 비교 연산자");
		System.out.println(a==b); 	//비교 연산자
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a<b);
		System.out.println(b % 2 == 0);
		System.out.println("\n 논리연산자");
		System.out.println(a > b && a > c);
		System.out.println(a > b || a > c);
		System.out.println("\n 비트연산자");
		System.out.println(a >> 2);
		System.out.println(a << 3);
		System.out.println(a & b);
		System.out.println(a | b);
		
		boolean h=true;
		int m = 10;
		String n = new String("SBS");
		String o = "MBC";
		class OBJ{
			int abc = 123;
		}
		OBJ obj = new OBJ();
		
		System.out.println("\n 단항 연산자");
		System.out.println(-m+" : 부호연산자");
		System.out.println(!h+" : Not(논리부정)연산자");
		System.out.println(~m+" : 비트전환연산자");
		
		System.out.println("\n 기타연산자");
		System.out.println(a>b ? a : b+" : 삼항연산자");
		System.out.println(obj instanceof OBJ);
		System.out.println(n instanceof String);
		System.out.println(o instanceof String);
		System.out.println(" : 객체타입검증연산자");
	}

}
