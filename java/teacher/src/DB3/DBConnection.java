package DB3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection dbConn;
	public static Connection getConnection() {	//getConnection을 새롭게 재정의
		Connection conn = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "yjo";
			String pw = "1234";
			Class.forName(driver);
			System.out.println("드라이버가 올바르게 로딩되었습니다.");
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스가 올바르게 연결되었습니다.");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패~");
		}catch(SQLException e) {
			System.out.println("데이터베이스 로딩 실패");
			
		}catch(Exception e) {
			System.out.println("알 수 없는 에러");
			e.printStackTrace();
		}
		return conn;
		
		
		
	}
}
