package chap17_6;
// 이벤트와 관련된 인터페이스와 클래스를 불러오기
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Font;	//폰트 변경 관련 클래스
import javafx.beans.value.ChangeListener;	//값이나 크기를 변경
import javafx.beans.value.ObservableValue;	//값이나 크기를 인식
public class RoofController implements Initializable {
	@FXML private Slider slider;	//(컨트롤 주입)인식하기위한 연결
	@FXML private Label label;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider.valueProperty().addListener(new ChangeListener<Number>(){

			@Override
			public void changed(ObservableValue<? extends Number>
			observable, Number oldValue, Number newValue) {
				label.setFont(new Font(newValue.doubleValue()));
				
			}	//2) 감지하여 레이블에 폰트 값을 변경함
		});	//1) 슬라이더를 드래그하여 값이바뀌면
		
	}

	
}
