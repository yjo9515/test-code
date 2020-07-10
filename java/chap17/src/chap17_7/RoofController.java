package chap17_7;
// 이벤트와 관련된 인터페이스와 클래스를 불러오기
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.beans.binding.Bindings;	//컨트롤의 데이터를 메모리로 불러와 붙이는 클래스

public class RoofController implements Initializable {
	@FXML private TextArea textArea1;	//(컨트롤 주입)인식하기위한 연결
	@FXML private TextArea textArea2;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Bindings.bindBidirectional(textArea1.textProperty(),textArea2.textProperty());
		
		
	}
	
	
	

		
	}

	
