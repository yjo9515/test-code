package chap16_1;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.*;
import java.io.*;

public class StreamEx2 {
	public static int tot;
	public static void main(String[] args) {
		String[] str = {"정하늘","이수아","서지원","박상민","윤준오"};
		Stream<String> strSt = Arrays.stream(str);	//배열로부터 스트림얻기
		strSt.forEach(s -> System.out.println(s + ", "));	
		//스트림 얻기 = 데이터명을 얻는다.
		IntStream st1 = IntStream.rangeClosed(1, 10);	//숫자범위로부터 스트림얻기
		st1.forEach(a -> tot+=a);
		System.out.println("1~10 합계 : "+tot);
		
//		Path p = Paths.get("src/chap16/chap16_1/student.txt");
//		Stream<String> st2;
//		st2 = Files.lines(p, Charset.defaultCharset()); //파일로부터 스트림얻기
//		Stream<Path> st3 = Files.list(p); //디렉토리로부터 스트림얻기

	}

}
