package Login_Register;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DatabaseController implements Initializable {
	@FXML
	private AnchorPane login;
	@FXML
	private TextField name;
	@FXML
	private TextField id;
	@FXML
	private PasswordField pwd;
	@FXML
	private Button membersBtn;
	@FXML
	private Button cancelBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void cancelAction(ActionEvent event) {
		try {
			Parent members = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(members);
			// Stage primaryStage = new Stage();
			Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			primaryStage.setTitle("Two");
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// StackPane root = (StackPane) cancelBtn.getScene().getRoot();
		// root.getChildren().remove(login);
	}

	public void membersAction(ActionEvent event) {
		String uId = id.getText();
		String uPwd = pwd.getText();
		String uName = name.getText();
		if (uName == null || uId == null || uPwd == null || uName.equals("") || uId.equals("") || uPwd.equals("")) {

		} else {
			// MySQL 접속 경로, 기본 포트는 3306, DB명
			String jdbcUrl = "jdbc:mysql://localhost:3306/javafx?characterEncoding=UTF-8&serverTimezone=UTC";
			// MySQL 계정
			String dbId = "root";
			// MySQL 계정 비밀번호
			String dbPw = "rladncjf1!";
			Connection conn = null;
			PreparedStatement pstmt = null;

			new DatabaseController();
			String id = uId;
			String pwd = uPwd;
			String name = uName;

			try {
				Class.forName("com.mysql.jdbc.Driver");
				// 디비 연결
				conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
				String sql = "INSERT INTO USER(userID, userPassword, userName) VALUES(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, uId);
				pstmt.setString(2, uPwd);
				pstmt.setString(3, uName);
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (pstmt != null)
					try {
						pstmt.close();
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
				if (conn != null)
					try {
						conn.close();
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
			}
			try {
				Parent members = FXMLLoader.load(getClass().getResource("Login.fxml"));
				Scene scene = new Scene(members);
				// Stage primaryStage = new Stage();
				Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				primaryStage.setTitle("Two");
				primaryStage.setScene(scene);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}