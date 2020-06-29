package chap11_6;

import java.lang.reflect.*; //reflect=서브패키지

public class ClassEx1 {

	public static void main(String[] args) {
		Car car = new Car();	//Class 클래스
		Class cla = car.getClass();
		System.out.println(cla.getName());
		System.out.println(cla.getSimpleName());
		System.out.println(cla.getPackage().getName());
		System.out.println();
		
		try {
			Class cla2 = Class.forName("chap11.Car");
			System.out.println(cla2.getName());
			System.out.println(cla2.getSimpleName());
			System.out.println(cla2.getPackage().getName());
			
			System.out.println("\n"+"+ 생성자 정보");
			Constructor[] con = cla2.getDeclaredConstructors();
			
			for(Constructor cons : con) {
				System.out.println(cons.getName());
				Class[] para = cons.getParameterTypes();
				printParameters(para);	//함수
				System.out.println();
				
			}
			
		
		System.out.println("\n"+"필드 정보");
		Field[] fields = cla2.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName()+" : "+field.getType().getSimpleName());
			
		}
		System.out.println("\n"+"메소드 정보");
		Method[] methods = cla2.getDeclaredMethods();
				for(Method method : methods) {
				System.out.println(method.getName());	
				}
		}
		catch(ClassNotFoundException e) {
			System.out.println("해당하는 클래스가 없습니다.");
			e.printStackTrace();
		}
		

		
	}
	private static void printParameters(Class[] para) {
		for(int i=0;i<para.length; i++){
			System.out.println(para[i].getName());
		}
		
	}
	
}
