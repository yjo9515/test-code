public class DataType_ex
{
	public static void main(String args [])
	{
		System.out.println("2.�떎�닔�삎");
		//�떎�닔�삎 : float�삎, double�삎
		//float: �냼�닔�젏�씠�븯 7�옄由ш퉴가吏� �몴�쁽媛��뒫
		//double: �냼�닔�젏�씠�븯 15~16�옄由ш퉴吏� �몴�쁽媛��뒫
		//�옄諛붿뿉�꽌�뒗 �떎�닔�뒗 臾댁“嫄� double �삎�쑝濡� �씤�떇�븳�떎.
		
		float ft = 2.456F;//媛믪쓣 double�삎�쑝濡쒖씤�떇�븯湲곕븣臾몄뿉 F,f瑜� �젒誘몄궗濡� �궗�슜
		
		System.out.println("ft = "+ft);
		float ft2 = 333;
		System.out.println("ft2 = "+ft2);
		
		// byte<short,char<int<long<float<double
		
		double db = 12.1111;
		System.out.println("db = "+db);
		
		double db2 = 0.2333E3; // 0.2333*10^3
		System.out.println("db2 = "+db2);
		
		double db3 = 233333333333.000012;
		// 0.233333333333000012E12
		System.out.println("db3= "+db3);
		
		System.out.println("3.臾몄옄�삎");
		char ch = '媛�';
		//char:0~65535, 2byte
		//c�뼵�뼱�뿉�꽌�뒗 1byte(ACII肄붾뱶), �옄諛붿뿉�꽌�뒗 �쑀�땲肄붾뱶泥닿퀎瑜� �궗�슜
		char ch2 = 'a';
		System.out.println("ch = "+ch);
		System.out.println("ch2 = "+ch2);
		char ch3 = '\u0041'; // 4*16^1+1*16^0=65 (16吏꾩닔 0~9,ABCDEF) 
		System.out.println("ch3 = "+ch3);
		System.out.println(ch3+1); //66
		
		System.out.println("4. �끉由ы삎");
		
		boolean bool = true; //True(x) False(x) [�냼臾몄옄瑜� �궗�슜�빐�빞�븿]
		System.out.println("bool = "+bool); //0,1 李멸굅吏� �몴�쁽�븷 �닔 �뾾�떎
		// �븯�굹�쓽 臾몄옄瑜� �벝�븧 �옉���뵲�샂�몴('), 臾몄옄�뿴�� �겙�뵲�샂�몴(")瑜� �궗�슜
		// + �뿰�궛�옄 �썝由� : 臾몄옄�뿴 + �뜲�씠�꽣���엯 >> 臾몄옄�뿴
		
		System.out.println("***李몄“�삎***");
		
		String str = "�븞�뀞�븯�꽭�슂"; //湲곕낯�삎�씠 �븘�땲�씪 李몄“�삎�씠�떎
		String str1 = new String("�븞�뀞�븯�꽭�슂");
		System.out.println(str);
		System.out.println(str1);
	}
}