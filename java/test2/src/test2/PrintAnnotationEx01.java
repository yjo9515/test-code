package test2;

import java.lang.reflect.Method;

public class PrintAnnotationEx01 {

	public static void main(String[] args) {
		//Service 클래스에 선언된 메소드를 얻는 리플렉션 부분
		Method[] declareMethods = Service.class.getDeclaredMethods();

		for(Method method : declareMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				System.out.println("["+method.getName()+"]");
				for(int i=0;i<printAnnotation.number(); i++) {
					
					System.out.println(printAnnotation.value());
					
					
				}
					System.out.println();
				
			}
			
	
		}
	}

}
