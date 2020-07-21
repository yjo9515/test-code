package application.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtil {
	/* 날짜 패턴 상수 선언 */
	private static final String DATE_PATTERN = "dd.MM.yyyy";
	/* 날짜 형식 변환 선언 */
	private static final DateTimeFormatter DATE_FORMATTER = 
			DateTimeFormatter.ofPattern(DATE_PATTERN);
	
	//형식 비교
	public static String format(LocalDate date) {
		if(date == null) {
			return null;
		}
		return DATE_FORMATTER.format(date);
	}
	
	//날짜 형식의 데이터를 문자열로 변환
	public static LocalDate parse(String localDate) {
		try {
			return DATE_FORMATTER.parse(localDate, LocalDate::from);
		} catch(DateTimeParseException e) {
			return null;
		}
	}
	
	public static boolean validDate(String dateString) {
		return DateUtil.parse(dateString) != null;
	}
}





