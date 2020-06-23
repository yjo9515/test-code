package test2;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME) //RUNTIME
@Target(METHOD)
public @interface PrintAnnotation {
	
	String value() default "-"; //값
	int number() default 15; //값의 반복횟수
	
	
	
}
