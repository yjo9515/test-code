package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class OracleInsert2 {

	public static void main(String[] args) {
		Connection conn = null;  //DB���� ������ ��� ��ü
		PreparedStatement pstm = null;  //SQL���� �����ϰ� ������ ��ü
		ResultSet rs = null;	//SQL������ ���� ����� ���� ��ü
		Scanner scn = new Scanner(System.in);
			System.out.println("�����ȣ :");
			int no = scn.nextInt();
			System.out.println("����� : ");
			String irum = scn.next();
			System.out.println("���� : ");
			String jik = scn.next();
			System.out.println("�⺻�� : ");
			int emgr = scn.nextInt();
			System.out.println("�Ի��� : [YY-MM-DD]");
			String day = scn.next();
			System.out.println("�Ǹŷ� : ");
			int esal = scn.nextInt();
			System.out.println("�Ǹűݾ� : ");
			int comt = scn.nextInt();
			System.out.println("�μ��ڵ� : ");
			int dep = scn.nextInt();
		try {
			
			String query = String.format("insert into emp values("
					+"%s, '%s', '%s', %s, '%s', %s, %s, %s)", 
					no,irum,jik,emgr,day,esal,comt,dep); 
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
					
			//insert, update, delete�� ���� : executeUpdate();
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
			System.out.println("����� ó������ �ʾҽ��ϴ�.");
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
