package test1;

import com.test.kim.bulidTest.YongbuildTest;
import java.util.Scanner;

public class Test {



	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
		
		
//		System.out.println("이름 : ");
//		String name = sc.nextLine();
//		System.out.println("국어 : ");
//		int kor = sc.nextInt();
//		System.out.println("영어 : ");
//		int eng = sc.nextInt();
//		System.out.println("수학 : ");
//		int mat = sc.nextInt();
//		int tot = kor+eng+mat;
//		float avg =(float)tot/3;
//		char hak ='A';
// 		int num=1;
		int num=0;
		String name="";
		int jum[] = {0,0,0};
		while(true){
			num++;
			System.out.print("이름: ");
			name = sc.next();

			for(int i = 0 ; i <jum.length; i++) {
			System.out.print("jum["+i+"]: ");
			jum[i]=sc.nextInt();
			}
			YongbuildTest yunjunoh = new YongbuildTest(num,name,jum[0],jum[1],jum[2]);
		
			yunjunoh.getInfo();
			
		}

		
	}
	
	
	
	
	
}
