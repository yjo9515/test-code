package db;

import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleTest1 {

	public static void main(String[] args) {
		//DB 접속을 위해 반드시 필요한 내용
		// 1. 드라이버 로딩
		String driver ="oracle.jdbc.driver.OracleDriver";
		// 2. 접근주소
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// 3. 아이디와 패스워드
		String user = "scott";
		String password = "tiger";
		try {
			Class.forName(driver);	//드라이버 로딩
			System.out.println("jdbc 드라이버 로딩 성공");
			DriverManager.getConnection(url, user, password);
			System.out.println("오라클 연결 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}catch(SQLException e) {
			System.out.println("오라클 구문이 올바르지않거나 연결이 되지않음");
		}catch(Exception e) {
			System.out.println("알 수 없는 예외가 발생하였음");
			e.printStackTrace();
		}
	}

}
