package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class OracleTest2 {
	
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
	try {String query = "update emp set sal = ? where empno = ?";
		conn = DBConnection.getConnection();
		pstm = conn.prepareStatement(query);
		
		
		
	}catch (Exception e) {
		
	}	
		
		
	}
}
