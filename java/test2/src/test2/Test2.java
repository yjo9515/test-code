package test2;
//방법2 : import com.ezen.javapg1.*;
import com.ezen.javapg1.*;
public class Test2 {

	public static void main(String[] args) {
		//방법1 : com.ezen.javapg1.Student st1 = new com.ezen.javapg1.Student();
		//방법3 : 라이브러리 - jar로 불러오기
//			[Package Explorer]에서 해당 프로젝트를 선택하고
//			마우스 오른쪽 클릭
//			해당 메뉴에서 [Export]를 하고
//			[Select] 대화상자에서 [Java]-[JAR File]을 선택
//			[다음]버튼을 누르면 대화상자에 패키지명과 동일하게 jar파일명을 입력
//			JAR File을 생성
//		1) [Package Explorer]에서 불러올 위치의 프로젝트 폴더에서 마우스 오른쪽 단추
//		2) 나오는 해당 메뉴에서 [Build Path]-[Configure Build Path]를 클릭 
//		3) [Libraries]탭의 [Add External Jars]버튼을 눌러 해당 JAR파일을 선택
//		4) [Package Explorer]에서 [Referenced Libraries] 폴더를 펼치면
//			해당 패키지안에 클래스가 있으면, 그 클래스를 도큐먼트 창으로 드래그하여 나오는
//			[Attach Source] 버튼을 눌러 소스를 연결한다.
//		가장중요(시험에 나옴)
		
	Student st1 = new Student();
//	st1.name = "윤준오";
	
	}

}
