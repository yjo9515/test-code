package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

import application.model.*;
import application.view.PersonOverviewController;

public class Main extends Application {
	private Stage primaryStage;
	private BorderPane rootLayout;
// Model 데이터 처리를 위한 데이터 구조 생성
	private ObservableList<Person> personData = FXCollections.observableArrayList();
	public Main() {	//생성자를 활용하여 샘플 데이터 생성
		personData.add(new Person("윤","준오"));
		personData.add(new Person("윤","재섭"));
		personData.add(new Person("김","병석"));
		personData.add(new Person("육","현석"));
		personData.add(new Person("최","성호"));
		personData.add(new Person("김","홍경"));
		
	}
	
	
	
	public ObservableList<Person> getPersonData() {
		return personData;
	}



	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("주소록");
		initRootLayout();	//메인 레이아웃 함수 호출
		showPersonOverview();
		
	}
		
	public void initRootLayout() {	//RootLayout.fxml = 메인 레이아웃 띄우기
		
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showPersonOverview() {	//App.fxml = 주소록 요약정보표시화면
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/App.fxml"));
			HBox personOverview = (HBox) loader.load();
			rootLayout.setCenter(personOverview);
//			PersonOverviewController controller = loader.getController();
//			controller.setMainApp(this);
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	public Stage getPrimaryStage() {
		return primaryStage;
	}
}
