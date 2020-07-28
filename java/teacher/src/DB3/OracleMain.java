package DB3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class OracleMain {
	String driver = "oracle.jdbc.driver.OracleDriver"; 
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static void main(String[] args) {
		int cmdNo = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("");
			System.out.println("원하는 메뉴를 선택하십시오.");
			System.out.println("1.조회 2.수정 3.삭제 4.입력 5.종료");
			cmdNo = scan.nextInt();
			if (cmdNo == 1) {
				OracleMain select = new OracleMain(); // 메소드 클래스의 객체 생성
				select.selectMethod(); // 메소드 클래스의 조회 메소드 실행
			}
			else if (cmdNo == 2) {
				OracleMain update = new OracleMain();
				update.updateMethod(); // 메소드 클래스의 수정 메소드 실행
			}

			else if (cmdNo == 3) {
				OracleMain delete = new OracleMain();
				delete.deleteMethod(); // 메소드 클래스의 삭제 메소드 실행
			} else if (cmdNo == 4) {
				OracleMain insert = new OracleMain();
				insert.insertMethod(); // 메소드 클래스의 입력 메소드 실행
			} else {
				scan.close();
				break;
			}			
		}
	}
	public void selectMethod() {        // 조회 메소드 (SELECT)
		String sql = "SELECT * FROM REVIEW";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "yjo", "1234");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			while (rs.next()) {
				String id = rs.getString("ID");  
				String contents = rs.getString("CONTENTS");
				int list = rs.getInt("LIST");				
				System.out.println(id + "\t" + contents + "\t" + list);}
		}		
		catch (Exception e) {System.out.println(e.getMessage());}
		finally {
			try {rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}
	}

	public void updateMethod() {      // 수정 메소드 (UPDATE)	
		String sql = "UPDATE REVIEW SET TITLE = ?, CONTENTS = ? WHERE BDNO = ?";			
		Connection con = null;
		PreparedStatement pstmt = null;	
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "yjo", "1234");
			pstmt = con.prepareStatement(sql);

			System.out.printf("수정할 글번호 입력: ");
			int bdno = scan.nextInt();
			System.out.printf("수정할 글제목 입력: ");
			String title = scan.next();			
			System.out.printf("수정할 글내용 입력: ");
			String contents = scan.next();			

			pstmt.setString(1, title);
			pstmt.setString(2, contents);			
			pstmt.setInt(3, bdno);
			int cnt = pstmt.executeUpdate(); 
			System.out.println(cnt + "건이 실행되었습니다.");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {				
				pstmt.close();
				con.close();
			} catch (Exception e) {
			}
		}
	}

		
	public void deleteMethod() {        // 삭제 메소드 (DELETE)
		String sql = "DELETE FROM NOTICE WHERE BDNO = ?";
		int bdno = 0;		
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "ezen", "1234");
			pstmt = con.prepareStatement(sql);			
			System.out.println("삭제할 글번호를 입력하시오");
			bdno = scan.nextInt();			
			pstmt.setInt(1, bdno);
			int cnt = pstmt.executeUpdate(); 
			System.out.println(cnt);
		}
		catch (Exception e) {System.out.println(e.getMessage());}
		finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {
			}
		}
	}	

	public void insertMethod() {	        // 입력 메소드 (INSERT)
		String sql = "INSERT INTO REVIEW(BDTYPE,TITLE,CONTENTS,AUTHOR) VALUES(?, ?, ?, ?)";			
		Connection con = null;
		PreparedStatement pstmt = null;	
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "ezen", "1234");
			pstmt = con.prepareStatement(sql);			
			System.out.printf("입력할 게시판종류: ");
			String bdtype = scan.next();
			System.out.printf("입력할 글제목: ");
			String title = scan.next();			
			System.out.printf("입력할 글내용: ");
			String contents = scan.next();
			System.out.printf("입력할 작성자: ");
			String author = scan.next();	

			pstmt.setString(1, bdtype);
			pstmt.setString(2, title);
			pstmt.setString(3, contents);
			pstmt.setString(4, author);
			int cnt = pstmt.executeUpdate(); 
			System.out.println(cnt + "건이 실행되었습니다.");			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {
				
			}
		}
	}
}

