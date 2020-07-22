package application.view;

import application.model.Person;
import application.util.DateUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class PersonEditDialogController {

	
	
	@FXML private TextField firstNameField;
	@FXML private TextField lastNameField;
	@FXML private TextField cityField;
	@FXML private TextField birthdayField;
	
	private Stage dialogStage;
	private Person person;
	private boolean okClicked = false;
	
	@FXML
	private void initialize() {
		
	}
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	public void setPerson(Person person) {	//저장된 데이터를 각 컨트롤에 표시
		this.person = person;
		firstNameField.setText(person.getFirstName());
		lastNameField.setText(person.getLastName());
		cityField.setText(person.getCity());
		birthdayField.setText(DateUtil.format(person.getBirthday()));
		birthdayField.setPromptText("dd.mm.yyyy");
		
	}
	
	public boolean isOkClicked() {	//현재 대화상자에서 ok버튼을 눌렀는지 비교
		return okClicked;
	}
	
	@FXML
	public void handleOk() {	//대화상자에서 Person객체로 입력된 데이터 저장
		if(isInputValid()) {
			person.setFirstName(firstNameField.getText());
			person.setLastName(lastNameField.getText());
			person.setCity(firstNameField.getText());
			person.setBirthday(DateUtil.parse(firstNameField.getText()));
			
			okClicked = true;
			dialogStage.close();
		}
		

	}
	@FXML
	private void handleCancle() {	//취소버튼에 대한 이벤트
		dialogStage.close();
		
	}
	private boolean isInputValid() {	//입력 검증 메소드
		String errorMessage = "";
		if(firstNameField.getText() == null || firstNameField.getText().length() == 0) {
			errorMessage += "이름을 입력하지 않았습니다.";
		}
		if(firstNameField.getText() == null || lastNameField.getText().length() == 0) {
			errorMessage += "성을 입력하지 않았습니다.";
		}
		if(cityField.getText() == null || cityField.getText().length() == 0) {
			errorMessage += "추가 도시를 입력하지 않았습니다.";
		}
		if(birthdayField.getText()==null || birthdayField.getText().length()==0) {
			errorMessage += "생년월일을 입력하지 않았습니다.";
		}
		
		if(errorMessage.length() == 0) {
			return true;
		}else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(dialogStage);
			return false;
		}
		
	}
	
	
}
