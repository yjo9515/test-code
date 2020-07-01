package chap11_16;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TimeEx1 {

	public static void main(String[] args) throws InterruptedException {
		
		LocalDate curDate = LocalDate.now();	//오늘 날짜 호출하여 저장
		LocalDate tarDate = LocalDate.of(2020, 7, 24);	//날짜 데이터 정의
		
		LocalTime curTime = LocalTime.now(); //현재 시간을 호출하여 저장
		LocalTime tarTime = LocalTime.of(15, 30, 27);
		
		LocalDateTime curDateTime = LocalDateTime.now();
		LocalDateTime tarDateTime = LocalDateTime.of(2020, 7, 24, 15, 30, 27);
		
		
		ZonedDateTime seoulTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		ZonedDateTime newyorkTime = ZonedDateTime.now(ZoneId.of("America/Newyork"));
		
		System.out.println("현재 날짜 : "+curDate);
		System.out.println("목표 날짜 : "+tarDate);
		System.out.println("현재 시간 : "+curTime);
		System.out.println("목표 시간 : "+tarTime);
		System.out.println("현재 서울 시간 : "+seoulTime);
		
		Instant ins1 = Instant.now();	//현재 시간의 스탬프
		Thread.sleep(10);
		Instant ins2 = Instant.now();	//10 밀리초 후에 현재 시간의 스탬프
		if(ins1.isBefore(ins2)) {	//ins1이 ins2보다 빠른지 비교
			System.out.println("ins1이 더 빠릅니다.");
		}	else if(ins1.isAfter(ins2)) {
			System.out.println("ins2가 더 빠릅니다.");
		} else {
			System.out.println("ins1과 ins2가 동일합니다.");
		}
		//나노세컨 = 밀리세컨*1000000
		System.out.println("시간차이(nanos) : "+ins1.until(ins2, ChronoUnit.NANOS));
		
		String prtDate = curDate.getYear()+"년";
		prtDate += curDate.getMonthValue()+"월";
		prtDate += curDate.getDayOfMonth()+"일";
		
		
		
	}

}
