package test1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date1 {
	public static void main(String[] args) {
		Date now1 = new Date();
		System.out.println(now1);

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 7); //특정 월의 일을 저장
		
		Date now2 = cal.getTime();	//특정 날짜와 시간데이터로 변경하여 날짜 생성
		System.out.println(now2);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //0~11
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"년"+month+"월"+day+"일");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String sDate = sdf.format(now2);
		System.out.println(sDate);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.DAY_OF_MONTH, 20);
		int res = cal.compareTo(cal2);
		System.out.println(res);
		
		
		
		
	}

}
