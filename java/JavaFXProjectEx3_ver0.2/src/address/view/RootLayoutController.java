package address.view;

import java.io.File;

import address.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;

/**
 * 상위 레이아웃에 대한 컨트롤러이다.
 * 상위 레이아웃은 메뉴바와 JavaFX 엘리먼트가 
 * 들어갈 공간을 포함한 기본적인 레이아웃을 제공한다.
 * **/
public class RootLayoutController {
	
	// 메인 어플리케이션 참조
	private MainApp mainApp;
	
	/**
	 * 참조를 다시 유지하기 위해 메인 어플리케이션이 호출한다.
	 * 
	 * @param mainApp
	 * **/
	public void setMainApp(MainApp mainApp) { this.mainApp = mainApp;}
	
	/**
	 * New
	 * 비어 있는 주소록을만든다.
	 * **/
	@FXML
	private void handleNew() {
		mainApp.getPersonData().clear();
		mainApp.setPersonFilePath(null);
	}
	
	/**
	 * Open
	 * FileChooser을 열어서 사용자가 가져올 주소록을 선택하게 한다.
	 * **/
	@FXML
	private void handleOpen() {
		FileChooser fileChooser = new FileChooser();
		
		// 확장자 필터를 설정한다.
		FileChooser.ExtensionFilter extFilter = 
				new FileChooser.ExtensionFilter("XML files (*.xml)","*.xml");
		fileChooser.getExtensionFilters().add(extFilter);
		
		// Save File Dialog를 보여준다.
		File file = fileChooser.showOpenDialog(mainApp.getPrimaryStage());
		
		if(file != null) {
			mainApp.loadPersonDataFromFile(file);
		}
	}
	
	/**
	 * Save
	 * 현재 열려 있는 파일에 저장한다.
	 * 만일 열려 있는 파일이 없으면 "save as" 다이얼로그를 보여준다.
	 * **/
    @FXML
    private void handleSave() {
        File personFile = mainApp.getPersonFilepath();
        if (personFile != null) {
            mainApp.savePersonDataToFile(personFile);
        } else {
            handleSaveAs();
        }
    }
	
	/**
	 * Save As
	 * FileChooser을 열어서 사용자가 저장할 파일을 선택하게 한다.
	 * **/
	@FXML
	private void handleSaveAs() {
		FileChooser fileChooser = new FileChooser(); 
			
		// 확장자 필터를 설정한다.
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml");
		fileChooser.getExtensionFilters().add(extFilter);
		
		// Save File Dialog를 보여준다.
		File file = fileChooser.showSaveDialog(mainApp.getPrimaryStage());
		
		if(file != null) {
			// 정확한 확장자를 가져야 한다.
			if (!file.getPath().endsWith(".xml")) {
				file = new File(file.getPath()+".xml");
			}
			mainApp.savePersonDataToFile(file);
		}
	}
	
	/**
	 * About
	 * About 다이얼 로그를 보여준다.
	 * **/
	@FXML
	private void handleAbout() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("AddressApp");
		alert.setHeaderText("About");
		alert.setContentText("Author: Marco jakob\nsite : http://code.makery.ch");
		
		alert.showAndWait();
	}
	
	/**
	 * Exit
	 * 어플리케이션을 닫는다.
	 * **/
	@FXML
	private void handleExit() {
		System.exit(0);
	}
}
