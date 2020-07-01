package chap11_14;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();	//자동으로 임포트
		
		int year = now.get(Calendar.YEAR);	//열거형 상수
		int month = now.get(Calendar.MONTH)+1;	//0~11밖에 저장하지 않으므로 1을 더함
		int day = now.get(Calendar.DAY_OF_MONTH);	//DAY_OF_MONTH
		
		int week = now.get(Calendar.DAY_OF_WEEK);	//DAY_OF_WEEK
		String str1 = null;

		switch(week)	{
		case Calendar.SUNDAY:
			str1 = "일";
			break;
		case Calendar.MONDAY:
			str1 = "월";
			break;
		case Calendar.TUESDAY:
			str1 = "화";
			break;
		case Calendar.WEDNESDAY:
			str1 = "수";
			break;
		case Calendar.THURSDAY:
			str1 = "목";
			break;
		case Calendar.FRIDAY:
			str1 = "금";
			break;
		case Calendar.SATURDAY:
			str1 = "토";
			break;
		default:
			str1 = "없는요일";
	}
		
		int am_pm = now.get(Calendar.AM_PM);
		String str2 = null;
		if(am_pm == Calendar.AM) {
			str2 = "오전";
		}else {
			str2 = "오후";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year+"년"+month+"월"+day+"일 ("+str1+")");
		System.out.println(str2+" "+hour+"시"+minute+"분"+second+"초");
		
		
		
		String[] availId = TimeZone.getAvailableIDs();
		for(String id : availId) {
			System.out.println(id);
			
			
			
		}
		
		
	}
}

	

