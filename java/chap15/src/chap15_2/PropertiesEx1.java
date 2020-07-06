package chap15_2;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.*;

public class PropertiesEx1 {

	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		String path = PropertiesEx1.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		pro.load(new FileReader(path));
		
		String driver = pro.getProperty("driver");
		String url=pro.getProperty("url");
		String id = pro.getProperty("username");
		String pw = pro.getProperty("password");
		
		System.out.println("드라이버 : "+driver+"\t url : "+url+"\t DB아이디 : "+id+"\t db암호 : "+pw);
		
		
	}

}
