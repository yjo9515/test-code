package chap17_3;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.fxml.FXMLLoader;


public class AppMain2 extends Application {	//fxml을 이용한 레이아웃

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("App Test2");
		primaryStage.setScene(scene);
		
		
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);

	}



}
