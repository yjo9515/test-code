package chap11_15;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.text.MessageFormat;
import java.util.Date;

public class SimpleFormatEx1 {

	public static void main(String[] args) {

		double num = 3456789.9876543;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		df = new DecimalFormat("0.000");
		System.out.println(df.format(num));
		df = new DecimalFormat("########.##");
		System.out.println(df.format(num));
		df = new DecimalFormat("0.###");
		System.out.println(df.format(num));
		
		Date now = new Date();
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sd.format(now));
		sd = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sd.format(now));
		
		
		String id = "ksb450424";
		String name = "김기태";
		String tel = "010-3033-1004";
		
		String txt1="회원ID : {0} \n회원이름: {1} \n회원전화: {2}";
		String res1=MessageFormat.format(txt1, id, name, tel);
		System.out.println(res1);
		System.out.println();
		
		String sql = "insert into member values({0}, {1}, {2})";
//		Object[] arguments = {id, name, tel};
		Object[] arguments = {"'ksb450424'","'김기태'","'010-3033-1004'"};
		String res2 = MessageFormat.format(sql, arguments);
		System.out.println(res2);
		
	}

}
