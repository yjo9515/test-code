package test2;
//어노테이션의 정의는 @interface 이므로 정의부만 있고, 값 대입부는 없지만, 기본값은 설정이 가능
public @interface An1 {	//어노테이션 이름은 An1
	String eleName();
	int eleNum() default 19;
	
	
	
	
}
