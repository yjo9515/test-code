package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App2 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("root2.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("메모장");
			primaryStage.setScene(scene);
			primaryStage.show();	}

		public static void main(String[] args) {
			
			launch(args);
		}

		
	}

	
	

