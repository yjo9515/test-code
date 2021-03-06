package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OracleSelect1 {

	public static void main(String[] args) {
		Connection conn = null;	//DB연결 정보를 담는 객체
		PreparedStatement pstm = null; //SQL문을 저장하고 전달할 객체
		ResultSet rs = null;
		
		try {
			String query = "SELECT * FROM EMP";
			conn = DBConnection.getConnection(); //DB연결
			pstm = conn.prepareStatement(query); //연결된 db로 sql 명령 전달
			rs = pstm.executeQuery(); //sql문의 실행 결과를 저장
			System.out.println("empno \t ename \t job \t hiredate\t");
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				java.sql.Date hiredate = rs.getDate(5);
				int sal = rs.getInt(6);
				int comm = rs.getInt(7);
				int deptno = rs.getInt(8);
				
				String res = empno+"\t"+ename+"\t"+job+"\t"+mgr+"\t"+
				hiredate+"\t"+sal+"\t"+comm+"\t"+deptno;
				System.out.println(res);		
			}
		}catch(Exception e) {
			System.out.println("제대로 처리되지 않았습니다.");
		}finally {
			try {
				if(rs != null) {rs.close();}
				if(pstm != null) {pstm.close();}
				if(conn != null) {conn.close();}
				
				
			}catch(Exception e) {
				throw new RuntimeException(e.getMessage());
			}
			
		}
		
		

	}

}
