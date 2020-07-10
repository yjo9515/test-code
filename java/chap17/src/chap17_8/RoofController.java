package chap17_8;
// 이벤트와 관련된 인터페이스와 클래스를 불러오기
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.beans.binding.Bindings;	//컨트롤의 데이터를 메모리로 불러와 붙이는 클래스

public class RoofController implements Initializable {
	@FXML private AnchorPane box;	//(컨트롤 주입)인식하기위한 연결
	@FXML private Circle circle;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(box.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(box.widthProperty(), 2));
		}		
	}

	
