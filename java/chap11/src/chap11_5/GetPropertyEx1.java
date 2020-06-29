package chap11_5;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx1 {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String javaHome = System.getenv("JAVA_HOME");
		
		System.out.println("운영체제 이름 : "+osName);
		System.out.println("사용자 이름 : "+userName);
		System.out.println("사용자 홈디렉토리 : "+userHome);
		
		
		System.out.println();
		System.out.println("------ 항목 출력 ------");
		System.out.println();
		Properties prop = System.getProperties();
		Set keys = prop.keySet(); //해당되는 키(항목 이름 = 맴버필드)만 불러옴
		for(Object objKey : keys) {
			String key = (String) objKey;
			String val = System.getProperty(key);	//해당되는 키(항목 이름)의 값만 저장
			System.out.println(key+" : "+val);
			
		}
		System.out.println("JAVA_HOME의 환경 변수 : "+javaHome);
	}

}
