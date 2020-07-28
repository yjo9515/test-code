package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class OracleInt {
	public static void main(String[] args) {
		Connection conn = null;	//DB연결 정보를 담는 객체
		PreparedStatement pstm = null; //SQL문을 저장하고 전달할 객체
		ResultSet rs = null; //SQL문으로 나온 결과를 받을 객체
		Scanner scanner = new Scanner(System.in);
		System.out.println("사원번호을 입력받으시겠습니까?");
		int no = scanner.nextInt();
		System.out.println("이름을 입력받으시겠습니까?");
		String irum = scanner.next();
		System.out.println("직업을 입력");
		String jik = scanner.next();
		System.out.println("을 입력");
		int emgr = scanner.nextInt();
		System.out.println("날짜를 입력");
		String day = scanner.next();
		System.out.println("을 입력");
		int esal = scanner.nextInt();
		System.out.println("을 입력");
		int comt = scanner.nextInt();
		System.out.println("을 입력");
		int dep = scanner.nextInt();
		try {
			
			String query = String.format("insert into emp values(+"
					+ "%s, '%s, %s, %s, %s,%s,%s,%s)",no,irum,jik,emgr,day,esal,comt,dep);
			conn =DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			
			//insert, update, delete문 실행 : executeUpdate();
			int result = pstm.executeUpdate();
			
			
			
		}catch(Exception e) {
			
		}
	
		try {
			String query = "INSERT INTO EMP VALUES(7,'yun',4)";
			pstm.executeUpdate(query);
			
			query = "SELECT * FROM EMP";
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
		
		try {
			 String query = "insert into emp values(?,?,?,?,?,?,?,?)";
			 conn = DBConnection.getConnection();
			 pstm= conn.prepareStatement(query);
			 
			 pstm.setInt(1, no);
			 pstm.setString(2, irum);
			 pstm.setString(3, jik);
			 pstm.setInt(4, emgr);
			 pstm.setString(5, day);
			 pstm.setInt(6, esal);
			 pstm.setInt(7, comt);
			 pstm.setInt(8, dep);
			 
			 //insert, update, delete문 실행 : executeUpdate();
			 int result = pstm.executeUpdate();
			 
			 query = "SELECT * FROM EMP ORDER BY EMP";
			 
		}catch(Exception e) {
			
		}
}
}