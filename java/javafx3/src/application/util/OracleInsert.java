package application.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnection;

public class OracleInsert {

	public static void main(String[] args) {
		Connection conn = null;	//DB연결 정보를 담는 객체
		PreparedStatement pstm = null; //SQL문을 저장하고 전달할 객체
		ResultSet rs = null; //SQL문으로 나온 결과를 받을 객체

		String id = userid;
		String name = username;
		
		
		
try {
			
			String query = String.format("insert into mem( id,name,password,jumin) values(?,?,?,?)");
			conn =DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			
			
			pstm.setString(1, id);
			
			
			//insert, update, delete문 실행 : executeUpdate();
			int result = pstm.executeUpdate();
			
			
			
		}catch(Exception e) {
			
		}
	}

}
