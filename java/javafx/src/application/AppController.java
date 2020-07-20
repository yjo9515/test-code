package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class AppController implements Initializable {

	@FXML Label label1;
	@FXML TextField field1;
	@FXML Button btn1;
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
		
	}
	
	
	
}
