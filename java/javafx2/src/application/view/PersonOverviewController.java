package application.view;

import application.*;
import application.model.*;
import application.util.DateUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;

public class PersonOverviewController {
	@FXML private TableView<Person> personTable;
	@FXML private TableColumn<Person, String> firstNameColumn;
	@FXML private TableColumn<Person, String> lastNameColumn;
	@FXML private Label firstNameLabel;
	@FXML private Label lastNameLabel;
	@FXML private Label streetLabel;
	@FXML private Label postalCodeLabel;
	@FXML private Label cityLabel;
	@FXML private Label birthdayLabel;
	
	private Main mainApp;
	public PersonOverviewController() {}
	@FXML
	private void initialize() {	//테이블뷰의 각셀에 firstName과 lastName 바운드 시키기,연락처 테이블의 두 열을 초기화
		firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
		lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());	
		 // 연락처 정보를 지운다.
	    showPersonDetails(null);

	    // 선택을 감지하고 그 때마다 연락처의 자세한 정보를 보여준다.
	    personTable.getSelectionModel().selectedItemProperty().addListener(
	            (observable, oldValue, newValue) -> showPersonDetails(newValue));
	
	}
	
	
	public void setMainApp(Main mainApp) {
		this.mainApp = mainApp;
		personTable.setItems(mainApp.getPersonData());
	}
	private void handleDeletePerson() {
		int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
		if(selectedIndex >= 0) {
			personTable.getItems().remove(selectedIndex);
		}else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("선택하지않음");
			alert.setHeaderText("목록에서 선택된 회원이 없습니다.");
			alert.setContentText("회원 목록에서 작업할 주소의 회원명을 선택해주세요");
		}
	}
	@FXML
	private void handleNewPerson() {	//회원 추가 이벤트
		Person tempPerson = new Person();
		boolean okClicked = mainApp.showPersonOverview(tempPerson);
		if(okClicked) {
			mainApp.getPersonData().add(tempPerson);
		}
		
	}
	@FXML
	private void handleEditPerson() {	//회원 편집 이벤트
		Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
		if(selectedPerson != null) {
			boolean okClicked = mainApp.showPersonEditDialog(selectedPerson);
			if(okClicked) {
				showPersonDetails(selectedPerson);
			}
		}else{
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("선택하지않음");
			alert.setHeaderText("목록에서 선택된 회원이 없습니다.");
			alert.setContentText("회원 목록에서 작업할 주소의 회원명을 선택해주세요");
			alert.showAndWait();
		
		}
	}
	
	private void showDetails(Person person) {
		if(person != null) {
			firstNameLabel.setText(person.getFirstName());
			lastNameLabel.setText(person.getLastName());
			streetLabel.setText(person.getStreet());
			cityLabel.setText(person.getCity());
			postalCodeLabel.setText(Integer.toString(person.getPostalCode()));
			birthdayLabel.setText(DateUtil.format(person.getBirthday()));
		}else {
			firstNameLabel.setText("");
			lastNameLabel.setText("");
			streetLabel.setText("");
			cityLabel.setText("");
			birthdayLabel.setText("");
		}
	}
	private void showPersonDetails(Person person) {
		if(person != null) {
			if(person != null) {
				firstNameLabel.setText(person.getFirstName());
				lastNameLabel.setText(person.getLastName());
				streetLabel.setText(person.getStreet());
				cityLabel.setText(person.getCity());
				birthdayLabel.setText(DateUtil.format(person.getBirthday()));
			}else {
				firstNameLabel.setText("");
				lastNameLabel.setText("");
				streetLabel.setText("");
				cityLabel.setText("");
				birthdayLabel.setText("");
			}
			
			
		}
	}
	
	
}
