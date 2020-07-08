package chap05;
import java.util.Calendar;


public class WeekEnum01 {

	public static void main(String[] args) {
		Week today = null; //enum 타입의 객체변수 선언
Calendar cal = Calendar.getInstance(); //Calender 타입의 cal 인스턴스 생성
int week = cal.get(Calendar.DAY_OF_WEEK); //1~7

switch(week) {
	case 1:
		today = Week.SUNDAY; 
		break;
	case 2:
		today = Week.MONDAY; break;
	case 3:
		today = Week.TUESDAY; break;
	case 4:
		today = Week.WEDNESDAY; break;
	case 5:
		today = Week.THURSDAY; break;
	case 6:
		today = Week.FRIDAY; break;
	case 7:
		today = Week.SATURDAY; break;
		
		
}
System.out.println("오늘 요일 : "+today);

	}

}
