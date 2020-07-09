package chap17_2;
import javafx.application.Application;
import javafx.stage.Stage;
public class AppMain extends Application {
	public AppMain() {
		System.out.println(Thread.currentThread().getName()+" 쓰레드에 대한 AppMain() 호출 : ");
		
	}
	
	@Override
	public void init() throws Exception {
		System.out.println("쓰레드가 초기화되었습니다.");
	}

	@Override
	public void stop() throws Exception {
		System.out.println("쓰레드가 정지되었습니다.");
		super.stop();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("쓰레드가 시작되었습니다.");
		primaryStage.show();
		
	}


	public static void main(String[] args) {
		launch(args);

	}

}
