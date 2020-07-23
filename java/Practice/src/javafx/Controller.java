package javafx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Controller implements Initializable {

	@FXML MenuItem mi;
	@FXML ScrollBar sb;
	@FXML TextArea textarea;
	FileChooser fileChooser = new FileChooser(); //파일저장열기 파일과 관련된 컨트롤러
	private Window primaryStage;
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	public void newview1 (ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("새로만들기");
		alert.setContentText("현재 파일을 저장하고 , 새로운 파일을 만드시겠습니다.");
		Optional<ButtonType> result = alert.showAndWait();
		if(result.get() == ButtonType.OK ) {
			//저장하고 textarea 비우기
			fileChooser.getExtensionFilters().add(new ExtensionFilter ("*.txt", "*.*"));
			File selectedFile = fileChooser.showSaveDialog(primaryStage); 
			
			if(selectedFile != null) {
				System.out.println(selectedFile.getPath()+"에 저장합니다.");
			}else {
				
				textarea.setText(" ");
			}	
		}
		
	}
	public void newview2 (ActionEvent event) {
		
		
	}
	public void open (ActionEvent event) {
		
		
	}
	@FXML
	private void save () {
//		Alert alert = new Alert(AlertType.CONFIRMATION);
//		alert.setTitle("저장");
//		alert.setContentText("저장하시겠습니까?");
		//처음 저장하는지 여부 판단
		try {//처음 저장시 showSaveDialog, 저장된 파일명 가져오기
			File savfile = fileChooser.showSaveDialog(textarea.getScene().getWindow());
			if(savfile != null) {//저장된 파일명이 있으면 파일에 덮어쓰기
				FileWriter writer = new FileWriter(savfile);
				writer.write(textarea.getText().replace("\n", "\r\n"));
				writer.close();
			}else {	//저장되어 있지않으면 다른이름으로저장이벤트 핸들 실행
				othersave();
			}		
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		//현재 파일명과 똑같은 파일형태로 추가내용만 갱신하여 저장
		
		
	}
	@FXML
	private void othersave () {
		fileChooser.setInitialFileName("noname01.txt"); //기본 저장파일명 설정
		fileChooser.getExtensionFilters().add(new ExtensionFilter("All file","*.*"));
		File selectedFile = fileChooser.showSaveDialog(primaryStage);
		
		if(selectedFile != null) {
			System.out.println(selectedFile.getPath());
		}
	}
	public void option (ActionEvent event) {
		
		
	}
	public void print (ActionEvent event) {
		PrinterJob printer = PrinterJob.createPrinterJob(Printer.getDefaultPrinter());
		
		if (printer != null) {
			boolean sucess = printer.showPageSetupDialog(primaryStage);
			if(sucess) {
				printer.endJob();
			}
			
		}
		System.out.println(Printer.getAllPrinters());
		
	}
	public void quit (ActionEvent event) {
		
		System.exit(0);	//끝내기
		
	}
	
}
