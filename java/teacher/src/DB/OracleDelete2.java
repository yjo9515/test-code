package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class OracleDelete2 {
	public static void main(String[] args) {
		Connection conn = null;  //DB���� ������ ��� ��ü
		PreparedStatement pstm = null;  //SQL���� �����ϰ� ������ ��ü
		ResultSet rs = null;	//SQL������ ���� ����� ���� ��ü
		Scanner scn = new Scanner(System.in);
			System.out.println("������ ������ �����ȣ�� �Է� :");
			int sel = scn.nextInt();			
		try {		
			String query = "delete from emp where empno = "+sel;
			//String query = String.format("delete from emp where empno = %s", sel);
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			
			// 5. insert, update, delete�� ���� : executeUpdate();
			int result = pstm.executeUpdate();		

			query = "SELECT * FROM EMP ORDER BY EMPNO";
			pstm = conn.prepareStatement(query); //����� DB�� SQL��� ����
			rs = pstm.executeQuery(); //SQL���� ���� ����� ����	
			System.out.println("empno \tename \tjob \tmgr "
					+ "\thiredate \tsal \tcomm \tdeptno"); 
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				java.sql.Date hiredate = rs.getDate(5);
				int sal = rs.getInt(6);
				int comm = rs.getInt(7);
				int deptno = rs.getInt(8);
				
				String res = empno+"\t"+ename+"\t"+job+"\t"+mgr+
						"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno;
				System.out.println(res);
			}
		} catch(Exception e) {
			System.out.println("��ġ�ϴ� �����Ͱ� �����ϴ�.");
		} finally {
			try {
				if(rs != null) { rs.close(); }
				if(pstm != null) { pstm.close(); }
				if(conn != null) { conn.close(); }
			} catch(Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}

