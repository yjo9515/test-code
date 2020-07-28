package Login_Register;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	@FXML
	private TextField id;
	@FXML
	private PasswordField pwd;
	@FXML
	private Button RegisterBtn;
	@FXML
	private Button loginBtn;
	@FXML
	private Button exit;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		RegisterBtn.setOnAction(e -> RegisterAction(e));
		loginBtn.setOnAction(e -> loginAction(e));

	}

	public void RegisterAction(ActionEvent event) {
		try {

			Parent members = FXMLLoader.load(getClass().getResource("Register.fxml"));
			Scene scene = new Scene(members);
			// Stage primaryStage = new Stage();
			Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			primaryStage.setTitle("Two");
			primaryStage.setScene(scene);
			// primaryStage.show();
			// StackPane root = (StackPane) RegisterBtn.getScene().getRoot();
			// root.getChildren().add(members);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loginAction(ActionEvent event) {
		String uId = id.getText();
		String uPwd = pwd.getText();
		// MySQL ���� ���, �⺻ ��Ʈ�� 3306, DB��
		String jdbcUrl = "jdbc:mysql://localhost:3306/javafx?characterEncoding=UTF-8&serverTimezone=UTC";
		// MySQL ����
		String dbId = "root";
		// MySQL ���� ��й�ȣ
		String dbPw = "rladncjf1!";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);

			sql = "select userID,userPassword from user where userID = ? and userPassword = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uId);
			pstmt.setString(2, uPwd);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString("userID").equals(uId) && rs.getString("userPassword").equals(uPwd)) {
					try {
						Parent members = FXMLLoader.load(getClass().getResource("Main.fxml"));
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt != null) try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(rs != null) try {rs.close();} catch (SQLException e) {e.printStackTrace();}
		}

	}
}