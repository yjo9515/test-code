//연산자
/*
 * 여러문장을
 * 주석처리할때 
 */
public class Opreator_ex {
	
	public static void main(String [] args)
	{
		System.out.println("1. 산술 연산자");
		int a = 100;
		
		System.out.println(a%7); //나머지 연산자
		
		//쉬프트 연산자 >>, <<, (>>>:자바에만 있는 연산자)
		// 1) >> (오른쪽으로 주어진 비트 수만큼 이동)
		//          앞에 비어있는 빈칸은 부호비트로 채운다
		// 2) << (왼쪽으로 주어진 비트 수만큰 이동)
		//          뒤에 비어있는 빈칸은 0으로 채운다
		// 3) >>>(오른쪽으로 주어진 비트 수만큼 이동하라)
		//           앞에 비어있는 빈칸은 0으로 채운다
		
		System.out.println("-6 >> 2 = "+(-6 >> 2));
		System.out.println("-6 >> 2 = "+(-6 >>> 2));
		System.out.println("-6 << 2 = "+(-6 << 2));
	
		
		System.out.println("2.논리 연산자  (비트 연산자)");
		int b = 3;
		int c = 5;
		
		System.out.println("b And c = " +(b&c));
		System.out.println("b OR c = " +(b|c));
		System.out.println("b XOR c = " +(b^c));
		
		// &&(그리고), ||(or) (조건 연산자)
		
		int mm = 30;
		int nn = 5;
		
		if((mm>nn)&&(mm>10))
			System.out.println("참 입니다");
		else
			System.out.println("거짓입니다");
		
		if((mm>nn)||(mm>10)) //둘 중 하나가 참이면 참
			System.out.println("참 입니다");
		else
			System.out.println("거짓입니다");
	
		System.out.println("3. 비교연산자");
		int m = 1000, n = 200;
		
		/* 비교연산 a>b(a가 b보다큰),<=(작거나 같은), >=(크거나 같은),
		 * <(보다작은),==(a와 b가같은)
		 * != (a와 b가 서로 같지 않은)
		 * if(m>n) System.out.println("m은 n보다 크다."); else
		 * System.out.println("m은 n보다 작거나 같다.");
		 */
		if(m>n)
			System.out.println("m은 n보다 크다.");
		else 
			System.out.println("m은 n보다 작거나 같다.");
		
		if(m!=n)
			System.out.println("m과 n은 같지 않다.");
		else
			System.out.println("m과 n은 같다.");
		
		System.out.println("4. 삼항연산자");
		int aa=100, bb=200;
		
		//변수 = (조건)? 값1: 값2; [조건이 참이면 값1, 조건이 거짓이면 값2]
		
		int result =(aa>bb)? aa: bb;
		
		System.out.println("result = " + result);
		
		String str = (aa>bb)? "aa는 bb보다 크다": "aa는 bb보다 작거나 같다";
		
		System.out.println("str = "+str);
		
		System.out.println("5. 대입연산자");
		
		int ii = 10;
		ii+=10; //ii=ii+10; 보다 연산속도가 빠르다
		
		int jj = 10;
		jj -=3; //jj=jj-3;
		jj *=2; //jj=jj*2;
		
		int x = 5;
		x <<=2; // x=x<<2;
		
		int y = 3; // 3=0011 
		y ^=2; // y=y^2;  [XOR 연산 서로다른 비트인 경우에 값이 1이 된다]

		System.out.println("ii= " +ii);
		System.out.println("jj= " +jj);
		System.out.println("x= " +x);
		
		System.out.println("6. 단항 연산자");
		// ++, -- 증감 연산자
		// +,- 부호 연산자
		
		int xx = 10 , yy = 20;
		System.out.println(+xx);
		System.out.println(-xx);
		
		int k = 10;
		byte kk = 20;
		
		k++; //k=k+1;
		kk--; //kk=kk-1;
		
		System.out.println("k=" +k);
		System.out.println("kk= " +kk);
		
		int cc = 10;
		int dd =++cc; //cc값을 먼저 증가시키고 다음에 dd에 대입을 한다.
		
		System.out.println("cc= "+cc);
		System.out.println("dd= " +dd);
		
		cc = 10;
		int ee = cc++; // 대입을 먼저한후 cc값을 증가시킨다.
		System.out.println("cc= " +cc);
		System.out.println("ee= " +ee);
		
		// 비트별 not 연산자 : ~
		
		int gg = 0xfffffff3;
		System.out.println("~gg =" +~gg);
		
		// 논리부정 연산자 : !
		boolean bool = true;
		
		System.out.println(!bool);
		System.out.println(!(100>200));
		
		
		
	}

}
