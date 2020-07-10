package chap17_5;
// 이벤트와 관련된 인터페이스와 클래스를 불러오기
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class RoofController implements Initializable {
	@FXML private Button btn1;	//(컨트롤 주입)인식하기위한 연결
	@FXML private Button btn2;
	@FXML private Button btn3;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		이벤트 핸들러 정의
//		btn1.setOnAction(new EventHandler<ActionEvent>{
//			@Override
//			public void handle(ActionEvent event) {
//				handleBtn1Action(event);	//이벤트 호출
//				
//				
//			}
//			
//		});
		btn1.setOnAction(event -> handleBtn1Action(event));	
		btn2.setOnAction(event -> handleBtn2Action(event));	//람다식 표기법
		btn3.setOnAction(event -> handleBtn3Action(event));
	}
//		이벤트 핸들러의 실제 처리내용 기술
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼1이 클릭됨");		
		}
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼2가 클릭됨");
	}
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼3가 클릭됨");
	}
	
}
