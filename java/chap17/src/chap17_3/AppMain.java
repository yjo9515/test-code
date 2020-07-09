package chap17_3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Insets; // 배치방식
import javafx.collections.*;
import javafx.geometry.*;



public class AppMain extends Application{	//프로그램적 레이아웃

	@Override
	public void start(Stage primaryStage) throws Exception {
		//설정 사항 
		HBox hbox = new HBox(); //Hbox 컨테이너 생성
		hbox.setPadding(new Insets(10,10,10,10));	//Hbox 컨테이너 안 여백 설정
		hbox.setSpacing(10);	//컨트롤러들 간의 수평 간격
		
		TextField textField = new TextField();	//텍스트필드 설정
		textField.setPrefWidth(200);	//텍스트필드 폭 설정
		
		Button button = new Button();	//버튼 생성
		button.setText("확인"); 		//버튼 안의 글자 설정
		
		//hbox에 표시할 리스트 생성 및 추가
		ObservableList list = hbox.getChildren();	//hbox에 넣을 컨트롤을 목록으로 만들기
		list.add(textField);	//hbox에 넣을 textField를 목록에 추가
		list.add(button);		//hbox에 넣을 button을 목록에 추가
		
		
		Scene scene = new Scene(hbox);		//씬 생성후 hbox를 씬에 배치
		
		primaryStage.setTitle("App Test");		//대화 상자에 제목 넣기
		primaryStage.setScene(scene);			//각종 control이 배치된 list를 씬의 내용을 창에 배치
		primaryStage.show();					//배치된 내용을 화면에 표시
		
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
