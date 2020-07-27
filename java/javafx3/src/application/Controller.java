package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {


	
	@FXML
	private MenuItem btnLogin;
	

	public void login(ActionEvent event) {
		try {
			Parent login =FXMLLoader.load(getClass().getResource("view/login.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.setTitle("로그인");
			primaryStage.show();
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
	
		
	}
	public void newmem(ActionEvent event)  {
		try {
			Parent newmem =FXMLLoader.load(getClass().getResource("view/newmem.fxml"));
			Scene scene = new Scene(newmem);
			Stage primaryStage = new Stage();
//			Stage primaryStage = (Stage)newmem.getScene().getWindow();
			primaryStage.setScene(scene);
			primaryStage.setTitle("회원가입");
			primaryStage.show();
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
   
	public void order(ActionEvent event) {
		try {
			Parent order =FXMLLoader.load(getClass().getResource("view/purchase.fxml"));
			Scene scene = new Scene(order);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.setTitle("주문");
			primaryStage.show();
			
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	public void community(ActionEvent event) {
		Parent order;
		try {
			order = FXMLLoader.load(getClass().getResource("view/review.fxml"));
			Scene scene = new Scene(order);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.setTitle("리뷰");
			primaryStage.show();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
