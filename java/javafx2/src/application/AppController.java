package application;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;


public class AppController implements Initializable {

	@FXML Label label1;
	@FXML TextField field1;
	@FXML Button btn1;
	@FXML ListView<String> list1;
	@FXML public void doAction(ActionEvent ev) {
		String str = field1.getText();
		str = "당신이 쓴 글은"+str+"입니다";
		label1.setText(str);
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction((ActionEvent) ->{
			String str = field1.getText();
			str = "당신이 쓴 글은 "+str+" 이것입니다. ";
			label1.setText(str);
					
		});
		list1.setItems(FXCollections.observableArrayList());
		list1.getItems().addAll("하나","둘","셋");
		list1.getItems().add("넷");
		list1.setOnMouseClicked((MouseEvent)->{//리스트 클릭 이벤트
			Object obj = list1.getSelectionModel().getSelectedItem();
			label1.setText(obj.toString());
		});
		btn1.setOnAction((ActionEvent)->{//버튼 ㅌ출력 이벤트
		String obj = list1.getSelectionModel().getSelectedItem();
		label1.setText("당신은"+obj+"를 선택하였습니다.");
		});
		}
		
	}
	
	
	

