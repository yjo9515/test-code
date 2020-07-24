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
import javafx.stage.Stage;

public class Controller {


	
	@FXML
	private MenuItem btnLogin;
	
	public void login(ActionEvent event) {
		
	
		
	}
	public void newmem(ActionEvent event)  {
		try {
			Parent newmem =FXMLLoader.load(getClass().getResource("view/Newmem.fxml"));
			Scene scene = new Scene(newmem);
			Stage primaryStage = (Stage)newmem.getScene().getWindow();
			primaryStage.setScene(scene);
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	public void order(ActionEvent event) {
		
	}
	public void community(ActionEvent event) {
		
	}
	
	
	
	
	
}
