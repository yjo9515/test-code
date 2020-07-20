package javafx;




import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.*;

public class App1 extends Application {
	Label label;
	TextField field;
	Button button, sliderBtn;
	CheckBox check;
	Label lbSel1;
	Label lbSel2;
	Label lbSel3;
	Label lbSel4;
	RadioButton radio1;
	RadioButton radio2;
	ComboBox<String> combo;
	Slider slider;
	
	
	
	public static void main(String[]args) {
		launch(args);
		
	}
	// stage > scene > container(pannel)> control(element)

	@Override
	public void start(Stage stage) throws Exception {
		label = new Label("javaFx~");
		field = new TextField();
		button = new Button("확인");
		
		//액션 이벤트 등록 및 처리내용
		button.setOnAction((ActionEvent)->{
			String msg = field.getText()+"를 타이핑하였습니다.";
			label.setText(msg);
		});
	
		check = new CheckBox("체크박스");
		 lbSel1 = new Label();
		//체크 박스와 이벤트 등록 및 처리 내용
		check.setOnAction((ActionEvent)->{
			lbSel1.setText(check.isSelected() ? "선택되었습니다" : "선택되지않았습니다");
		});
		
		VBox box2 = new VBox();
		box2.getChildren().add(lbSel1);
		box2.getChildren().add(check);
		box2.setPadding(new Insets(10,10,10,10));
		
		radio1 = new RadioButton("남자");
		radio2 = new RadioButton("여자");
		lbSel2 = new Label("선택해주세요");
		radio2.setSelected(true);
		radio1.setOnAction((ActionEvent)->{
			radio1.setSelected(true);
			radio2.setSelected(false);
			lbSel2.setText("남자를 선택하였습니다.");
		});
		radio2.setOnAction((ActionEvent)->{
			radio2.setSelected(true);
			radio1.setSelected(false);
			lbSel2.setText("여자를 선택하였습니다.");
		});
		
		HBox box3 = new HBox();
		box3.getChildren().addAll(lbSel2, radio1, radio2);
		box3.setPadding(new Insets(10,10,10,10));
		box3.setPrefSize(300, 100);
		
		lbSel3 = new Label();
		ObservableList<String> data = FXCollections.observableArrayList("1","2","3");
		combo = new ComboBox<String>(data);
		combo.setOnAction((ActionEvent) -> {
			lbSel3.setText(combo.getValue()+"를선택하였습니다.");
		});
		FlowPane box4 = new FlowPane();
		box4.getChildren().add(lbSel3);
		box4.getChildren().add(combo);
		box4.setPadding(new Insets(10));
		box4.setPrefHeight(300);;
		
		lbSel4 = new Label();
		slider = new Slider(0,100,70);//처음,끝,초기값(디폴트)
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setSnapToTicks(true);
		sliderBtn = new Button("슬라이더 값은?");
		sliderBtn.setOnAction((ActionEvent) -> {
			lbSel4.setText("슬라이더 값 : "+slider.getValue());
		});
		HBox box5 = new HBox();
		box5.getChildren().addAll(lbSel4,slider,sliderBtn);
		box5.setPrefSize(400, 300);
		box5.setPadding(new Insets(10));
		
		
		BorderPane pane = new BorderPane(); //1차 컨테이너 생성
		FlowPane box1 = new FlowPane();	//2차 컨테이너 생성
		box1.setPadding(new Insets(5,8,9,7)); //2차 컨테이너 패딩 설정
		box1.setMaxSize(600, 200);  //2차 컨테이너의 최대 크기 설정
		box1.setMinSize(600, 200);  //2차 컨테이너의 최소 크기 설정
		box1.getChildren().add(label);	//1) 2차 컨테이너에 컨트롤 추가
		box1.getChildren().add(field);
		box1.getChildren().add(button);
		box1.setMargin(label, new Insets(20));	//컨트롤의 마진을 설정
		
		box1.setPrefSize(500,100); //2) 2차 컨테이너 크기 설정
		pane.setTop(box1);	//3) 1차 컨테이너에 2차 컨테이너 추가
		pane.setLeft(box2);
		pane.setCenter(box3);
		pane.setRight(box4);
		pane.setBottom(box5);
		Scene scene = new Scene(pane, 1100, 600); //4) 씬에 1차 컨테이너를 추가
		stage.setScene(scene); //5) 스테이지에 씬을 추가
		stage.show();
		
		
	}
	
}
