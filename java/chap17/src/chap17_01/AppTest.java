package chap17_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class AppTest extends Application {

	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			//stage > scene > container > control(node=태그)
			//포장할때는 역순으로
			Pane root = new Pane();
			Scene scene = new Scene(root, 400, 300);	//창크기
			primaryStage.setScene(scene);
			primaryStage.setTitle("창의 제목"); 	//창의 제목
			primaryStage.show(); 	//hide되어있던걸 나타냄
			primaryStage.setResizable(false); 	//창 크기 조절 안됨
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
