package chap13;
import java.util.Arrays;
public class WildEx {

public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+"수강생 : "+Arrays.toString(course.getStudents()));

	}
public static void registerCourseStudent(Course<? extends Student>course) {
	System.out.println(course.getName() + "수강생 : "
			+Arrays.toString(course.getStudents()));
}
public static void registerCourseWorker(Course<? super Worker>course) {
	System.out.println(course.getName() + "수강생 : "
			+Arrays.toString(course.getStudents()));
}

public static void main(String []args) {
	
	Course<Person> personCourse = new Course<Person>("일반인반",5);
	personCourse.add(new Person("김병석"));
	personCourse.add(new Worker("윤준오"));
	personCourse.add(new Student("백유안"));
	personCourse.add(new HighStudent("최민석"));
	
	Course<Worker> workerCourse = new Course<Worker>("직장인반", 4);
	workerCourse.add(new Worker("윤재섭"));
	
	Course<Student> studentCourse = new Course<Student>("학생만", 20);
	studentCourse.add(new Student("진재승"));
	studentCourse.add(new Student("진재승"));
	
	Course<HighStudent> highCourse = new Course<HighStudent>("고등학생만", 30);
	highCourse.add(new HighStudent("김찬호"));
	
	registerCourse(personCourse);
	registerCourse(workerCourse);
	registerCourse(studentCourse);
	registerCourse(highCourse);
	
	System.out.println();
	
//	registerCourseStudent(workerCourse);
//	registerCourseStudent(personCourse);
	registerCourseStudent(studentCourse);
	registerCourseStudent(highCourse);
	System.out.println();


	
	
	
}


}
