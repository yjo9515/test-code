package chap10_3;

public class FileInputStream implements AutoCloseable{

private String file;

public FileInputStream(String file) {
	this.file = file;
	
}
public void read() {
	System.out.println(file + "을 읽습니다.");
}

@Override
public void close() throws Exception{ //강제 예외 실행
	System.out.println(file + "을 닫습니다."); //
	
}

}
