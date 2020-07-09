package chap17_4;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain2 extends Application{

	@Override
	public void init() throws Exception {
		System.out.println("어플리케이션을 시작합니다");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//기본 레이아웃 설정 및 root ,fxml 생성 및 연결
		Parent root2 = FXMLLoader.load(getClass().getResource("root2.fxml"));
		Scene scene = new Scene(root2);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	@Override
	public void stop() throws Exception {
		System.out.println("종료되었습니다.");
	}

	public static void main(String[] args) {
		
		launch(args);
	}

}
