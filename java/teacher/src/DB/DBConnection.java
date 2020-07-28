package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection dbConn;
	public static Connection getConnection() {
		Connection conn = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			Class.forName(driver);
			System.out.println("����̹��� �ùٸ��� �ε��Ǿ����ϴ�.");
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("�����ͺ��̽��� �ùٸ��� ����Ǿ����ϴ�.");
		} catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����~!!!");
		} catch(SQLException e) {
			System.out.println("�����ͺ��̽� ���� ����~!!!");
		} catch(Exception e) {
			System.out.println("�� �� ���� ����");
			e.printStackTrace();
		}
		return conn;
	}
}


